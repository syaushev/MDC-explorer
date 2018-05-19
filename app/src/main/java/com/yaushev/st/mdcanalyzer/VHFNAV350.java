package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.05.2018.
 */

public class VHFNAV350 extends Faults {

    String[] systemcode={	"	* SDI code	",
            "	* SDI code	",
            "	Pad	",
            "	Pad	",
            "	Pad	",
            "	Pad	",
            "	Pad	",
            "	Pad	",
            "	BCD (units digit)	",
            "	BCD (units digit)	",
            "	BCD (units digit)	",
            "	BCD (units digit)	",
            "	BCD (tens digit)	",
            "	BCD (tens digit)	",
            "	BCD (tens digit)	",
            "	BCD (tens digit)	",
            "	VOR failure	",
            "	LOC failure	",
            "	GS failure	",
            "	Frequency  failure	",
            "	Radio failure	",
            "	** SSM code	",
            "	** SSM code	",
            "	Parity (odd)	"};

    String [] sdi={	"	Not used	",
            "	1 (left)	",
            "	2 (right)	",
            "	Not used	"};


    String [] ssm={	"	Failure	",
            "	No data	",
            "	Functional test	",
            "	Normal	"};


    @Override
    public ArrayList<String> getFaults(String[] in, String[] systemcode) {
        int units;
        int tens;
        int number;
        units = (int) (Integer.parseInt(in[8]) * Math.pow(2, 0) + Integer.parseInt(in[9]) * Math.pow(2, 1) + Integer.parseInt(in[10]) * Math.pow(2, 2) + Integer.parseInt(in[11]) * Math.pow(2, 3));
        tens = (int) (Integer.parseInt(in[12]) * Math.pow(2, 0) + Integer.parseInt(in[13]) * Math.pow(2, 1) + Integer.parseInt(in[14]) * Math.pow(2, 2) + Integer.parseInt(in[15]) * Math.pow(2, 3));
        number = tens * 10 + units;

        ArrayList<String> results = new ArrayList<>();

        for (int i = 2; i < 8; i++) {
            if (in[i].equals("1")) results.add(systemcode[i]);
        }

        for (int i = 16; i < 21; i++) {
            if (in[i].equals("1")) results.add(systemcode[i]);
        }


        switch(number){
            case 0:results.add("BCD code:No failures found");break;
            case 1:results.add("BCD code:Not used");break;
            case 2:results.add("BCD code:RAM failure");break;
            case 3:results.add("BCD code:CSDB synchronization not received");break;
            case 4:results.add("BCD code:CSDB frequency not received");break;
            case 5:results.add("BCD code:Nav frequency not valid");break;
            case 6:results.add("BCD code:ILS mode and delayed ILS line are not the same");break;
            case 7:results.add("BCD code:Not used");break;
            case 8:results.add("BCD code:Not used");break;
            case 9:results.add("BCD code:Processor port 1 has an I/O bus failure");break;
            case 10:results.add("BCD code:Processor port 2 has an I/O bus failure");break;
            case 11:results.add("BCD code:A/D busy");break;
            case 12:results.add("BCD code:A/D reference test failure");break;
            case 13:results.add("BCD code:+13 volts dc level test failure");break;
            case 14:results.add("BCD code:-13 volt dc level test failure");break;
            case 15:results.add("BCD code:Not used");break;
            case 16:results.add("BCD code:Not used");break;
            case 17:results.add("BCD code:VOR synthesizer out-of-lock");break;
            case 18:results.add("BCD code:AFC not locked, or no receiver station");break;
            case 19:results.add("BCD code:No 30-Hz reference signal, or no receiver station");break;
            case 20:results.add("BCD code:No 30-Hz variation signal, or no receiver station");break;
            case 25:results.add("BCD code:LOC synthesizer out-of-lock");break;
            case 26:results.add("BCD code:LOC signal level low, or no receiver station");break;
            case 28:results.add("BCD code:GS synthesizer out-of-lock");break;
            case 29:results.add("BCD code:GS level signal low, or no receiver station");break;
            case 30:results.add("BCD code:Marker beacon receiver failure");break;
            case 40:results.add("BCD code:No data at input port A");break;
            case 41:results.add("BCD code:No frequency at input port A");break;
            case 42:results.add("BCD code:No data at input port B");break;
            case 43:results.add("BCD code:No frequency at input port B");break;
            case 44:results.add("BCD code:No internal frequency at the processor");break;
            default:results.add("Entered BCD code is not existing");
        }

        return results;
    }


}
