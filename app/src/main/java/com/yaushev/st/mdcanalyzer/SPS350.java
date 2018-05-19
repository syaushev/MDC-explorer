package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SPS350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "SPC internal failure",
            "Angle of attack failure",
            "Primary mach failure",
            "Secondary mach failure",
            "Lateral acceleration failure (AHRS)",
            "Flap position failure",
            "Aircraft correction failure",
            "ASIC APL/watchdog failure",
            "WOW (WOW 1 or WOW 2) failure",
            "Stick-pusher failure",
            "Stick-pusher output failure",
            "Stick-shaker output failure",
            "Auto-ignition output failure",
            "Visual-warning output failure",
            "Autopilot output failure",
            "G-switch-test output failure",
            "BITE status (0 = memory empty, 1 = not empty)",
            "No data exchange between SPC channels (1 = failure)",
            "Mach transducer disagree",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={
            "All call",
            "Channel 1",
            "Channel 2",
            "Not used"
    };
    String [] ssm={
            "Failure",
            "No data",
            "Functional test",
            "Normal"
    };
}
