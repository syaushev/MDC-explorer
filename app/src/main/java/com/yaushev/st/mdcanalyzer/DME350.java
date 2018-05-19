package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class DME350 extends Faults {

    String[] systemcode={"* SDI code",
            "* SDI code",
            "Pad",
            "Video processor failure",
            "Receiver failure",
            "Distance processor failure",
            "Microprocessor ROM failure",
            "Microprocessor RAM failure",
            "BCD(units digit)",
            "BCD(units digit)",
            "BCD(units digit)",
            "BCD(units digit)",
            "BCD(tens digit)",
            "BCD(tens digit)",
            "BCD(tens digit)",
            "BCD(tens digit)",
            "Power supply failure",
            "Sznthesizer failure",
            "Transmitter failure",
            "Input bus failure at port B",
            "Input bus failure at port A",
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
            "Powers supply failure",
            "Synthesizer out-of-lock",
            "Transmitter failure",
            "Video processor failure (test)",
            "Receiver processor failure (test)",
            "Distance processor failure (test)",
            "ROM failure",
            "RAM failure",
            "Input bus failure at port B",
            "Input bus failure at port A"};


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



        if(decint!=0) {

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
