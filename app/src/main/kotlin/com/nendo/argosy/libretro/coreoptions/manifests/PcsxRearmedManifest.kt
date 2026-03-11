package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object PcsxRearmedManifest : CoreOptionManifest {
    override val coreId = "pcsx_rearmed"
    override val options = listOf(
        // System
        CoreOptionDef(
            key = "pcsx_rearmed_bios",
            displayName = "Use BIOS",
            values = listOf("auto", "HLE"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_region",
            displayName = "Region",
            values = listOf("auto", "NTSC", "PAL"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_show_bios_bootlogo",
            displayName = "Show Bios Bootlogo (Breaks some games)",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_memcard2",
            displayName = "Enable Second Memory Card",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // Video
        CoreOptionDef(
            key = "pcsx_rearmed_frameskip",
            displayName = "Frameskip",
            values = listOf("0", "1", "2", "3"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_dithering",
            displayName = "Enable Dithering",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_duping_enable",
            displayName = "Frame Duping",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_display_internal_fps",
            displayName = "Display Internal FPS",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_thread_rendering",
            displayName = "Threaded Rendering",
            values = listOf("disabled", "sync", "async"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_neon_interlace_enable",
            displayName = "Enable Interlacing Mode(s)",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_neon_enhancement_enable",
            displayName = "Enhanced Resolution (Slow)",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_neon_enhancement_no_main",
            displayName = "Enhanced Resolution Speed Hack",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // Audio
        CoreOptionDef(
            key = "pcsx_rearmed_spu_reverb",
            displayName = "Sound: Reverb",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_spu_interpolation",
            displayName = "Sound: Interpolation",
            values = listOf("simple", "gaussian", "cubic", "off"),
            defaultValue = "simple"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_noxadecoding",
            displayName = "XA Decoding",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_nocdaudio",
            displayName = "CD Audio",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_spuirq",
            displayName = "SPU IRQ Always Enabled",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // CD
        CoreOptionDef(
            key = "pcsx_rearmed_async_cd",
            displayName = "CD Access Method (Restart)",
            values = listOf("sync", "async", "precache"),
            defaultValue = "sync"
        ),
        // Input
        CoreOptionDef(
            key = "pcsx_rearmed_input_sensitivity",
            displayName = "Emulated Mouse Sensitivity",
            values = listOf(
                "0.05", "0.10", "0.15", "0.20", "0.25", "0.30", "0.35", "0.40", "0.45", "0.50",
                "0.55", "0.60", "0.65", "0.70", "0.75", "0.80", "0.85", "0.90", "0.95", "1.00",
                "1.05", "1.10", "1.15", "1.20", "1.25", "1.30", "1.35", "1.40", "1.45", "1.50",
                "1.55", "1.60", "1.65", "1.70", "1.75", "1.80", "1.85", "1.90", "1.95", "2.00"
            ),
            defaultValue = "1.00"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_multitap",
            displayName = "Multitap Mode (Restart)",
            values = listOf("disabled", "port 1 only", "port 2 only", "both"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_vibration",
            displayName = "Enable Vibration",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_negcon_deadzone",
            displayName = "NegCon Twist Deadzone (Percent)",
            values = listOf("0", "5", "10", "15", "20", "25", "30"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_negcon_response",
            displayName = "NegCon Twist Response",
            values = listOf("linear", "quadratic", "cubic"),
            defaultValue = "linear"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_analog_axis_modifier",
            displayName = "Analog Axis Bounds",
            values = listOf("circle", "square"),
            defaultValue = "circle"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gunconadjustx",
            displayName = "Guncon Adjust X",
            values = (-25..25).map { it.toString() },
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gunconadjusty",
            displayName = "Guncon Adjust Y",
            values = (-25..25).map { it.toString() },
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gunconadjustratiox",
            displayName = "Guncon Adjust Ratio X",
            values = listOf(
                "0.75", "0.76", "0.77", "0.78", "0.79", "0.80", "0.81", "0.82", "0.83", "0.84",
                "0.85", "0.86", "0.87", "0.88", "0.89", "0.90", "0.91", "0.92", "0.93", "0.94",
                "0.95", "0.96", "0.97", "0.98", "0.99", "1.00", "1.01", "1.02", "1.03", "1.04",
                "1.05", "1.06", "1.07", "1.08", "1.09", "1.10", "1.11", "1.12", "1.13", "1.14",
                "1.15", "1.16", "1.17", "1.18", "1.19", "1.20", "1.21", "1.22", "1.23", "1.24",
                "1.25"
            ),
            defaultValue = "1.00"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gunconadjustratioy",
            displayName = "Guncon Adjust Ratio Y",
            values = listOf(
                "0.75", "0.76", "0.77", "0.78", "0.79", "0.80", "0.81", "0.82", "0.83", "0.84",
                "0.85", "0.86", "0.87", "0.88", "0.89", "0.90", "0.91", "0.92", "0.93", "0.94",
                "0.95", "0.96", "0.97", "0.98", "0.99", "1.00", "1.01", "1.02", "1.03", "1.04",
                "1.05", "1.06", "1.07", "1.08", "1.09", "1.10", "1.11", "1.12", "1.13", "1.14",
                "1.15", "1.16", "1.17", "1.18", "1.19", "1.20", "1.21", "1.22", "1.23", "1.24",
                "1.25"
            ),
            defaultValue = "1.00"
        ),
        // CPU
        CoreOptionDef(
            key = "pcsx_rearmed_drc",
            displayName = "Dynamic Recompiler",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_psxclock",
            displayName = "PSX CPU Clock",
            values = (30..100).map { it.toString() },
            defaultValue = "57"
        ),
        // Game Fixes
        CoreOptionDef(
            key = "pcsx_rearmed_idiablofix",
            displayName = "Diablo Music Fix",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_pe2_fix",
            displayName = "Parasite Eve 2/Vandal Hearts 1/2 Fix",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_inuyasha_fix",
            displayName = "InuYasha Sengoku Battle Fix",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // GPU P.E.Op.S. Plugin
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_odd_even_bit",
            displayName = "(GPU) Odd/Even Bit Hack",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_expand_screen_width",
            displayName = "(GPU) Expand Screen Width",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_ignore_brightness",
            displayName = "(GPU) Ignore Brightness Color",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_disable_coord_check",
            displayName = "(GPU) Disable Coordinate Check",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_lazy_screen_update",
            displayName = "(GPU) Lazy Screen Update",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_old_frame_skip",
            displayName = "(GPU) Old Frame Skipping",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_repeated_triangles",
            displayName = "(GPU) Repeated Flat Tex Triangles",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_quads_with_triangles",
            displayName = "(GPU) Draw Quads with Triangles",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_peops_fake_busy_state",
            displayName = "(GPU) Fake 'Gpu Busy' States",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // GPU UNAI Plugin
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_unai_blending",
            displayName = "(GPU) Enable Blending",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_unai_lighting",
            displayName = "(GPU) Enable Lighting",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_unai_fast_lighting",
            displayName = "(GPU) Enable Fast Lighting",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_unai_ilace_force",
            displayName = "(GPU) Enable Forced Interlace",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_unai_pixel_skip",
            displayName = "(GPU) Enable Pixel Skip",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "pcsx_rearmed_gpu_unai_scale_hires",
            displayName = "(GPU) Enable Hi-Res Downscaling",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
    )
}
