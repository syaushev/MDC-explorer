package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.05.2018.
 */

public class WXP270 extends Faults {
    String[] systemcode={	"0",
            "0",
            "Sector scan on",
            "Anticlutter (GCS) on",
            "Stabilization on",
            "Mode code",
            "Mode code",
            "Mode code",
            "+0.25 degree tilt",
            "+0.5 degree tilt",
            "+1.0 degree tilt",
            "+2.0 degree tilt",
            "+4.0 degree tilt",
            "+8.0 degreee tilt",
            "-16 degree tilt",
            "Gain code",
            "Gain code",
            "Gain code",
            "Gain code",
            "Gain code",
            "Gain code",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={	"Not used",
            "Not used",
            "Not used",
            "Not used"};
    String [] ssm={	"Normal",
            "Not used",
            "Not used",
            "Slave mode"};

    @Override
    public ArrayList<String> getFaults(String[] in, String[] systemcode) {
        ArrayList<String> results=new ArrayList<>();

        String modeCode=in[7]+in[6]+in[5];
        String gainCode=in[20]+in[19]+in[18]+in[17]+in[16]+in[15];

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

        switch (gainCode){
            case "000000":results.add("Gain code:maximum");break;
            case "000110":results.add("Gain code:+12 db");break;
            case "001100":results.add("Gain code:+6 db");break;
            case "010010":results.add("Gain code:Reserved");break;
            case "011000":results.add("Gain code:−6 db");break;
            case "011110":results.add("Gain code:−12 db");break;
            case "100100":results.add("Gain code:−18 db");break;
            case "111111":results.add("Gain code:Calibration");break;
            default:results.add("Gain code is not existing");
        }

        for (int i=2;i<5;i++){
            if(in[i].equals("1")) results.add(systemcode[i]);
        }

        for (int i=8;i<15;i++){
            if(in[i].equals("1")) results.add(systemcode[i]);
        }

        return results;



    }
}
