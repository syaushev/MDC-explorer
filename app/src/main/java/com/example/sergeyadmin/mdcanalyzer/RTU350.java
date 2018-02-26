package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class RTU350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "EHSV T/M coil failure",
            "Steering on",
            "Nosewheel centered",
            "Steer-by-wire failure",
            "ECU failure",
            "Pilot handwheel failure",
            "Copilot handwheel failure",
            "Rudder pedal RVDT failure",
            "Selector valve failure",
            "Pressure switch failure",
            "EHSV failure",
            "Right FB RVDT failure",
            "Left FB RVDT failure",
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
            "Failure",
            "Not used",
            "Not used",
            "Normal"
    };
}
