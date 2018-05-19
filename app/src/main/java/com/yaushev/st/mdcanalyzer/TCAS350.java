package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class TCAS350 extends Faults {
    String[] systemcode={
            "0",
            "0",
            "TCAS computer unit failure",
            "Top antenna failure",
            "Bottom antenna failure",
            "1 = no input or input failure from radio altimeter 1",
            "1 = no input or input failure from radio altimeter 2",
            "1 = no input or input failure from transponder 1",
            "1 = no input or input failure from transponder 2",
            "L-AHC-3 input bus failure (attitude)",
            "L-AHC-3 input bus failure (magnetic heading)",
            "TCAS system failure",
            "Spare",
            "Spare",
            "TA display system 1 failure",
            "TA display system 2 failure",
            "RA display system 1 failure",
            "RA display system 2 failure",
            "*No input for the central fault display",
            "*1 = BITE stopped, CMC function",
            "*1 = command word acknowledge, CMC function",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={
            "Not used",
            "Not used",
            "Not used",
            "Not used"
    };
    String [] ssm={
            "Normal",
            "No computed data",
            "Functional test",
            "Failure"
    };
}
