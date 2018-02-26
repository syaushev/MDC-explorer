package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class MFD351 extends Faults {
    String[] systemcode={
            "* EFD mode",
            "* EFD mode",
            "DCU 1 failure",
            "DCU 2 failure",
            "DCU 3 failure (only if installed)",
            "Engine 1 failure",
            "Engine 2 failure",
            "EICAS control panel failure",
            "AHRS/IRS 1 failure",
            "AHRS/IRS 2 failure",
            "AHRS/IRS 3 failure",
            "AHRS/IRS 4 failure",
            "L-FMC failure (only if installed)",
            "R-FMC failure (only if installed)",
            "WXR failure",
            "MDC failure",
            "L-DCP failure",
            "R-DCP failure",
            "L-ADC failure",
            "R-ADC failure",
            "HGS failure (only if installed)",
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
