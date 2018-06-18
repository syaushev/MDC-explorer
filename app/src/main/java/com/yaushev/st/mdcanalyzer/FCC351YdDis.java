package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.06.2018.
 */

public class FCC351YdDis extends Faults {
    String[] systemcode={	"Spare",
            "FCC memory	",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "AHRS lateral acceleration data",
            "Spare",
            "Yaw wraparound",
            "Spare",
            "Spare",
            "Spare",
            "Current IOC serial bus",
            "Spare",
            "Yaw servo amplifier",
            "Spare",
            "Spare",
            "Rudder boost monitor output failure",
            "Spare",
            "Yaw equalization",
            "AHRS pitch rate, roll rate or yaw rate data",
            "Spare",
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
