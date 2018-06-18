package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.06.2018.
 */

public class FCC351YdEng extends Faults {
    String[] systemcode={	"Spare",
            "FCC memory	",
            "Configuration strapping incompatibility (aircraft vs FCC)",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "AHRS lateral acceleration data",
            "Spare",
            "Yaw wraparound",
            "Spare",
            "Yaw monitor output failure",
            "Spare",
            "Current IOC serial bus",
            "Spare",
            "Yaw servo amplifier",
            "Spare",
            "Spare",
            "Rudder boost monitor output failure",
            "Spare",
            "Yaw cutout occurrence",
            "AHRS pitch rate, roll rate or yaw rate data",
            "Yaw cutout hardwarer",
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
