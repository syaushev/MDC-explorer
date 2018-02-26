package com.example.sergeyadmin.mdcanalyzer;

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

    String[] BCDcode={	"No failures found",
            "Input bus failure at port A",
            "No ADF frequency at port A",
            "Frequency cannot be used at port A",
            "Input bus failure at port B",
            "No ADF frequency at port B",
            "Frequency cannot be used at port B",
            "Reserved",
            "Reserved",
            "Reserved",
            "No new bearing data",
            "Not used",
            "B+ failure",
            "B- failure",
            "RAM failure, I/O processor",
            "Analog to digital failure",
            "Sine modulation failure",
            "Cosine modulation failure",
            "SMO lock failure",
            "Antenna power failure",
            "Low signal level, or no rec’v station",
            "Detector out of lock, or no rec’v station",
            "AGD out of range, or no rec’v station",
            "HF key line low, or no rec’v station",
            "DC sine failure, or no rec’v station",
            "DC cosine failure, or no rec’v station"};



    public ArrayList<String> getFaults (String[] in){
        ArrayList<String> results = new ArrayList<String>();

        for (int i=2;i<8;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        //BCD units
        int units=0;
        for (int i=8;i<12;i++){

            if(in[i].equals("1")) units=(int) (units+Math.pow(2, (i-8)));

        }
        int tens=0;
        for (int i=12;i<16;i++){

            if(in[i].equals("1")) tens=(int) (tens+Math.pow(2, (i-12)));

        }

        int decint=units+tens*10;



        if(decint!=0&&decint>10) {
            decint=decint-10;
            if(decint<BCDcode.length) results.add("BCD code:"+BCDcode[decint]+"("+decint+")");
            else results.add("BCD code:"+"Code is not existing");

        }
        else if (decint==0) results.add("BCD code:"+BCDcode[0]+"("+decint+")");
        else results.add("BCD code:"+"Code is not existing");


        //End bcd

        for (int i=16;i<21;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }

        return (results);
    }
}
