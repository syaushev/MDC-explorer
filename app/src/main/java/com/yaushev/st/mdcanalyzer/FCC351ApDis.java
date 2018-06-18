package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.06.2018.
 */

public class FCC351ApDis extends Faults {
    String[] systemcode={	"AHRS pitch or roll data",
            "FCC memory	",
            "Spare",
            "Spare",
            "Autopilot servo command errors",
            "Spare",
            "Attitude data not valid (I/O processor)",
            "AHRS normal acceleration data",
            "Pitch or roll wraparound, D/A to A/D",
            "Spare",
            "Yaw disengaged",
            "Roll servo amplifier",
            "Cross-channel serial bus",
            "Current IOC serial bus",
            "Pitch cutout occurrence",
            "Spare",
            "Windshear warning",
            "FCP external disengage inputs",
            "Pitch equalization",
            "Roll equalization",
            "Spare",
            "AHRS pitch rate, roll rate or yaw rate data",
            "Pitch servo amplifier",
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
