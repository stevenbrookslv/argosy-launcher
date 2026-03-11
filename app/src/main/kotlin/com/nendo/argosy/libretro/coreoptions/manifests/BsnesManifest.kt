package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object BsnesManifest : CoreOptionManifest {
    override val coreId = "bsnes"
    override val options = listOf(
        CoreOptionDef(
            key = "bsnes_aspect_ratio",
            displayName = "Preferred Aspect Ratio",
            values = listOf("Auto", "1:1", "4:3", "NTSC", "PAL"),
            defaultValue = "Auto"
        ),
        CoreOptionDef(
            key = "bsnes_ppu_overscan_v",
            displayName = "Crop Vertical Overscan",
            values = listOf("0", "8", "12", "16"),
            defaultValue = "8"
        ),
        CoreOptionDef(
            key = "bsnes_blur_emulation",
            displayName = "Blur Emulation",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_video_filter",
            displayName = "Video Filter",
            values = listOf("None", "NTSC (RF)", "NTSC (Composite)", "NTSC (S-Video)", "NTSC (RGB)"),
            defaultValue = "None"
        ),
        CoreOptionDef(
            key = "bsnes_video_luminance",
            displayName = "Color Adjustment - Luminance",
            values = listOf(
                "0", "10", "20", "30", "40", "50",
                "60", "70", "80", "90", "100"
            ),
            defaultValue = "100"
        ),
        CoreOptionDef(
            key = "bsnes_video_saturation",
            displayName = "Color Adjustment - Saturation",
            values = listOf(
                "0", "10", "20", "30", "40", "50", "60", "70", "80", "90",
                "100", "110", "120", "130", "140", "150", "160", "170",
                "180", "190", "200"
            ),
            defaultValue = "100"
        ),
        CoreOptionDef(
            key = "bsnes_video_gamma",
            displayName = "Color Adjustment - Gamma",
            values = listOf(
                "100", "110", "120", "130", "140", "150",
                "160", "170", "180", "190", "200"
            ),
            defaultValue = "150"
        ),
        CoreOptionDef(
            key = "bsnes_ppu_fast",
            displayName = "PPU (Video) - Fast Mode",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_ppu_deinterlace",
            displayName = "PPU (Video) - Deinterlace",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_ppu_no_sprite_limit",
            displayName = "PPU (Video) - No Sprite Limit",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_ppu_no_vram_blocking",
            displayName = "PPU (Video) - No VRAM Blocking",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_dsp_fast",
            displayName = "DSP (Audio) - Fast Mode",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_dsp_cubic",
            displayName = "DSP (Audio) - Cubic Interpolation",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_dsp_echo_shadow",
            displayName = "DSP (Audio) - Echo Shadow RAM",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_mode7_scale",
            displayName = "HD Mode 7 - Scale",
            values = listOf("1x", "2x", "3x", "4x", "5x", "6x", "7x", "8x"),
            defaultValue = "1x"
        ),
        CoreOptionDef(
            key = "bsnes_mode7_perspective",
            displayName = "HD Mode 7 - Perspective Correction",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_mode7_supersample",
            displayName = "HD Mode 7 - Supersampling",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_mode7_mosaic",
            displayName = "HD Mode 7 - HD->SD Mosaic",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_run_ahead_frames",
            displayName = "Internal Run-Ahead",
            values = listOf("OFF", "1", "2", "3", "4"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_coprocessor_delayed_sync",
            displayName = "Coprocessors - Fast Mode",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_coprocessor_prefer_hle",
            displayName = "Coprocessors - Prefer HLE",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_hotfixes",
            displayName = "Hotfixes",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_entropy",
            displayName = "Entropy (Randomization)",
            values = listOf("Low", "High", "None"),
            defaultValue = "Low"
        ),
        CoreOptionDef(
            key = "bsnes_cpu_fastmath",
            displayName = "CPU Fast Math",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_cpu_overclock",
            displayName = "Overclocking - CPU",
            values = listOf(
                "10", "20", "30", "40", "50", "60", "70", "80", "90",
                "100", "110", "120", "130", "140", "150", "160", "170",
                "180", "190", "200", "210", "220", "230", "240", "250",
                "260", "270", "280", "290", "300", "310", "320", "330",
                "340", "350", "360", "370", "380", "390", "400"
            ),
            defaultValue = "100"
        ),
        CoreOptionDef(
            key = "bsnes_cpu_sa1_overclock",
            displayName = "Overclocking - SA-1 Coprocessor",
            values = listOf(
                "10", "20", "30", "40", "50", "60", "70", "80", "90",
                "100", "110", "120", "130", "140", "150", "160", "170",
                "180", "190", "200", "210", "220", "230", "240", "250",
                "260", "270", "280", "290", "300", "310", "320", "330",
                "340", "350", "360", "370", "380", "390", "400"
            ),
            defaultValue = "100"
        ),
        CoreOptionDef(
            key = "bsnes_cpu_sfx_overclock",
            displayName = "Overclocking - SuperFX Coprocessor",
            values = listOf(
                "10", "20", "30", "40", "50", "60", "70", "80", "90",
                "100", "110", "120", "130", "140", "150", "160", "170",
                "180", "190", "200", "210", "220", "230", "240", "250",
                "260", "270", "280", "290", "300", "310", "320", "330",
                "340", "350", "360", "370", "380", "390", "400", "410",
                "420", "430", "440", "450", "460", "470", "480", "490",
                "500", "510", "520", "530", "540", "550", "560", "570",
                "580", "590", "600", "610", "620", "630", "640", "650",
                "660", "670", "680", "690", "700", "710", "720", "730",
                "740", "750", "760", "770", "780", "790", "800"
            ),
            defaultValue = "100"
        ),
        CoreOptionDef(
            key = "bsnes_sgb_bios",
            displayName = "Preferred Super Game Boy BIOS",
            values = listOf("SGB1.sfc", "SGB2.sfc"),
            defaultValue = "SGB1.sfc"
        ),
        CoreOptionDef(
            key = "bsnes_hide_sgb_border",
            displayName = "Hide SGB Border",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "bsnes_touchscreen_lightgun",
            displayName = "Touchscreen Light Gun",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "bsnes_touchscreen_lightgun_superscope_reverse",
            displayName = "Super Scope Reverse Trigger Buttons",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        )
    )
}
