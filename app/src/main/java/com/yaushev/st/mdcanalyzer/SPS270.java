package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SPS270 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Stall aural warning",
            "SPS failure",
            "SPS maintenance word not empty (0= empty)",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Stick-shaker phase advance inhibition",
            "Stick-pusher command active",
            "Stick-shaker command active",
            "Auto-ignition command active",
            "Autopilot disconnect command active",
            "Visual warning active",
            "G-switch test active",
            "Spare",
            "Spare",
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
            "Normal",
            "No data",
            "Functional test",
            "Failure"
    };
}
