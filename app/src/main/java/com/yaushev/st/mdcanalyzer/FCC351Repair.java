package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.06.2018.
 */

public class FCC351Repair extends Faults{
    String[] systemcode={	"I/O processor reset",
            "FCC memory",
            "Yaw equalization",
            "Flight control panel serial bus",
            "Autopilot servo command errors",
            "Main processor reset",
            "CPU time errors",
            "Pitch or roll equalization",
            "Pitch or roll wraparound, digital/analog (D/A) to analog/digital",
            "Yaw wraparound, D/A to analog/digital (A/D)",
            "AHRS serial bus",
            "AP or YD hardware monitor output",
            "Cross-channel serial bus",
            "IOC-A or IOC-B serial bus",
            "Panel disconnect circuitry",
            "Yaw servo amplifier",
            "Spare",
            "Yaw cutout hardware",
            "Pitch or roll cutout hardware",
            "Pitch, roll or yaw cutout occurred",
            "Rudder boost system",
            "Pitch, roll or yaw trim system",
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
