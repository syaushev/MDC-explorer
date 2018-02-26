package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class ADC350 extends Faults {

    String[] systemcode={	"* Source Data Indicator (SDI) code	",
            "* SDI code",
            "0",
            "0",
            "Altitude computation is not usable",
            "Indicated airspeed computation is not usable",
            "Failure of the ARINC input bus",
            "FIFO memory failure",
            "Failure of the ADC-4 cross-talk input bus",
            "Failure of the ARP input bus",
            "Temperature probe input/output (I/O) failure",
            "Internal static (Ps) sensor failure",
            "Internal pitot (Qc) sensor failure",
            "Battery failure",
            "0",
            "ADC configuration is not usable",
            "Air data module (ADM) Ps channel failure",
            "ADM Qc channel failure",
            "Ps coefficient PROM failure",
            "Qc coefficient PROM failure",
            "0",
            "** Sign Status Matrix (SSM) code",
            "** SSM code",
            "Parity (odd)"};
    String [] sdi={	"Not used",
            "1 (left)",
            "2 (right)",
            "Not used"};

    String [] ssm={	"Failure",
            "Not used",
            "Functional test",
            "Normal"};




}
