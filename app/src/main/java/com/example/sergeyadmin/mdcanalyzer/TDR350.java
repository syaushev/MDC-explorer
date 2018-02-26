package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class TDR350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Transponder failure",
            "RAM failure",
            "ROM failure",
            "Serial control (port B) failure",
            "Serial control (port A) failure",
            "Serial control (Port C) failure",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "Serial altitude (port A) failure",
            "Serial altitude (port B) failure",
            "Serial ADLP bus failure",
            "Serial TCAS bus failure",
            "Pad",
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
            "No data",
            "Functional test",
            "Normal"
    };


}
