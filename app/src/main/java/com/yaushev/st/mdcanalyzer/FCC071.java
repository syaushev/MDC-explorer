package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 18.06.2018.
 */

public class FCC071 extends Faults {

    String[] systemcode={	"* SDI code",
            "* SDI code",
            "Spare",
            "Spare",
            "Spare",
            "Label 351 contents (LSB)",
            "Label 351 contents",
            "Label 351 contents",
            "Label 351 contents (MSB",
            "Spare",
            "Spare",
            "Reserved",
            "Spare",
            "Trim system failure",
            "FCC-3 cross-channel input bus failure",
            "A-IOC-3 input bus failure",
            "AHRS-1 input bus failure",
            "FCP input bus failure",
            "B-IOC-3 inout bus failure",
            "FCC failure",
            "Configuration strapping incompatibility (aircraft vs FCC)",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};


    String [] sdi={	"Not used",
            "1 (left)",
            "2 (right)",
            "Not used"};

    String [] ssm={	"Normal",
            "No data",
            "Functional test",
            "Not used"};

    String [] statusCode={
            "Repair code",
            "AP engage code",
            "AP disengage code",
            "YD enagage code",
            "YD disengage code",
            "Boost code",
            "Spare"};
    @Override
    public ArrayList<String> getFaults (String[] in, String[] systemcode){

        ArrayList<String> results = new ArrayList();

        for (int i=2;i<=4;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        //Status code

        if((in[8].equals("0")&&in[7].equals("0")&&(in[6].equals("0"))&&(in[5].equals("1")))) results.add("----\nGo to FCC351:"+statusCode[0]+"\n----");
        else if((in[8].equals("0")&&in[7].equals("0")&&(in[6].equals("1"))&&(in[5].equals("0")))) results.add("----\nGo to FCC351:"+statusCode[1]+"\n----");
        else if((in[8].equals("0")&&in[7].equals("0")&&(in[6].equals("1"))&&(in[5].equals("1")))) results.add("----\nGo to FCC351:"+statusCode[2]+"\n----");
        else if((in[8].equals("0")&&in[7].equals("1")&&(in[6].equals("0"))&&(in[5].equals("0")))) results.add("----\nGo to FCC351:"+statusCode[3]+"\n----");
        else if((in[8].equals("0")&&in[7].equals("1")&&(in[6].equals("0"))&&(in[5].equals("1")))) results.add("----\nGo to FCC351:"+statusCode[4]+"\n----");
        else if((in[8].equals("0")&&in[7].equals("1")&&(in[6].equals("1"))&&(in[5].equals("0")))) results.add("----\nGo to FCC351:"+statusCode[5]+"\n----");
        else if((in[8].equals("0")&&in[7].equals("1")&&(in[6].equals("1"))&&(in[5].equals("1")))) results.add("Status code:"+statusCode[6]);

        else results.add("Status code:entered code isn't existing");

        for (int i=9;i<21;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        return (results);
    }



}
