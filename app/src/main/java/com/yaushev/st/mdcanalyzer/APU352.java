package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class APU352 extends Faults {

    String[] systemcode={	"* SDI Code",
            "* SDI Code",
            "LOP switch",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Spare",
            "Shutdown code (LSB)",
            "Shutdown code",
            "Shutdown code",
            "Shutdown code",
            "Shutdown code (MSB)",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"};

    String [] sdi={	"Default",
            "Not used",
            "Not used",
            "Not used"};
    String [] ssm={	"Normal",
            "No data",
            "Not used",
            "Not used"};



    String[] BCDcode={	"OK (no shutdown)",
            "Slow acceleration",
            "DC power loss",
            "ECU fault",
            "Loss of EGT",
            "Hot shutdown",
            "LOP shutdown",
            "Spare",
            "Over current",
            "Over speed",
            "Over temperature",
            "Starter",
            "Speed loss",
            "Door position",
            "Emergency"};

    public ArrayList<String> getFaults (String[] in){
        ArrayList<String> results = new ArrayList<String>();

        for (int i=2;i<16;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        //BCD units
        int units=0;
        for (int i=16;i<20;i++){

            if(in[i].equals("1")) units=(int) (units+Math.pow(2, (i-16)));

        }
        int tens=0;


        if(in[20].equals("1")) tens=(int) (tens+Math.pow(2, (0)));



        int decint=units+tens*10;



        if(decint!=0) {

            if(decint<BCDcode.length) results.add("Shutdown code:"+BCDcode[decint]+"("+decint+")");
            else results.add("Shutdown code:"+"Code is not existing");

        }
        else if (decint==0) results.add("Shutdown code:"+BCDcode[0]+"("+decint+")");
        else results.add("Shutdown code:"+"Code is not existing");


        //End bcd



        return (results);
    }

}
