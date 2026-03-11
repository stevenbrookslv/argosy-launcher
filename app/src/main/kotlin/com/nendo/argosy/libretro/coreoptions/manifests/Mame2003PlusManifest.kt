package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object Mame2003PlusManifest : CoreOptionManifest {
    override val coreId = "mame2003_plus"
    override val options = listOf(
        CoreOptionDef(
            key = "mame2003-plus_four_way_emulation",
            displayName = "4-Way Joystick Emulation on 8-Way Joysticks",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_xy_device",
            displayName = "X-Y Device",
            values = listOf("mouse", "pointer", "lightgun", "disabled"),
            defaultValue = "mouse"
        ),
        CoreOptionDef(
            key = "mame2003-plus_crosshair_enabled",
            displayName = "Show Lightgun Crosshairs",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_crosshair_appearance",
            displayName = "Lightgun Crosshair Appearance",
            values = listOf("simple", "enhanced"),
            defaultValue = "simple"
        ),
        CoreOptionDef(
            key = "mame2003-plus_skip_disclaimer",
            displayName = "Skip Disclaimer",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_skip_warnings",
            displayName = "Skip Warnings",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_display_setup",
            displayName = "Display MAME Menu",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_brightness",
            displayName = "Brightness",
            values = listOf(
                "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9",
                "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7",
                "1.8", "1.9", "2.0"
            ),
            defaultValue = "1.0"
        ),
        CoreOptionDef(
            key = "mame2003-plus_gamma",
            displayName = "Gamma Correction",
            values = listOf(
                "0.5", "0.6", "0.7", "0.8", "0.9",
                "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7",
                "1.8", "1.9", "2.0"
            ),
            defaultValue = "1.0"
        ),
        CoreOptionDef(
            key = "mame2003-plus_display_artwork",
            displayName = "Display Artwork",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_art_resolution",
            displayName = "Artwork Resolution Multiplier",
            values = listOf("1", "2", "3", "4", "5", "6", "7", "8"),
            defaultValue = "1"
        ),
        CoreOptionDef(
            key = "mame2003-plus_art_overlay_opacity",
            displayName = "Artwork Hardcoded Overlay Opacity",
            values = listOf(
                "default", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "50", "70"
            ),
            defaultValue = "default"
        ),
        CoreOptionDef(
            key = "mame2003-plus_neogeo_bios",
            displayName = "Specify Neo Geo BIOS",
            values = listOf(
                "default", "euro", "euro-s1", "us", "us-e", "asia",
                "japan", "japan-s2", "unibios40", "unibios33", "unibios20",
                "unibios13", "unibios11", "unibios10", "debug", "asia-aes"
            ),
            defaultValue = "default"
        ),
        CoreOptionDef(
            key = "mame2003-plus_stv_bios",
            displayName = "Specify Sega ST-V BIOS",
            values = listOf("default", "japan", "japana", "us", "japan_b", "taiwan", "europe"),
            defaultValue = "default"
        ),
        CoreOptionDef(
            key = "mame2003-plus_use_samples",
            displayName = "Use Samples",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_use_alt_sound",
            displayName = "Use CD Soundtrack",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_dialsharexy",
            displayName = "Share 2 Player Dial Controls Across One X/Y Device",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_dial_swap_xy",
            displayName = "Swap X and Y Dial Axis",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_tate_mode",
            displayName = "TATE Mode",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_vector_resolution",
            displayName = "Vector Resolution",
            values = listOf(
                "640x480", "1024x768", "1280x960", "1440x1080",
                "1600x1200", "1707x1280", "original"
            ),
            defaultValue = "1024x768"
        ),
        CoreOptionDef(
            key = "mame2003-plus_vector_antialias",
            displayName = "Vector Antialiasing",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_vector_beam_width",
            displayName = "Vector Beam Width",
            values = listOf(
                "1", "1.2", "1.4", "1.6", "1.8", "2", "2.5",
                "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
            ),
            defaultValue = "2"
        ),
        CoreOptionDef(
            key = "mame2003-plus_vector_translucency",
            displayName = "Vector Translucency",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_vector_flicker",
            displayName = "Vector Flicker",
            values = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100"),
            defaultValue = "20"
        ),
        CoreOptionDef(
            key = "mame2003-plus_vector_intensity",
            displayName = "Vector Intensity",
            values = listOf("0.5", "1", "1.5", "2", "2.5", "3"),
            defaultValue = "1.5"
        ),
        CoreOptionDef(
            key = "mame2003-plus_nvram_bootstraps",
            displayName = "NVRAM Bootstraps",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_sample_rate",
            displayName = "Sample Rate",
            values = listOf("8000", "11025", "22050", "30000", "44100", "48000"),
            defaultValue = "48000"
        ),
        CoreOptionDef(
            key = "mame2003-plus_input_interface",
            displayName = "Input Interface",
            values = listOf("simultaneous", "retropad", "keyboard"),
            defaultValue = "simultaneous"
        ),
        CoreOptionDef(
            key = "mame2003-plus_mame_remapping",
            displayName = "Legacy Remapping",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_frameskip",
            displayName = "Frameskip",
            values = listOf(
                "disabled", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "auto", "auto_aggressive", "auto_max"
            ),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_core_sys_subfolder",
            displayName = "Locate System Files Within a Subfolder",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_core_save_subfolder",
            displayName = "Locate Save Files Within a Subfolder",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_autosave_hiscore",
            displayName = "Autosave Hiscore",
            values = listOf("default", "recursively", "disabled"),
            defaultValue = "default"
        ),
        CoreOptionDef(
            key = "mame2003-plus_cheat_input_ports",
            displayName = "Dip Switch/Cheat Input Ports",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_digital_joy_centering",
            displayName = "Center Joystick Axis for Digital Controls",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_cpu_clock_scale",
            displayName = "CPU Clock Scale",
            values = listOf(
                "default", "25", "30", "35", "40", "45", "50", "55", "60",
                "65", "70", "75", "80", "85", "90", "95", "105", "110",
                "115", "120", "125", "200", "250", "300"
            ),
            defaultValue = "default"
        ),
        CoreOptionDef(
            key = "mame2003-plus_override_ad_stick",
            displayName = "Use Lightgun as an Analog Stick",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "mame2003-plus_input_toggle",
            displayName = "Allow Input Button to Act as a Toggle Switch",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
    )
}
