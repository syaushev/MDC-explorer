package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class ADF350 extends Faults{


    String[] systemcode={	"* SDI code",
            "* SDI code",
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
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "Pad",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={	"Not used",
            "1 (left)",
            "2 (right)",
            "Not used"};
    String [] ssm={	"Failure",
            "No data",
            "Functional test",
            "Normal"};

    int units;
    int tens;
    int number;

    @Override
    public ArrayList<String> getFaults(String[] in, String[] systemcode) {

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
            case 0 :results.add("BCD code:  No failures found");break;
            case 11:results.add("BCD code: Input bus failure at port A");break;
            case 12:results.add("BCD code: No ADF frequency at port A");break;
            case 13:results.add("BCD code: Frequency cannot be used at port A");break;
            case 14:results.add("BCD code: Input bus failure at port B");break;
            case 15:results.add("BCD code: No ADF frequency at port B");break;
            case 16:results.add("BCD code: Frequency cannot be used at port B");break;
            case 17:results.add("BCD code: Reserved");break;
            case 18:results.add("BCD code: Reserved");break;
            case 19:results.add("BCD code: Reserved");break;
            case 20:results.add("BCD code: No new bearing data");break;
            case 21:results.add("BCD code: Not used");break;
            case 22:results.add("BCD code: B+ failure");break;
            case 23:results.add("BCD code: B- failure");break;
            case 24:results.add("BCD code: RAM failure, I/O processor");break;
            case 25:results.add("BCD code: Analog to digital failure");break;
            case 26:results.add("BCD code: Sine modulation failure");break;
            case 27:results.add("BCD code: Cosine modulation failure");break;
            case 28:results.add("BCD code: SMO lock failure");break;
            case 29:results.add("BCD code: Antenna power failure");break;
            case 30:results.add("BCD code: Low signal level, or no rec’v station");break;
            case 31:results.add("BCD code: Detector out of lock, or no rec’v station");break;
            case 32:results.add("BCD code: AGD out of range, or no rec’v station");break;
            case 33:results.add("BCD code: HF key line low, or no rec’v station");break;
            default:results.add("BCD code isn't existing");

        }

    return results;
    }





}
