package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class CDU354 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Deflection failure",
            "Video amplifier failure",
            "Keyboard failure",
            "RAM test failure",
            "ROM test failure",
            "Display generator failure (FIFO failure)",
            "FMC-3 input failure",
            "Reserved",
            "Reserved",
            "Reserved",
            "Reserved",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "High voltage power supply failure",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};
    String [] sdi={
            "Default",
            "1 (left)",
            "2 (right)",
            "Not used"
    };
    String [] ssm={
            "Normal",
            "No data",
            "Test",
            "Failure"
    };
}
