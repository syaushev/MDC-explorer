package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class LDU350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Spare",
            "Spare",
            "DCU 3 bus failure",
            "DCU 2 bus failure",
            "DCU 1 bus failure",
            "RAM test failure",
            "PROM test failure",
            "Processor test failure",
            "Power supply test failure",
            "Spare",
            "Lamp voltage sense level failure",
            "LDU cross-talk failure",
            "Lamp test on",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={
            "Default",
            "Not used",
            "Not used",
            "Not used"
    };
    String [] ssm={
            "Normal",
            "No data",
            "Functional test",
            "Not used"
    };
}
