package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class RAC350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Altimeter failure",
            "RAM failure",
            "ROM failure",
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

    String [] sdi={
            "Not used",
            "1 (left)",
            "2 (right)",
            "Not used"
    };
    String [] ssm={
            "Failure",
            "Out of range",
            "Functional test",
            "Normal"
    };

    String[] BCDcode={	"No failures found",
            "Altimeter failure",
            "RAM failure",
            "Not used",
            "ROM failure ",
                        };


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
