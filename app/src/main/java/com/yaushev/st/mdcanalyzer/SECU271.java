package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SECU271 extends Faults {
    String[] systemcode={
            "*SDI code",
            "*SDI code",
            "SECU 1 module A active",
            "SECU 1 module B active",
            "SECU 2 module A active",
            "SECU 2 module B active",
            "Spare",
            "SECU 1 module A failure",
            "SECU 1 module B failure",
            "SECU 2 module A failure",
            "SECU 2 module B failure",
            "Outboard GS selector valve failure",
            "Inboard GS selector valve failure",
            "Pilot and copilot RCIM do not agree",
            "Pilot RCIM RVDTs failure",
            "Copilot RCIM RVDTs failure",
            "No. 1 roll disconnect selected",
            "No. 2 roll disconnect selected",
            "Channel 1 and channel 2 FSCL do not agree",
            "Channel 1 FSCL RVDT failure",
            "Channel 2 FSCL RVDT failure",
            "**SSM code",
            "**SSM code",
            "Parity (odd)"};

    String [] sdi={
            "Not used",
            "1 (left)",
            "2 (right)",
            "Not used"
    };
    String [] ssm={
            "Failure data",
            "No data",
            "Functional test",
            "Normal"
    };
}
