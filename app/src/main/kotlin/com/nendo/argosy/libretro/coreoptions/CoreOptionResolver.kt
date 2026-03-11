package com.nendo.argosy.libretro.coreoptions

import com.nendo.argosy.data.local.dao.CoreOptionOverrideDao
import com.swordfish.libretrodroid.Variable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoreOptionResolver @Inject constructor(
    private val coreOptionOverrideDao: CoreOptionOverrideDao
) {
    suspend fun resolveVariables(coreId: String): Array<Variable> {
        val manifest = CoreOptionManifestRegistry.getManifest(coreId)
            ?: return emptyArray()
        val overrides = coreOptionOverrideDao.getOverridesForCore(coreId)
            .associate { it.optionKey to it.value }

        return manifest.options.mapNotNull { option ->
            val userOverride = overrides[option.key]
            val hasArgosyOverride = option.defaultValue != option.coreDefault
            when {
                userOverride != null -> Variable(key = option.key, value = userOverride)
                hasArgosyOverride -> Variable(key = option.key, value = option.defaultValue)
                else -> null
            }
        }.toTypedArray()
    }
}
