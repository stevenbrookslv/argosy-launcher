package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object Np2kaiManifest : CoreOptionManifest {
    override val coreId = "np2kai"
    override val options = listOf(
        CoreOptionDef(
            key = "np2kai_model",
            displayName = "PC Model",
            values = listOf("PC-9801VX", "PC-286", "PC-9801VM"),
            defaultValue = "PC-9801VX"
        ),
        CoreOptionDef(
            key = "np2kai_clk_base",
            displayName = "CPU Base Clock",
            values = listOf("2.4576 MHz", "1.9968 MHz"),
            defaultValue = "2.4576 MHz"
        ),
        CoreOptionDef(
            key = "np2kai_clk_mult",
            displayName = "CPU Clock Multiplier",
            values = listOf("1", "2", "4", "5", "6", "8", "10", "12", "16", "20", "24", "30", "36", "40", "42"),
            defaultValue = "4"
        ),
        CoreOptionDef(
            key = "np2kai_ExMemory",
            displayName = "RAM Size",
            values = listOf("1", "3", "7", "11", "13", "16", "32", "64", "120", "230"),
            defaultValue = "3"
        ),
        CoreOptionDef(
            key = "np2kai_gdc",
            displayName = "GDC",
            values = listOf("uPD7220", "uPD72020"),
            defaultValue = "uPD7220"
        ),
        CoreOptionDef(
            key = "np2kai_skipline",
            displayName = "Skipline Revisions",
            values = listOf("Full 255 lines", "ON", "OFF"),
            defaultValue = "Full 255 lines"
        ),
        CoreOptionDef(
            key = "np2kai_realpal",
            displayName = "Real Palettes",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "np2kai_lcd",
            displayName = "LCD",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "np2kai_SNDboard",
            displayName = "Sound Board",
            values = listOf(
                "PC9801-86", "PC9801-26K + 86", "PC9801-86 + Chibi-oto",
                "PC9801-118", "PC9801-86 + Mate-X PCM(B460)", "Chibi-oto",
                "Speak Board", "Spark Board", "Sound Orchestra",
                "Sound Orchestra-V", "Sound Blaster 16", "AMD-98",
                "Otomi-chanx2", "Otomi-chanx2 + 86", "None",
                "PC9801-14", "PC9801-26K"
            ),
            defaultValue = "PC9801-86"
        ),
        CoreOptionDef(
            key = "np2kai_jast_snd",
            displayName = "JastSound",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "np2kai_usefmgen",
            displayName = "Sound Generator",
            values = listOf("fmgen", "Default"),
            defaultValue = "fmgen"
        ),
        CoreOptionDef(
            key = "np2kai_volume_F",
            displayName = "Volume FM",
            values = (0..128 step 4).map { it.toString() }.toList(),
            defaultValue = "64"
        ),
        CoreOptionDef(
            key = "np2kai_volume_S",
            displayName = "Volume SSG",
            values = (0..128 step 4).map { it.toString() }.toList(),
            defaultValue = "64"
        ),
        CoreOptionDef(
            key = "np2kai_volume_A",
            displayName = "Volume ADPCM",
            values = (0..128 step 4).map { it.toString() }.toList(),
            defaultValue = "64"
        ),
        CoreOptionDef(
            key = "np2kai_volume_P",
            displayName = "Volume PCM",
            values = (0..128 step 4).map { it.toString() }.toList(),
            defaultValue = "64"
        ),
        CoreOptionDef(
            key = "np2kai_volume_R",
            displayName = "Volume RHYTHM",
            values = (0..128 step 4).map { it.toString() }.toList(),
            defaultValue = "64"
        ),
        CoreOptionDef(
            key = "np2kai_volume_C",
            displayName = "Volume CD-DA",
            values = (0..255 step 8).map { it.toString() }.toList(),
            defaultValue = "128"
        ),
        CoreOptionDef(
            key = "np2kai_Seek_Snd",
            displayName = "Floppy Seek Sound",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "np2kai_Seek_Vol",
            displayName = "Volume Floppy Seek",
            values = (0..128 step 4).map { it.toString() }.toList(),
            defaultValue = "80"
        ),
        CoreOptionDef(
            key = "np2kai_BEEP_vol",
            displayName = "Volume Beep",
            values = listOf("0", "1", "2", "3"),
            defaultValue = "3"
        ),
        CoreOptionDef(
            key = "np2kai_joy2mouse",
            displayName = "Joypad to Mouse Mapping",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "np2kai_joy2key",
            displayName = "Joypad to Keyboard Mapping",
            values = listOf("OFF", "Arrows", "Keypad"),
            defaultValue = "OFF"
        ),
    )
}
