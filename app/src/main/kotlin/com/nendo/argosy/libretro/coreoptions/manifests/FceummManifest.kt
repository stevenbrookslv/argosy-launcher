package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object FceummManifest : CoreOptionManifest {
    override val coreId = "fceumm"
    override val options = listOf(
        CoreOptionDef(
            key = "fceumm_region",
            displayName = "Region",
            values = listOf("Auto", "NTSC", "PAL", "Dendy"),
            defaultValue = "Auto"
        ),
        CoreOptionDef(
            key = "fceumm_aspect",
            displayName = "Preferred Aspect Ratio",
            values = listOf("8:7 PAR", "4:3"),
            defaultValue = "8:7 PAR"
        ),
        CoreOptionDef(
            key = "fceumm_palette",
            displayName = "Color Palette",
            values = listOf(
                "default", "asqrealc", "nintendo-vc", "rgb", "yuv-v3",
                "unsaturated-final", "sony-cxa2025as-us", "pal", "bmf-final2",
                "bmf-final3", "smooth-fbx", "composite-direct-fbx",
                "pvm-style-d93-fbx", "ntsc-hardware-fbx", "nes-classic-fbx-fs",
                "nescap", "wavebeam", "raw", "custom"
            ),
            defaultValue = "default"
        ),
        CoreOptionDef(
            key = "fceumm_up_down_allowed",
            displayName = "Allow Opposing Directions",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "fceumm_overscan_h",
            displayName = "Crop Overscan (Horizontal)",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "fceumm_overscan_v",
            displayName = "Crop Overscan (Vertical)",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "fceumm_nospritelimit",
            displayName = "No Sprite Limit",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "fceumm_sndvolume",
            displayName = "Sound Volume",
            values = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"),
            defaultValue = "7"
        ),
        CoreOptionDef(
            key = "fceumm_sndquality",
            displayName = "Sound Quality",
            values = listOf("Low", "High", "Very High"),
            defaultValue = "Low"
        ),
        CoreOptionDef(
            key = "fceumm_swapduty",
            displayName = "Swap Duty Cycles",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "fceumm_turbo_enable",
            displayName = "Turbo Enable",
            values = listOf("None", "Player 1", "Player 2", "Both"),
            defaultValue = "None"
        ),
        CoreOptionDef(
            key = "fceumm_turbo_delay",
            displayName = "Turbo Delay (in frames)",
            values = listOf("1", "2", "3", "5", "10", "15", "30", "60"),
            defaultValue = "3"
        ),
        CoreOptionDef(
            key = "fceumm_zapper_mode",
            displayName = "Zapper Mode",
            values = listOf("lightgun", "touchscreen", "mouse"),
            defaultValue = "lightgun"
        ),
        CoreOptionDef(
            key = "fceumm_show_crosshair",
            displayName = "Show Crosshair",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "fceumm_overclocking",
            displayName = "Overclocking",
            values = listOf("disabled", "2x-Postrender", "2x-VBlank"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "fceumm_ramstate",
            displayName = "RAM Power Up State",
            values = listOf("FF", "00", "random"),
            defaultValue = "FF"
        ),
        CoreOptionDef(
            key = "fceumm_ntsc_filter",
            displayName = "NTSC Filter",
            values = listOf("disabled", "composite", "svideo", "rgb", "monochrome"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "fceumm_show_adv_system_options",
            displayName = "Show Advanced System Options",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "fceumm_show_adv_sound_options",
            displayName = "Show Advanced Sound Options",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        )
    )
}
