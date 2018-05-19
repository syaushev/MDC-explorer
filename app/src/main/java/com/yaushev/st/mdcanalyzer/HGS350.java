package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class HGS350 extends Faults {
    String[] systemcode={
            "0",
            "0",
            "HGS computer failure",
            "Combiner failure",
            "HGS control panel failure",
            "Overhead unit failure",
            "Display electronic unit failure",
            "Reserved (always = 0)",
            "TCAS input failure",
            "Reserved (always = 0)",
            "RB-IOC-1 input failure",
            "LB-IOC-1 input failure",
            "Radio altimeter converter (RAC) 1 input failure",
            "RAC 2 input failure",
            "DME 1 input failure",
            "VIR 2 input failure",
            "VIR 1 input failure",
            "DADC 2 input failure",
            "DADC 1 input failure",
            "IRS 2/AHRS input failure",
            "IRS 1/AHRS input failure",
            "**SSM code",
            "**SSM code",
            "Parity (odd)"};

    String [] sdi={
            "Not used",
            "Not used",
            "Not used",
            "Not used"
    };
    String [] ssm={
            "Fail warning",
            "No data",
            "Functional test",
            "Normal"
    };
}
