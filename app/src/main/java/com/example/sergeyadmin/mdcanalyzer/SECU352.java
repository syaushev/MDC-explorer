package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SECU352 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Ground-spoiler manual select switch failure",
            "Left throttle idle switch failure",
            "Right throttle idle switch failure",
            "Left throttle minimum-to switch failure",
            "Right throttle minimum-to switch failure",
            "Left engine N1 failure",
            "Right engine N1 failure",
            "PSEU channel 1 failure",
            "PSEU channel 2 failure",
            "Air data computer 2 failure",
            "Air data computer 2 failure",
            "Data from the two air data computers do not agree",
            "Flap position 1 failure",
            "Flap position 2 failure",
            "Flap position 1 and 2 do not agree",
            "Radio altitude 1 failure",
            "Radio altitude 2 failure",
            "Radio altitude 1 and 2 do not agree",
            "Spare",
            "** SSM code",
            "** SSM code",
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
