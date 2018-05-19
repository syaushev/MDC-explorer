package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SECU353 extends Faults {
    String[] systemcode={
            "*SDI code",
            "*SDI code",
            "Outboard wheels >16 knots number 1 failure",
            "Outboard wheels >16 knots number 2 failure",
            "Inboard wheels >16 knots number 1 failure",
            "Inboard wheels >16 knots number 2 failure",
            "Right hand wheels >16 knots failure",
            "Left hand wheels >16 knots failure",
            "Outboard wheels >45 knots failure",
            "Inboard wheels >45 knots failure",
            "SECU 1 interconnect MAC data failure",
            "SECU 1 interconnect MAM data failure",
            "SECU 1 interconnect MBC data failure",
            "SECU 1 interconnect MBM data failure",
            "SECU 2 interconnect MAC data failure",
            "SECU 2 interconnect MAM data failure",
            "SECU 2 interconnect MBC data failure",
            "SECU 2 interconnect MBM data failure",
            "SECU discrete interconnections failure",
            "Spare",
            "Spare",
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
            "Funct/bite test",
            "Normal"
    };
}
