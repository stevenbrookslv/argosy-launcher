package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object FlycastManifest : CoreOptionManifest {
    override val coreId = "flycast"
    override val options = listOf(
        // System
        CoreOptionDef(
            key = "flycast_region",
            displayName = "Region",
            values = listOf("Default", "Japan", "USA", "Europe"),
            defaultValue = "Default"
        ),
        CoreOptionDef(
            key = "flycast_language",
            displayName = "Language",
            values = listOf("Default", "Japanese", "English", "German", "French", "Spanish", "Italian"),
            defaultValue = "Default"
        ),
        CoreOptionDef(
            key = "flycast_hle_bios",
            displayName = "HLE BIOS",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "flycast_boot_to_bios",
            displayName = "Boot to BIOS",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "flycast_enable_dsp",
            displayName = "Enable DSP",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "flycast_force_windows_ce_modee",
            displayName = "Force Windows CE Mode",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // Video
        CoreOptionDef(
            key = "flycast_internal_resolution",
            displayName = "Internal Resolution",
            values = listOf(
                "640x480", "1280x960", "1920x1440", "2560x1920",
                "3200x2400", "3840x2880", "4480x3360", "5120x3840",
                "5760x4320", "6400x4800"
            ),
            defaultValue = "640x480"
        ),
        CoreOptionDef(
            key = "flycast_cable_type",
            displayName = "Cable Type",
            values = listOf("TV (Composite)", "TV (RGB)", "VGA (RGB)"),
            defaultValue = "TV (Composite)"
        ),
        CoreOptionDef(
            key = "flycast_brodcast",
            displayName = "Broadcast Standard",
            values = listOf("Default", "PAL-M", "PAL-N", "NTSC", "PAL"),
            defaultValue = "Default"
        ),
        CoreOptionDef(
            key = "flycast_screen_orientation",
            displayName = "Screen Orientation",
            values = listOf("Horizontal", "Vertical"),
            defaultValue = "Horizontal"
        ),
        CoreOptionDef(
            key = "flycast_alpha_sorting",
            displayName = "Alpha Sorting",
            values = listOf("Per-Strip", "Per-Triangle", "Per-Pixel"),
            defaultValue = "Per-Triangle"
        ),
        CoreOptionDef(
            key = "flycast_mipmapping",
            displayName = "Mipmapping",
            values = listOf("On", "Off"),
            defaultValue = "On"
        ),
        CoreOptionDef(
            key = "flycast_volume_modifier",
            displayName = "Volume Modifier",
            values = listOf("On", "Off"),
            defaultValue = "On"
        ),
        CoreOptionDef(
            key = "flycast_anistropic_filtering",
            displayName = "Anisotropic Filtering",
            values = listOf("2", "4", "8", "16"),
            defaultValue = "4"
        ),
        CoreOptionDef(
            key = "flycast_delay_frame_swapping",
            displayName = "Delay Frame Swapping",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "flycast_pvr2_filtering",
            displayName = "PowerVR2 Post-Processing Filter",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // Performance
        CoreOptionDef(
            key = "flycast_threaded_rendering",
            displayName = "Threaded Rendering",
            values = listOf("enabled", "disabled"),
            defaultValue = "disabled",
            coreDefault = "enabled"
        ),
        CoreOptionDef(
            key = "flycast_skip_frame",
            displayName = "Frame Skip",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "flycast_frame_skipping",
            displayName = "Frame Skipping",
            values = listOf("disabled", "1", "2", "3", "4", "5", "6"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "flycast_widescreen_cheats",
            displayName = "Widescreen Cheats",
            values = listOf("Off", "On"),
            defaultValue = "Off"
        ),
        CoreOptionDef(
            key = "flycast_widescreen_hack",
            displayName = "Widescreen Hack",
            values = listOf("Off", "On"),
            defaultValue = "Off"
        ),
        CoreOptionDef(
            key = "flycast_gdrom_fast_loading",
            displayName = "GD-ROM Fast Loading",
            values = listOf("On", "Off"),
            defaultValue = "On"
        ),
        CoreOptionDef(
            key = "flycast_custom_textures",
            displayName = "Custom Textures",
            values = listOf("Off", "On"),
            defaultValue = "Off"
        ),
        CoreOptionDef(
            key = "flycast_dump_textures",
            displayName = "Dump Textures",
            values = listOf("Off", "On"),
            defaultValue = "Off"
        ),
        // Input
        CoreOptionDef(
            key = "flycast_analog_stick_deadzone",
            displayName = "Analog Stick Deadzone",
            values = listOf("0%", "5%", "10%", "15%", "20%", "25%", "30%"),
            defaultValue = "15%"
        ),
        CoreOptionDef(
            key = "flycast_trigger_deadzone",
            displayName = "Trigger Deadzone",
            values = listOf("0%", "5%", "10%", "15%", "20%", "25%", "30%"),
            defaultValue = "0%"
        ),
        CoreOptionDef(
            key = "flycast_digital_triggers",
            displayName = "Digital Triggers",
            values = listOf("Off", "On"),
            defaultValue = "Off"
        ),
        CoreOptionDef(
            key = "flycast_enable_purupuru",
            displayName = "Vibration (Purupuru)",
            values = listOf("On", "Off"),
            defaultValue = "On"
        )
    )
}
