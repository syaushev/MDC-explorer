package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.05.2018.
 */

public class WXR354 extends Faults {
    String[] systemcode={	"* SDI code (on MFD)",
            "* SDI code (on MFD)",
            "Slaved mode on	",
            "Not used",
            "Not used",
            "Turbulence alert on",
            "Weather alert on",
            "Anti-clutter on",
            "Sector scan on",
            "Stab limits reached (30 degrees)",
            "Spare",
            "Input control bus failure",
            "Spare",
            "Altitude input failure",
            "Control data failure",
            "Antenna failure",
            "Xmtr/receiver failure",
            "Stabilization on",
            "Mode code",
            "Mode code",
            "Mode code",
            "1",
            "1",
            "Parity (odd)"};
    String [] sdi={	"Not used",
            "1 (left)",
            "2 (right)",
            "Not used"};
    String [] ssm={	"Not used",
            "Not used",
            "Not used",
            "Not used"};

    @Override
    public ArrayList<String> getFaults(String[] in, String[] systemcode) {
        ArrayList<String> results=new ArrayList<>();

        String modeCode=in[20]+in[19]+in[17];
        switch (modeCode){
            case "000":results.add("Mode code: Standby");break;
            case "001":results.add("Mode code: Weather (WX) only");break;
            case "010":results.add("Mode code: Map");break;
            case "011":results.add("Mode code: Reserved");break;
            case "100":results.add("Mode code: Test");break;
            case "101":results.add("Mode code: Turbulence only");break;
            case "110":results.add("Mode code: WX + turbulence");break;
            case "111":results.add("Mode code: Reserved");break;
            default:results.add("Mode code is not existing");

        }

        for (int i=2;i<17;i++){
            if(in[i].equals("1"))results.add(systemcode[i]);
        }
        return results;
    }
}
