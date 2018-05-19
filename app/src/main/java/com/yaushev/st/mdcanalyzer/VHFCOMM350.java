package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.05.2018.
 */

public class VHFCOMM350 extends Faults {
    String[] systemcode={	"* SDI code	",
            "* SDI code	",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "0",
            "0",
            "0",
            "0",
            "0",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={	"Not used",
            "1 (left)",
            "2 (right)",
            "3rd unit"};
    String [] ssm={	"Failure",
            "No data",
            "Functional test",
            "Normal"};

    @Override
    public ArrayList<String> getFaults(String[] in, String[] systemcode) {
        int units;
        int tens;
        int number;
        units=(int) (Integer.parseInt(in[8])*Math.pow(2, 0)+Integer.parseInt(in[9])*Math.pow(2, 1)+Integer.parseInt(in[10])*Math.pow(2, 2)+Integer.parseInt(in[11])*Math.pow(2, 3));
        tens=(int) (Integer.parseInt(in[12])*Math.pow(2, 0)+Integer.parseInt(in[13])*Math.pow(2, 1)+Integer.parseInt(in[14])*Math.pow(2, 2)+Integer.parseInt(in[15])*Math.pow(2, 3));
        number=tens*10+units;

        ArrayList<String> results=new ArrayList<>();

        for(int i=2;i<8;i++){
            if(in[i].equals("1")) results.add(systemcode[i]);
        }

        for(int i=16;i<21;i++){
            if(in[i].equals("1")) results.add(systemcode[i]);
        }

        switch(number){
            case 0:results.add("BCD code: No failures found");break;
            case 1:results.add("BCD code:5 volts dc level low (test)");break;
            case 2:results.add("BCD code:5 volts dc level high (test)");break;
            case 3:results.add("BCD code:12 volts dc level low (test)");break;
            case 4:results.add("BCD code:12 volts dc level high (test)");break;
            case 5:results.add("BCD code:Synthesizer out-of-lock");break;
            case 6:results.add("BCD code:Not used");break;
            case 7:results.add("BCD code:Noise squelch open without signal (test)");break;
            case 8:results.add("BCD code:Noise squelch closed without signal (test)");break;
            case 9:results.add("BCD code:Not used");break;
            case 10:results.add("BCD code:Not used");break;
            case 11:results.add("BCD code:No VHF frequency received");break;
            case 12:results.add("BCD code:Frequency received not valid");break;
            case 13:results.add("BCD code:Not used");break;
            case 14:results.add("BCD code:Internal frequency not valid");break;
            case 15:results.add("BCD code:Frequency out-of-range");break;
            case 16:results.add("BCD code:Forward power low");break;
            case 17:results.add("BCD code:Transmitter temperature high");break;
            case 21:results.add("BCD code:Tune volts failure at high frequency (test)");break;
            case 22:results.add("BCD code:Tune volts failure at low frequency (test)");break;
            case 23:results.add("BCD code:Oscillator output low (test)");break;
            case 24:results.add("BCD code:No signal AGC level high (test)");break;
            case 25:results.add("BCD code:AGC failure with signal (test)");break;
            case 26:results.add("BCD code:Reflected power high");break;
            case 27:results.add("BCD code:Transmitter time-out");break;
            case 98:results.add("BCD code:Input bus failure at port A");break;
            case 99:results.add("BCD code:Input bus failure at port B");break;
            default:results.add("Entered BCD code is not existing");

        }


        return results;
    }
}
