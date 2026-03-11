package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object Cap32Manifest : CoreOptionManifest {
    override val coreId = "cap32"
    override val options = listOf(
        CoreOptionDef(
            key = "cap32_autorun",
            displayName = "Autorun",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "cap32_combokey",
            displayName = "Combo Key",
            values = listOf("select", "y", "b", "disabled"),
            defaultValue = "select"
        ),
        CoreOptionDef(
            key = "cap32_resolution",
            displayName = "Internal Resolution",
            values = listOf("384x272", "400x300"),
            defaultValue = "384x272"
        ),
        CoreOptionDef(
            key = "cap32_model",
            displayName = "Model",
            values = listOf("6128", "464", "6128+"),
            defaultValue = "6128"
        ),
        CoreOptionDef(
            key = "cap32_ram",
            displayName = "RAM Size",
            values = listOf("128", "64", "192", "576"),
            defaultValue = "128"
        ),
        CoreOptionDef(
            key = "cap32_statusbar",
            displayName = "Status Bar",
            values = listOf("onloading", "enabled", "disabled"),
            defaultValue = "onloading"
        ),
        CoreOptionDef(
            key = "cap32_floppy_sound",
            displayName = "Floppy Sound",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "cap32_scr_tube",
            displayName = "Monitor Type",
            values = listOf("color", "green", "white"),
            defaultValue = "color"
        ),
        CoreOptionDef(
            key = "cap32_scr_intensity",
            displayName = "Monitor Intensity",
            values = listOf("5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"),
            defaultValue = "5"
        ),
        CoreOptionDef(
            key = "cap32_lang_layout",
            displayName = "CPC Language",
            values = listOf("english", "french", "spanish"),
            defaultValue = "english"
        ),
        CoreOptionDef(
            key = "cap32_retrojoy0",
            displayName = "User 1 Joystick Configuration",
            values = listOf("joystick", "qaop", "incentive"),
            defaultValue = "joystick"
        ),
        CoreOptionDef(
            key = "cap32_retrojoy1",
            displayName = "User 2 Joystick Configuration",
            values = listOf("joystick", "qaop", "incentive", "joystick_port2"),
            defaultValue = "joystick"
        ),
    )
}
