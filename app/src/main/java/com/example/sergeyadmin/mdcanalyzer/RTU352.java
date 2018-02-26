package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class RTU352 extends Faults {
    String[] systemcode={
            "* SDI CODE",
            "* SDI code",
            "New strap data received/stored in non-volatile memory",
            "Strap data not received",
            "I/O processor failure",
            "Display processor failure",
            "Fan failure",
            "Number 1 Comm/Nav tune source (0 = RTU, 1 = CTL-23)",
            "LA-GPBUS-1 IOC bus failure",
            "LB-GPBUS-2 IOC bus failure",
            "RA-GPBUS-1 IOC bus failure",
            "RB-GPBUS-2 IOC bus failure",
            "Reserved",
            "Reserved",
            "Reserved",
            "Reserved",
            "Pad",
            "Pad",
            "L IOC bus selection (0 = LA-GPBUS-1, 1 = LB-GPBUS-2)",
            "R IOC bus selection (0 = RA-GPBUS-1, 1 = RB-GPBUS-2)",
            "Cross-side RTU bus failure",
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
            "Failure",
            "Not used",
            "Not used",
            "Normal"
    };
}
