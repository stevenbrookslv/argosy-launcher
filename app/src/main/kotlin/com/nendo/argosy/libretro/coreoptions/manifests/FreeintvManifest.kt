package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object FreeintvManifest : CoreOptionManifest {
    override val coreId = "freeintv"
    override val options = listOf(
        CoreOptionDef(
            key = "default_p1_controller",
            displayName = "Default Player 1 Controller (Restart)",
            values = listOf("left", "right"),
            defaultValue = "right"
        ),
        CoreOptionDef(
            key = "freeintv_multiscreen_overlay",
            displayName = "Onscreen Interactive Keypad Overlays (Restart)",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
    )
}
