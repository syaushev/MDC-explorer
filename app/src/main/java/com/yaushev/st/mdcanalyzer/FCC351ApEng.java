package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.06.2018.
 */

public class FCC351ApEng extends Faults {

    String[] systemcode={	"AHRS pitch or roll data",
            "FCC memory",
            "Configuration strapping incompatibility (aircraft vs FCC)",
            "Identification number incompatibility (left vs right FCCs)",
            "Autopilot servo command errors",
            "Roll cutout hardware",
            "Attitude data not valid (I/O processor)",
            "AHRS normal acceleration data",
            "Pitch or roll wraparound, D/A to A/D",
            "Pitch trim fail annunciator lamp test",
            "Yaw disengaged	",
            "Autopilot monitor output",
            "Cross-channel serial bus",
            "Current IOC serial bus",
            "Spare",
            "Pitch cutout hardware",
            "Windshear warning",
            "FCP external disengage inputs",
            "Pitch cutout occurrence",
            "Roll cutout occurrence",
            "Yaw cutout occurrence",
            "AHRS pitch rate, roll rate or yaw rate data",
            "Pitch or roll servo amplifier",
            "Parity (odd)"};


    @Override
    public ArrayList<String> getFaults(String[] in, String[] systemcode) {
        ArrayList<String> results = new ArrayList();

        for (int i=0;i<23;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        return results;
    }

}
