package com.nendo.argosy.libretro.coreoptions.manifests

import com.nendo.argosy.libretro.coreoptions.CoreOptionDef
import com.nendo.argosy.libretro.coreoptions.CoreOptionManifest

object DosboxPureManifest : CoreOptionManifest {
    override val coreId = "dosbox_pure"
    override val options = listOf(
        CoreOptionDef(
            key = "dosbox_pure_force60fps",
            displayName = "Force 60 FPS Output",
            values = listOf("OFF", "ON"),
            defaultValue = "OFF"
        ),
        CoreOptionDef(
            key = "dosbox_pure_perfstats",
            displayName = "Show Performance Statistics",
            values = listOf("Disabled", "Simple", "Detailed information"),
            defaultValue = "Disabled"
        ),
        CoreOptionDef(
            key = "dosbox_pure_savestate",
            displayName = "Save States Support",
            values = listOf("Enable save states", "Enable save states with rewind", "OFF"),
            defaultValue = "Enable save states"
        ),
        CoreOptionDef(
            key = "dosbox_pure_conf",
            displayName = "Loading of dosbox.conf",
            values = listOf(
                "Disabled conf support (default)",
                "Try 'dosbox.conf' in loaded content",
                "Try '.conf' with same name as loaded content"
            ),
            defaultValue = "Disabled conf support (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_latency",
            displayName = "Input Latency",
            values = listOf("Default", "Lowest latency", "Irregular latency"),
            defaultValue = "Default"
        ),
        CoreOptionDef(
            key = "dosbox_pure_auto_target",
            displayName = "Low Latency CPU Usage",
            values = listOf(
                "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%"
            ),
            defaultValue = "90%"
        ),
        CoreOptionDef(
            key = "dosbox_pure_bind_unused",
            displayName = "Bind Unused Buttons",
            values = listOf("On", "Off"),
            defaultValue = "On"
        ),
        CoreOptionDef(
            key = "dosbox_pure_on_screen_keyboard",
            displayName = "Enable On Screen Keyboard",
            values = listOf("On", "Off"),
            defaultValue = "On"
        ),
        CoreOptionDef(
            key = "dosbox_pure_mouse_wheel",
            displayName = "Bind Mouse Wheel To Key",
            values = listOf(
                "Left-Bracket/Right-Bracket", "Comma/Period",
                "Page-Up/Page-Down", "Home/End", "Delete/Page-Down",
                "Minus/Equals", "Semicolon/Quote", "Numpad Minus/Plus",
                "Numpad Divide/Multiply", "Up/Down", "Left/Right",
                "Q/E", "Disable"
            ),
            defaultValue = "Left-Bracket/Right-Bracket"
        ),
        CoreOptionDef(
            key = "dosbox_pure_mouse_speed_factor",
            displayName = "Mouse Sensitivity",
            values = listOf(
                "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%",
                "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%", "105%",
                "110%", "115%", "120%", "130%", "140%", "150%", "160%", "170%",
                "180%", "190%", "200%", "250%", "300%", "350%", "400%", "450%", "500%"
            ),
            defaultValue = "100%"
        ),
        CoreOptionDef(
            key = "dosbox_pure_mouse_speed_factor_x",
            displayName = "Horizontal Mouse Sensitivity",
            values = listOf(
                "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%",
                "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%", "105%",
                "110%", "115%", "120%", "130%", "140%", "150%", "160%", "170%",
                "180%", "190%", "200%", "250%", "300%", "350%", "400%", "450%", "500%"
            ),
            defaultValue = "100%"
        ),
        CoreOptionDef(
            key = "dosbox_pure_mouse_input",
            displayName = "Use Mouse Input",
            values = listOf("ON", "OFF"),
            defaultValue = "ON"
        ),
        CoreOptionDef(
            key = "dosbox_pure_auto_mapping",
            displayName = "Automatic Game Pad Mappings",
            values = listOf("On (default)", "Enable with notification on game detection", "Off"),
            defaultValue = "On (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_keyboard_layout",
            displayName = "Keyboard Layout",
            values = listOf(
                "US (default)", "UK", "Belgium", "Brazil", "Croatia",
                "Czech Republic", "Denmark", "Finland", "France", "Germany",
                "Greece", "Hungary", "Iceland", "Italy", "Netherlands",
                "Norway", "Poland", "Portugal", "Russia", "Slovakia",
                "Slovenia", "Spain", "Sweden", "Switzerland (German)",
                "Switzerland (French)", "Turkey"
            ),
            defaultValue = "US (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_menu_transparency",
            displayName = "Menu Transparency",
            values = listOf("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%"),
            defaultValue = "15%"
        ),
        CoreOptionDef(
            key = "dosbox_pure_joystick_analog_deadzone",
            displayName = "Joystick Analog Deadzone",
            values = listOf("0%", "5%", "10%", "15%", "20%", "25%", "30%", "35%"),
            defaultValue = "15%"
        ),
        CoreOptionDef(
            key = "dosbox_pure_joystick_timed",
            displayName = "Enable Joystick Timed Intervals",
            values = listOf("On (default)", "Off"),
            defaultValue = "On (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_cycles",
            displayName = "Emulated Performance",
            values = listOf("AUTO", "MAX"),
            defaultValue = "AUTO"
        ),
        CoreOptionDef(
            key = "dosbox_pure_cycles_scale",
            displayName = "Performance Scale",
            values = listOf(
                "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%",
                "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%", "105%",
                "110%", "115%", "120%", "130%", "140%", "150%", "160%", "170%",
                "180%", "190%", "200%"
            ),
            defaultValue = "100%"
        ),
        CoreOptionDef(
            key = "dosbox_pure_cycle_limit",
            displayName = "Limit CPU Usage",
            values = listOf(
                "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%",
                "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%"
            ),
            defaultValue = "100%"
        ),
        CoreOptionDef(
            key = "dosbox_pure_machine",
            displayName = "Emulated Graphics Chip",
            values = listOf("SVGA (default)", "VGA", "EGA", "CGA", "Tandy", "Hercules", "PCjr"),
            defaultValue = "SVGA (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_cga",
            displayName = "CGA Mode",
            values = listOf(
                "Early model, composite mode auto (default)",
                "Early model, composite mode on",
                "Early model, composite mode off",
                "Late model, composite mode auto",
                "Late model, composite mode on",
                "Late model, composite mode off"
            ),
            defaultValue = "Early model, composite mode auto (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_hercules",
            displayName = "Hercules Color Mode",
            values = listOf("Black & white (default)", "Black & amber", "Black & green"),
            defaultValue = "Black & white (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_svga",
            displayName = "SVGA Mode",
            values = listOf(
                "S3 Trio64 (default)", "S3 Trio64 no-line buffer hack",
                "S3 Trio64 VESA 1.3", "Tseng Labs ET3000",
                "Tseng Labs ET4000", "Paradise PVGA1A"
            ),
            defaultValue = "S3 Trio64 (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_aspect_correction",
            displayName = "Aspect Ratio Correction",
            values = listOf("Off (default)", "On"),
            defaultValue = "Off (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_memory_size",
            displayName = "Memory Size",
            values = listOf(
                "Disable extended memory", "4 MB", "8 MB", "16 MB (default)",
                "24 MB", "32 MB", "48 MB", "64 MB", "96 MB", "128 MB", "224 MB"
            ),
            defaultValue = "16 MB (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_cpu_type",
            displayName = "CPU Type",
            values = listOf("Auto", "386", "386 (slow)", "386 (prefetch)", "486 (slow)", "Pentium (slow)"),
            defaultValue = "Auto"
        ),
        CoreOptionDef(
            key = "dosbox_pure_cpu_core",
            displayName = "CPU Core",
            values = listOf("Auto", "Dynamic", "Normal (interpreter)", "Simple (interpreter)"),
            defaultValue = "Auto"
        ),
        CoreOptionDef(
            key = "dosbox_pure_audiorate",
            displayName = "Audio Sample Rate",
            values = listOf("8000", "11025", "16000", "22050", "32000", "32730", "44100", "48000", "49716"),
            defaultValue = "48000"
        ),
        CoreOptionDef(
            key = "dosbox_pure_sblaster_type",
            displayName = "SoundBlaster Type",
            values = listOf(
                "SoundBlaster 16 (default)", "SoundBlaster Pro 2",
                "SoundBlaster Pro", "SoundBlaster 2.0", "SoundBlaster 1.0",
                "GameBlaster", "none"
            ),
            defaultValue = "SoundBlaster 16 (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_sblaster_adlib_mode",
            displayName = "SoundBlaster Adlib/FM Mode",
            values = listOf("Auto (default)", "CMS", "OPL-2", "Dual OPL-2", "OPL-3", "OPL-3 Gold"),
            defaultValue = "Auto (default)"
        ),
        CoreOptionDef(
            key = "dosbox_pure_sblaster_adlib_emu",
            displayName = "SoundBlaster Adlib Provider",
            values = listOf("Default", "High quality Nuked OPL3"),
            defaultValue = "Default"
        ),
        CoreOptionDef(
            key = "dosbox_pure_gus",
            displayName = "Enable Gravis Ultrasound",
            values = listOf("Off (default)", "On"),
            defaultValue = "Off (default)"
        ),
    )
}
