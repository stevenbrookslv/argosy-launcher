package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object Mupen64PlusNextGles3Manifest : CoreOptionManifest {
    override val coreId = "mupen64plus_next_gles3"
    override val options = listOf(
        // CPU
        CoreOptionDef(
            key = "mupen64plus-next-cpucore",
            displayName = "CPU Core",
            values = listOf("pure_interpreter", "cached_interpreter", "dynamic_recompiler"),
            defaultValue = "dynamic_recompiler"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-CountPerOp",
            displayName = "Count Per Op",
            values = listOf("0", "1", "2", "3", "4", "5"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-CountPerOpDenomPot",
            displayName = "Count Per Op Divider (Overclock)",
            values = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-ForceDisableExtraMem",
            displayName = "Disable Expansion Pak",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-IgnoreTLBExceptions",
            displayName = "Ignore emulated TLB Exceptions",
            values = listOf("False", "OnlyNotEnabled", "AlwaysIgnoreTLB"),
            defaultValue = "False"
        ),
        // RSP
        CoreOptionDef(
            key = "mupen64plus-next-rsp-plugin",
            displayName = "RSP Plugin",
            values = listOf("cxd4", "parallel", "hle"),
            defaultValue = "hle"
        ),
        // RDP
        CoreOptionDef(
            key = "mupen64plus-next-rdp-plugin",
            displayName = "RDP Plugin",
            values = listOf("angrylion", "parallel", "gliden64"),
            defaultValue = "gliden64"
        ),
        // Video - GLideN64
        CoreOptionDef(
            key = "mupen64plus-next-43screensize",
            displayName = "4:3 Resolution",
            values = listOf(
                "320x240", "640x480", "960x720", "1280x960", "1440x1080",
                "1600x1200", "1920x1440", "2240x1680", "2560x1920",
                "2880x2160", "3200x2400", "3520x2640", "3840x2880"
            ),
            defaultValue = "640x480"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-169screensize",
            displayName = "Wide Resolution",
            values = listOf(
                "640x360", "960x540", "1280x720", "1706x720", "1366x768",
                "1920x810", "1920x1080", "2560x1080", "2560x1440",
                "3414x1440", "3840x2160", "4096x2160", "5120x1440",
                "5120x2160", "7680x3240", "7680x4320", "7680x2160",
                "10240x4320"
            ),
            defaultValue = "960x540"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-aspect",
            displayName = "Aspect Ratio",
            values = listOf("4:3", "16:9", "16:9 adjusted"),
            defaultValue = "4:3"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableNativeResFactor",
            displayName = "Native Resolution Factor",
            values = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-ThreadedRenderer",
            displayName = "Threaded Renderer",
            values = listOf("True", "False"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-BilinearMode",
            displayName = "Bilinear filtering mode",
            values = listOf("3point", "standard"),
            defaultValue = "standard"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-HybridFilter",
            displayName = "Hybrid Filter",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-DitheringPattern",
            displayName = "Dithering",
            values = listOf("True", "False"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-DitheringQuantization",
            displayName = "Dithering Quantization",
            values = listOf("True", "False"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-RDRAMImageDitheringMode",
            displayName = "Image Dithering Mode",
            values = listOf("False", "Bayer", "MagicSquare", "BlueNoise"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-MultiSampling",
            displayName = "MSAA level",
            values = listOf("0", "2", "4", "8", "16"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-FXAA",
            displayName = "FXAA",
            values = listOf("0", "1"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableLODEmulation",
            displayName = "LOD Emulation",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableFBEmulation",
            displayName = "Framebuffer Emulation",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableCopyAuxToRDRAM",
            displayName = "Copy auxiliary buffers to RDRAM",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableCopyColorToRDRAM",
            displayName = "Color buffer to RDRAM",
            values = listOf("Off", "Sync", "Async", "TripleBuffer"),
            defaultValue = "Async"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableCopyColorFromRDRAM",
            displayName = "Enable color buffer copy from RDRAM",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableCopyDepthToRDRAM",
            displayName = "Depth buffer to RDRAM",
            values = listOf("Off", "Software", "FromMem"),
            defaultValue = "Software"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-BackgroundMode",
            displayName = "Background Mode",
            values = listOf("Stripped", "OnePiece"),
            defaultValue = "OnePiece"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableHWLighting",
            displayName = "Hardware per-pixel lighting",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-CorrectTexrectCoords",
            displayName = "Continuous texrect coords",
            values = listOf("Off", "Auto", "Force"),
            defaultValue = "Off"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableInaccurateTextureCoordinates",
            displayName = "Enable inaccurate texture coordinates",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableTexCoordBounds",
            displayName = "Enable native-res boundaries for texture coordinates",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableNativeResTexrects",
            displayName = "Native res. 2D texrects",
            values = listOf("Disabled", "Unoptimized", "Optimized"),
            defaultValue = "Disabled"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableLegacyBlending",
            displayName = "Less accurate blending mode",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableFragmentDepthWrite",
            displayName = "GPU shader depth write",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableN64DepthCompare",
            displayName = "N64 Depth Compare",
            values = listOf("False", "True", "Compatible"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableShadersStorage",
            displayName = "Cache GPU Shaders",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableTextureCache",
            displayName = "Cache Textures",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableOverscan",
            displayName = "Overscan",
            values = listOf("Disabled", "Enabled"),
            defaultValue = "Enabled"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-OverscanTop",
            displayName = "Overscan Offset (Top)",
            values = (0..50).map { it.toString() },
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-OverscanLeft",
            displayName = "Overscan Offset (Left)",
            values = (0..50).map { it.toString() },
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-OverscanRight",
            displayName = "Overscan Offset (Right)",
            values = (0..50).map { it.toString() },
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-OverscanBottom",
            displayName = "Overscan Offset (Bottom)",
            values = (0..50).map { it.toString() },
            defaultValue = "0"
        ),
        // Textures
        CoreOptionDef(
            key = "mupen64plus-next-MaxHiResTxVramLimit",
            displayName = "Max High-Res VRAM Limit",
            values = listOf("0", "500", "1000", "1500", "2000", "2500", "3000", "3500", "4000"),
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-MaxTxCacheSize",
            displayName = "Max texture cache size",
            values = listOf("1500", "4000", "8000"),
            defaultValue = "8000"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-txFilterMode",
            displayName = "Texture filter",
            values = listOf(
                "None", "Smooth filtering 1", "Smooth filtering 2",
                "Smooth filtering 3", "Smooth filtering 4",
                "Sharp filtering 1", "Sharp filtering 2"
            ),
            defaultValue = "None"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-txEnhancementMode",
            displayName = "Texture Enhancement",
            values = listOf(
                "None", "As Is", "X2", "X2SAI", "HQ2X", "HQ2XS",
                "LQ2X", "LQ2XS", "HQ4X", "2xBRZ", "3xBRZ",
                "4xBRZ", "5xBRZ", "6xBRZ"
            ),
            defaultValue = "None"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-txFilterIgnoreBG",
            displayName = "Don't filter background textures",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-txHiresEnable",
            displayName = "Use High-Res textures",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-txCacheCompression",
            displayName = "Use High-Res Texture Cache Compression",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-txHiresFullAlphaChannel",
            displayName = "Use High-Res Full Alpha Channel",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableEnhancedTextureStorage",
            displayName = "Use enhanced Texture Storage",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableHiResAltCRC",
            displayName = "Use alternative method for High-Res Checksums",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-EnableEnhancedHighResStorage",
            displayName = "Use enhanced Hi-Res Storage",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-GLideN64IniBehaviour",
            displayName = "INI Behaviour",
            values = listOf("late", "early", "disabled"),
            defaultValue = "late"
        ),
        // ParaLLEl-RDP
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-synchronous",
            displayName = "(ParaLLEl-RDP) Synchronous RDP",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-overscan",
            displayName = "(ParaLLEl-RDP) Crop overscan",
            values = (0..64 step 2).map { it.toString() },
            defaultValue = "0"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-divot-filter",
            displayName = "(ParaLLEl-RDP) VI Divot filter",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-gamma-dither",
            displayName = "(ParaLLEl-RDP) VI Gamma dither",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-vi-aa",
            displayName = "(ParaLLEl-RDP) VI anti-aliasing",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-vi-bilinear",
            displayName = "(ParaLLEl-RDP) VI bilinear",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-dither-filter",
            displayName = "(ParaLLEl-RDP) VI dither filter",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-upscaling",
            displayName = "(ParaLLEl-RDP) Upscaling factor (restart)",
            values = listOf("1x", "2x", "4x", "8x"),
            defaultValue = "1x"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-super-sampled-read-back",
            displayName = "(ParaLLEl-RDP) SSAA framebuffer effects (restart)",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-super-sampled-read-back-dither",
            displayName = "(ParaLLEl-RDP) Dither SSAA framebuffer effects (restart)",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-downscaling",
            displayName = "(ParaLLEl-RDP) Downsampling factor",
            values = listOf("disable", "1/2", "1/4", "1/8"),
            defaultValue = "disable"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-native-texture-lod",
            displayName = "(ParaLLEl-RDP) Native texture LOD",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-native-tex-rect",
            displayName = "(ParaLLEl-RDP) Native resolution TEX_RECT",
            values = listOf("True", "False"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-parallel-rdp-deinterlace-method",
            displayName = "(ParaLLEl-RDP) Deinterlacing method",
            values = listOf("Bob", "Weave"),
            defaultValue = "Bob"
        ),
        // Angrylion
        CoreOptionDef(
            key = "mupen64plus-next-angrylion-vioverlay",
            displayName = "VI Overlay",
            values = listOf("Filtered", "AA+Blur", "AA+Dedither", "AA only", "Unfiltered", "Depth", "Coverage"),
            defaultValue = "Filtered"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-angrylion-sync",
            displayName = "Thread sync level",
            values = listOf("Low", "Medium", "High"),
            defaultValue = "Low"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-angrylion-multithread",
            displayName = "Multi-threading",
            values = listOf("all threads") + (1..63).map { it.toString() } + listOf("75"),
            defaultValue = "all threads"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-angrylion-overscan",
            displayName = "Hide overscan",
            values = listOf("disabled", "enabled"),
            defaultValue = "disabled"
        ),
        // General
        CoreOptionDef(
            key = "mupen64plus-next-FrameDuping",
            displayName = "Frame Duplication",
            values = listOf("False", "True"),
            defaultValue = "True"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-Framerate",
            displayName = "Framerate",
            values = listOf("Original", "Fullspeed"),
            defaultValue = "Original"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-virefresh",
            displayName = "VI Refresh (Overclock)",
            values = listOf("Auto", "1500", "2200"),
            defaultValue = "Auto"
        ),
        // Input
        CoreOptionDef(
            key = "mupen64plus-next-astick-deadzone",
            displayName = "Analog Deadzone (percent)",
            values = listOf("0", "5", "10", "15", "20", "25", "30"),
            defaultValue = "15"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-astick-sensitivity",
            displayName = "Analog Sensitivity (percent)",
            values = (50..150 step 5).map { it.toString() },
            defaultValue = "100"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-r-cbutton",
            displayName = "Right C Button",
            values = listOf("C1", "C2", "C3", "C4"),
            defaultValue = "C1"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-l-cbutton",
            displayName = "Left C Button",
            values = listOf("C1", "C2", "C3", "C4"),
            defaultValue = "C2"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-d-cbutton",
            displayName = "Down C Button",
            values = listOf("C1", "C2", "C3", "C4"),
            defaultValue = "C3"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-u-cbutton",
            displayName = "Up C Button",
            values = listOf("C1", "C2", "C3", "C4"),
            defaultValue = "C4"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-alt-map",
            displayName = "Independent C-button Controls",
            values = listOf("False", "True"),
            defaultValue = "False"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-pak1",
            displayName = "Player 1 Pak",
            values = listOf("none", "memory", "rumble", "transfer"),
            defaultValue = "memory"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-pak2",
            displayName = "Player 2 Pak",
            values = listOf("none", "memory", "rumble", "transfer"),
            defaultValue = "none"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-pak3",
            displayName = "Player 3 Pak",
            values = listOf("none", "memory", "rumble", "transfer"),
            defaultValue = "none"
        ),
        CoreOptionDef(
            key = "mupen64plus-next-pak4",
            displayName = "Player 4 Pak",
            values = listOf("none", "memory", "rumble", "transfer"),
            defaultValue = "none"
        ),
    )
}
