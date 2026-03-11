package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object PpssppManifest : CoreOptionManifest {
    override val coreId = "ppsspp"
    override val options = listOf(
        // System
        CoreOptionDef(
            key = "ppsspp_cpu_core",
            displayName = "CPU Core",
            values = listOf("jit", "IR jit", "interpreter"),
            defaultValue = "jit"
        ),
        CoreOptionDef(
            key = "ppsspp_locked_cpu_speed",
            displayName = "Locked CPU Speed",
            values = listOf("off", "222MHz", "266MHz", "333MHz"),
            defaultValue = "off"
        ),
        CoreOptionDef(
            key = "ppsspp_language",
            displayName = "Language",
            values = listOf(
                "automatic", "english", "japanese", "french", "spanish", "german",
                "italian", "dutch", "portuguese", "russian", "korean",
                "chinese_traditional", "chinese_simplified"
            ),
            defaultValue = "automatic"
        ),
        CoreOptionDef(
            key = "ppsspp_button_preference",
            displayName = "Confirmation Button",
            values = listOf("cross", "circle"),
            defaultValue = "cross"
        ),
        CoreOptionDef(
            key = "ppsspp_fast_memory",
            displayName = "Fast Memory (Speedhack)",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "ppsspp_cheats",
            displayName = "Internal Cheats Support",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // Video
        CoreOptionDef(
            key = "ppsspp_rendering_mode",
            displayName = "Rendering Mode",
            values = listOf("buffered", "nonbuffered"),
            defaultValue = "buffered"
        ),
        CoreOptionDef(
            key = "ppsspp_true_color",
            displayName = "True Color Depth",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "ppsspp_internal_resolution",
            displayName = "Internal Resolution",
            values = listOf(
                "480x272", "960x544", "1440x816", "1920x1088", "2400x1360",
                "2880x1632", "3360x1904", "3840x2176", "4320x2448", "4800x2720"
            ),
            defaultValue = "480x272"
        ),
        CoreOptionDef(
            key = "ppsspp_texture_scaling_level",
            displayName = "Texture Scaling Level",
            values = listOf("0", "1", "2", "3", "4", "5"),
            defaultValue = "1"
        ),
        CoreOptionDef(
            key = "ppsspp_texture_scaling_type",
            displayName = "Texture Scaling Type",
            values = listOf("xbrz", "hybrid", "bicubic", "hybrid_bicubic"),
            defaultValue = "xbrz"
        ),
        CoreOptionDef(
            key = "ppsspp_texture_filtering",
            displayName = "Texture Filtering",
            values = listOf("auto", "nearest", "linear", "linear(FMV)"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "ppsspp_texture_anisotropic_filtering",
            displayName = "Anisotropic Filtering",
            values = listOf("off", "1x", "2x", "4x", "8x", "16x"),
            defaultValue = "off"
        ),
        CoreOptionDef(
            key = "ppsspp_texture_deposterize",
            displayName = "Texture Deposterize",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "ppsspp_gpu_hardware_transform",
            displayName = "GPU Hardware T&L",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "ppsspp_vertex_cache",
            displayName = "Vertex Cache (Speedhack)",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "ppsspp_block_transfer_gpu",
            displayName = "Block Transfer GPU",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        // Performance
        CoreOptionDef(
            key = "ppsspp_auto_frameskip",
            displayName = "Auto Frameskip",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "ppsspp_frameskip",
            displayName = "Frameskip",
            values = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "ppsspp_force_max_fps",
            displayName = "Force Max FPS",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "ppsspp_separate_io_thread",
            displayName = "IO Threading",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "ppsspp_unsafe_func_replacements",
            displayName = "Unsafe FuncReplacements",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "ppsspp_sound_speedhack",
            displayName = "Sound Speedhack",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // Audio
        CoreOptionDef(
            key = "ppsspp_audio_latency",
            displayName = "Audio Latency",
            values = listOf("low", "medium", "high"),
            defaultValue = "low"
        ),
    )
}
