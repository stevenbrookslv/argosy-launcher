package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object MgbaManifest : CoreOptionManifest {
    override val coreId = "mgba"
    override val options = listOf(
        CoreOptionDef(
            key = "mgba_gb_model",
            displayName = "Game Boy Model",
            values = listOf(
                "Autodetect", "Game Boy", "Super Game Boy",
                "Game Boy Color", "Super Game Boy Color", "Game Boy Advance"
            ),
            defaultValue = "Autodetect"
        ),
        CoreOptionDef(
            key = "mgba_use_bios",
            displayName = "Use BIOS File if Found",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "mgba_skip_bios",
            displayName = "Skip BIOS Intro",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "mgba_sgb_borders",
            displayName = "Use Super Game Boy Borders",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "mgba_color_correction",
            displayName = "Color Correction",
            values = listOf("OFF", "GBA", "GBC", "Auto"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "mgba_interframe_blending",
            displayName = "Interframe Blending",
            values = listOf("OFF", "mix", "mix_smart", "lcd_ghosting", "lcd_ghosting_fast"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "mgba_audio_low_pass_filter",
            displayName = "Audio Low-Pass Filter",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mgba_audio_low_pass_range",
            displayName = "Audio Low-Pass Filter Range",
            values = listOf(
                "5", "10", "15", "20", "25", "30", "35", "40", "45",
                "50", "55", "60", "65", "70", "75", "80", "85", "90", "95"
            ),
            defaultValue = "60"
        ),
        CoreOptionDef(
            key = "mgba_allow_opposing_directions",
            displayName = "Allow Opposing Directions",
            values = listOf("no", "yes"),
            defaultValue = "no"
        ),
        CoreOptionDef(
            key = "mgba_solar_sensor_level",
            displayName = "Solar Sensor Level",
            values = listOf(
                "sensor", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            ),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mgba_force_gbp",
            displayName = "Game Boy Player Rumble",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "mgba_idle_optimization",
            displayName = "Idle Loop Removal",
            values = listOf("Remove Known", "Detect and Remove", "Don't Remove"),
            defaultValue = "Remove Known"
        ),
        CoreOptionDef(
            key = "mgba_frameskip",
            displayName = "Frameskip",
            values = listOf("disabled", "auto", "auto_threshold", "fixed_interval"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mgba_frameskip_threshold",
            displayName = "Frameskip Threshold",
            values = listOf(
                "15", "18", "21", "24", "27", "30", "33",
                "36", "39", "42", "45", "48", "51", "54", "57", "60"
            ),
            defaultValue = "33"
        ),
        CoreOptionDef(
            key = "mgba_frameskip_interval",
            displayName = "Frameskip Interval",
            values = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"),
            defaultValue = "0"
        ),
    )
}
