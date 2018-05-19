package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class MFD350 extends Faults {
    String[] systemcode={
            "* EFD mode",
            "* EFD mode",
            "LA-IOC activity",
            "LB-IOC activity",
            "RA-IOC activity",
            "RB-IOC activity",
            "TCAS failure",
            "ARINC wraparound 1 failure",
            "ARINC wraparound 2 failure",
            "High voltage power supply failure",
            "Low voltage power supply failure",
            "RAM failure",
            "ROM failure",
            "I/O failure",
            "NVM failure",
            "Main processor failure",
            "Display processor failure",
            "Video amplifier failure",
            "Deflection amplifier failure",
            "Reserved",
            "Spare",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={
            "PFD",
            "MFD",
            "EICAS",
            "Not used"
    };
    String [] ssm={
            "Failure",
            "No data",
            "Functional test",
            "Normal"
    };
}
