package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object NestopiaManifest : CoreOptionManifest {
    override val coreId = "nestopia"
    override val options = listOf(
        CoreOptionDef(
            key = "nestopia_blargg_ntsc_filter",
            displayName = "Blargg NTSC Filter",
            values = listOf("disabled", "composite", "svideo", "rgb", "monochrome"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "nestopia_palette",
            displayName = "Palette",
            values = listOf(
                "cxa2025as", "consumer", "canonical", "alternative", "rgb",
                "pal", "composite-direct-fbx", "pvm-style-d93-fbx",
                "ntsc-hardware-fbx", "nes-classic-fbx-fs", "raw", "custom"
            ),
            defaultValue = "cxa2025as"
        ),
        CoreOptionDef(
            key = "nestopia_nospritelimit",
            displayName = "Remove Sprite Limit",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "nestopia_overclock",
            displayName = "CPU Speed (Overclock)",
            values = listOf("1x", "2x"),
            defaultValue = "1x"
        ),
        CoreOptionDef(
            key = "nestopia_select_adapter",
            displayName = "4 Player Adapter",
            values = listOf("auto", "ntsc", "famicom"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "nestopia_fds_auto_insert",
            displayName = "FDS Auto Insert",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "nestopia_overscan_v",
            displayName = "Mask Overscan (Vertical)",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "nestopia_overscan_h",
            displayName = "Mask Overscan (Horizontal)",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "nestopia_aspect",
            displayName = "Preferred Aspect Ratio",
            values = listOf("auto", "ntsc", "pal", "4:3"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "nestopia_genie_distortion",
            displayName = "Game Genie Sound Distortion",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "nestopia_favored_system",
            displayName = "System Region",
            values = listOf("auto", "ntsc", "pal", "famicom", "dendy"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "nestopia_ram_power_state",
            displayName = "RAM Power-on State",
            values = listOf("0x00", "0xFF", "random"),
            defaultValue = "0x00"
        ),
        CoreOptionDef(
            key = "nestopia_turbo_pulse",
            displayName = "Turbo Pulse Speed",
            values = listOf("2", "3", "4", "5", "6", "7", "8", "9"),
            defaultValue = "2"
        )
    )
}
