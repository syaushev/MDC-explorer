package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.06.2018.
 */

public class FCC351Boost extends Faults {
    String[] systemcode={	"Spare",
            "FCC memory",
            "Configuration strapping incompatibility (aircraft vs FCC)",
            "Identification number incompatibility (left vs right FCCs)",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Yaw wraparound",
            "Spare",
            "Spare",
            "Cross-channel serial bus",
            "Spare",
            "Spare",
            "Yaw servo amplifier",
            "Spare",
            "Spare",
            "Rudder boost monitor output failure",
            "Spare",
            "Yaw equalization",
            "Rudder boost data",
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
