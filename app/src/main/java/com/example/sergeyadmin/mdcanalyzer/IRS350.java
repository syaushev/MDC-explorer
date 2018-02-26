package com.example.sergeyadmin.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class IRS350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "ADC source = left",
            "ADC source = right",
            "Spare",
            "Spare",
            "Time Until NAV (in BCD format)",
            "Time Until NAV (in BCD format)",
            "Time Until NAV (in BCD format)",
            "Time Until NAV (in BCD format)",
            "Time Until NAV (in BCD format)",
            "Time Until NAV (in BCD format)",
            "Time Until NAV (in BCD format)",
            "Time Until NAV (in BCD format)",
            "IRS Action Code (in BCD format)",
            "IRS Action Code (in BCD format)",
            "IRS Action Code (in BCD format)",
            "IRS Action Code (in BCD format)",
            "IRS Action Code (in BCD format)",
            "IRS Action Code (in BCD format)",
            "IRS Action Code (in BCD format)",
            "0 (always set to 0)",
            "0 (always set to 0)",
            "Parity (odd)"};

    String [] sdi={
            "Default",
            "LRU 1",
            "LRU 2",
            "LRU 3"
    };
    String [] ssm={
            "Not used",
            "Not used",
            "Not used",
            "Not used"
    };
    String[] BCDcode={
            "IRS failure; remove IRU",
            "Delayed maintenance; remove IRU when convenient",
            "Enter position",
            "Select ATT on the MSU",
            "Excess motion during align",
            "Switch DADS; air data computer not valid",
            "Check circuit breakers",
            "ISDU/CDU failure",
            "Enter MAG heading",
            "Re-enter position",
            "IRS below -15 degress; low temperature during align",
            "Not used",
            "Not used",
            "GPS 1 failure",
            "GPS 2 failure",
                       };


    public ArrayList<String> getFaults (String[] in){
        ArrayList<String> results = new ArrayList<String>();

        for (int i=2;i<14;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        //BCD units
        int units=0;
        for (int i=14;i<18;i++){

            if(in[i].equals("1")) units=(int) (units+Math.pow(2, (i-14)));

        }
        int tens=0;
        for (int i=18;i<21;i++){

            if(in[i].equals("1")) tens=(int) (tens+Math.pow(2, (i-18)));

        }

        int decint=units+tens*10;



        if(decint!=0) {

            if(decint<BCDcode.length) results.add("BCD code:"+BCDcode[decint]+"("+decint+")");
            else results.add("BCD code:"+"Code is not existing");

        }
        else if (decint==0) results.add("BCD code:"+BCDcode[0]+"("+decint+")");
        else results.add("BCD code:"+"Code is not existing");


        //End bcd


        return (results);
    }
}
