package com.example.sergeyadmin.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class FMS350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Navigation data base memory failure",
            "Navigation data base write error",
            "FMC fault code (LSB)",
            "FMC fault code",
            "FMC fault code (MSB)",
            "Spare",
            "DBU input failure",
            "CDU input failure (onside)",
            "IOC 1A input failure",
            "IOC 1B input failure",
            "IOC 2A input failure",
            "IOC 2B input failure",
            "FMC-4 cross-talk input failure",
            "Reserved",
            "Reserved",
            "Low battery",
            "I/O dual port failure",
            "Navigation program is not operational",
            "FMC clock oscillator failure",
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
            "Normal",
            "No data",
            "Functional test",
            "Failure"
    };
    String [] FMSfaultcode={
            " No failures",
            "NAV local RAM failure",
            "NAV battery RAM failure",
            "NAV boot memory failure",
            "NAV application memory failure",
            "NAV parameter block failure"
                };

    public ArrayList<String> getFaults (String[] in){

        ArrayList<String> results = new ArrayList<String>();

        for (int i=2;i<4;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        //Status code

        if((in[6].equals("0")&&(in[5].equals("0"))&&(in[4].equals("0")))) results.add("FMS fault code:"+FMSfaultcode[0]);
        else if((in[6].equals("0")&&(in[5].equals("0"))&&(in[4].equals("1")))) results.add("FMS fault code:"+FMSfaultcode[1]);
        else if((in[6].equals("0")&&(in[5].equals("1"))&&(in[4].equals("0")))) results.add("FMS fault code:"+FMSfaultcode[2]);
        else if((in[6].equals("0")&&(in[5].equals("1"))&&(in[4].equals("1")))) results.add("FMS fault code:"+FMSfaultcode[3]);
        else if((in[6].equals("1")&&(in[5].equals("0"))&&(in[4].equals("0")))) results.add("FMS fault code:"+FMSfaultcode[4]);
        else if((in[6].equals("1")&&(in[5].equals("0"))&&(in[4].equals("1")))) results.add("FMS fault code:"+FMSfaultcode[5]);
        else results.add("FMS fault code:entered code isn't existing");

        for (int i=7;i<21;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        return (results);
    }


}
