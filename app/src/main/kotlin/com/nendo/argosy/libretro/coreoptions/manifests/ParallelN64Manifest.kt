package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object ParallelN64Manifest : CoreOptionManifest {
    override val coreId = "parallel_n64"
    override val options = listOf(
        CoreOptionDef(
            key = "parallel-n64-cpucore",
            displayName = "CPU Core",
            values = listOf("dynamic_recompiler", "cached_interpreter", "pure_interpreter"),
            defaultValue = "dynamic_recompiler"
        ),
        CoreOptionDef(
            key = "parallel-n64-audio-buffer-size",
            displayName = "Audio Buffer Size",
            values = listOf("2048", "1024"),
            defaultValue = "2048"
        ),
        CoreOptionDef(
            key = "parallel-n64-astick-deadzone",
            displayName = "Analog Deadzone (percent)",
            values = (0..30).map { it.toString() },
            defaultValue = "15"
        ),
        CoreOptionDef(
            key = "parallel-n64-astick-sensitivity",
            displayName = "Analog Sensitivity (percent)",
            values = (50..200 step 5).map { it.toString() },
            defaultValue = "100"
        ),
        CoreOptionDef(
            key = "parallel-n64-astick-snap-angle-active",
            displayName = "Analog Stick Snap Angle Active",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-astick-snap-max-angle",
            displayName = "Analog Stick Snap Max Angle",
            values = (1..21).map { it.toString() },
            defaultValue = "15"
        ),
        CoreOptionDef(
            key = "parallel-n64-astick-snap-min-displacement-percent",
            displayName = "Analog Stick Snap Min Displacement Percent",
            values = listOf("0") + (10..95 step 5).map { it.toString() },
            defaultValue = "70"
        ),
        CoreOptionDef(
            key = "parallel-n64-pak1",
            displayName = "Player 1 Pak",
            values = listOf("none", "memory", "rumble"),
            defaultValue = "memory"
        ),
        CoreOptionDef(
            key = "parallel-n64-pak2",
            displayName = "Player 2 Pak",
            values = listOf("none", "memory", "rumble"),
            defaultValue = "none"
        ),
        CoreOptionDef(
            key = "parallel-n64-pak3",
            displayName = "Player 3 Pak",
            values = listOf("none", "memory", "rumble"),
            defaultValue = "none"
        ),
        CoreOptionDef(
            key = "parallel-n64-pak4",
            displayName = "Player 4 Pak",
            values = listOf("none", "memory", "rumble"),
            defaultValue = "none"
        ),
        CoreOptionDef(
            key = "parallel-n64-disable_expmem",
            displayName = "Enable Expansion Pak",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-gfxplugin-accuracy",
            displayName = "GFX Accuracy",
            values = listOf("low", "medium", "high", "veryhigh"),
            defaultValue = "veryhigh"
        ),
        CoreOptionDef(
            key = "parallel-n64-gfxplugin",
            displayName = "GFX Plugin",
            values = listOf("auto", "glide64", "gln64", "rice", "angrylion", "parallel"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "parallel-n64-rspplugin",
            displayName = "RSP Plugin",
            values = listOf("auto", "hle", "cxd4", "parallel"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "parallel-n64-screensize",
            displayName = "Resolution",
            values = listOf(
                "320x240", "640x480", "960x720", "1280x960",
                "1440x1080", "1600x1200", "1920x1440", "2240x1680",
                "2560x1920", "2880x2160", "3200x2400", "3520x2640",
                "3840x2880", "4160x3120", "4480x3360", "4800x3600",
                "5120x3840", "5440x4080", "5760x4320"
            ),
            defaultValue = "640x480"
        ),
        CoreOptionDef(
            key = "parallel-n64-aspectratiohint",
            displayName = "Aspect Ratio",
            values = listOf("normal", "widescreen"),
            defaultValue = "normal"
        ),
        CoreOptionDef(
            key = "parallel-n64-filtering",
            displayName = "Texture Filtering",
            values = listOf("automatic", "N64 3-point", "bilinear", "nearest"),
            defaultValue = "automatic"
        ),
        CoreOptionDef(
            key = "parallel-n64-dithering",
            displayName = "Dithering",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-polyoffset-factor",
            displayName = "Polygon Offset Factor",
            values = listOf(
                "-5.0", "-4.5", "-4.0", "-3.5", "-3.0", "-2.5", "-2.0",
                "-1.5", "-1.0", "-0.5", "0.0", "0.5", "1.0", "1.5",
                "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0"
            ),
            defaultValue = "0.0"
        ),
        CoreOptionDef(
            key = "parallel-n64-polyoffset-units",
            displayName = "Polygon Offset Units",
            values = listOf(
                "-5.0", "-4.5", "-4.0", "-3.5", "-3.0", "-2.5", "-2.0",
                "-1.5", "-1.0", "-0.5", "0.0", "0.5", "1.0", "1.5",
                "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0"
            ),
            defaultValue = "0.0"
        ),
        // ParaLLEl-RDP
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-synchronous",
            displayName = "(ParaLLEl-RDP) Synchronous RDP",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-overscan",
            displayName = "(ParaLLEl-RDP) Crop overscan",
            values = listOf("0") + (2..64 step 2).map { it.toString() },
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-divot-filter",
            displayName = "(ParaLLEl-RDP) VI Divot filter",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-gamma-dither",
            displayName = "(ParaLLEl-RDP) VI Gamma dither",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-vi-aa",
            displayName = "(ParaLLEl-RDP) VI anti-aliasing",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-vi-bilinear",
            displayName = "(ParaLLEl-RDP) VI bilinear",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-dither-filter",
            displayName = "(ParaLLEl-RDP) VI dither filter",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-upscaling",
            displayName = "(ParaLLEl-RDP) Upscaling factor",
            values = listOf("1x", "2x", "4x", "8x"),
            defaultValue = "1x"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-downscaling",
            displayName = "(ParaLLEl-RDP) Downsampling factor",
            values = listOf("disable", "1/2", "1/4", "1/8"),
            defaultValue = "disable"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-native-texture-lod",
            displayName = "(ParaLLEl-RDP) Native texture LOD",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-parallel-rdp-native-tex-rect",
            displayName = "(ParaLLEl-RDP) Native resolution TEX_RECT",
            values = listOf("enabled", "disabled"),
            defaultValue = "enabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-send_allist_to_hle_rsp",
            displayName = "Send Audio Lists to HLE RSP",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // Angrylion
        CoreOptionDef(
            key = "parallel-n64-angrylion-vioverlay",
            displayName = "(Angrylion) VI Overlay",
            values = listOf("Filtered", "AA+Blur", "AA+Dedither", "AA only", "Unfiltered", "Depth", "Coverage"),
            defaultValue = "Filtered"
        ),
        CoreOptionDef(
            key = "parallel-n64-angrylion-sync",
            displayName = "(Angrylion) Thread sync level",
            values = listOf("Low", "Medium", "High"),
            defaultValue = "Low"
        ),
        CoreOptionDef(
            key = "parallel-n64-angrylion-multithread",
            displayName = "(Angrylion) Multi-threading",
            values = listOf("all threads") + (1..63).map { it.toString() },
            defaultValue = "all threads"
        ),
        CoreOptionDef(
            key = "parallel-n64-angrylion-overscan",
            displayName = "(Angrylion) Hide overscan",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // General
        CoreOptionDef(
            key = "parallel-n64-virefresh",
            displayName = "VI Refresh (Overclock)",
            values = listOf("auto", "1500", "2200"),
            defaultValue = "auto"
        ),
        CoreOptionDef(
            key = "parallel-n64-bufferswap",
            displayName = "Buffer Swap",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-framerate",
            displayName = "Framerate",
            values = listOf("original", "fullspeed"),
            defaultValue = "original"
        ),
        CoreOptionDef(
            key = "parallel-n64-alt-map",
            displayName = "Independent C-button Controls",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-vcache-vbo",
            displayName = "Vertex Cache VBO (restart)",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "parallel-n64-boot-device",
            displayName = "Boot Device",
            values = listOf("Default", "64DD IPL"),
            defaultValue = "Default"
        ),
        CoreOptionDef(
            key = "parallel-n64-64dd-hardware",
            displayName = "64DD Hardware",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
    )
}
