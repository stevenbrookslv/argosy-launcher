package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object HandyManifest : CoreOptionManifest {
    override val coreId = "handy"
    override val options = listOf(
        CoreOptionDef(
            key = "handy_refresh_rate",
            displayName = "Video Refresh Rate",
            values = listOf("50", "60", "75", "100", "120"),
            defaultValue = "60"
        ),
        CoreOptionDef(
            key = "handy_rot",
            displayName = "Display Rotation",
            values = listOf("Auto", "None", "270", "180", "90"),
            defaultValue = "Auto"
        ),
        CoreOptionDef(
            key = "handy_gfx_colors",
            displayName = "Color Depth (Restart Required)",
            values = listOf("16bit", "24bit"),
            defaultValue = "16bit"
        ),
        CoreOptionDef(
            key = "handy_lcd_ghosting",
            displayName = "LCD Ghosting Filter",
            values = listOf("disabled", "2frames", "3frames", "4frames"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "handy_overclock",
            displayName = "CPU Overclock Multiplier",
            values = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20", "30", "40", "50"),
            defaultValue = "1"
        ),
        CoreOptionDef(
            key = "handy_frameskip",
            displayName = "Frameskip",
            values = listOf("disabled", "auto", "manual"),
            defaultValue = "disabled"
        ),
        CoreOptionDef(
            key = "handy_frameskip_threshold",
            displayName = "Frameskip Threshold (%)",
            values = listOf("15", "18", "21", "24", "27", "30", "33", "36", "39", "42", "45", "48", "51", "54", "57", "60"),
            defaultValue = "33"
        ),
    )
}
