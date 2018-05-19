package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class TDR350 extends Faults{
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Transponder failure",
            "RAM failure",
            "ROM failure",
            "Serial control (port B) failure",
            "Serial control (port A) failure",
            "Serial control (Port C) failure",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (units digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "BCD (tens digit)",
            "Serial altitude (port A) failure",
            "Serial altitude (port B) failure",
            "Serial ADLP bus failure",
            "Serial TCAS bus failure",
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
            case 0: results.add("BCD code:No failures found");break;
            case 11:results.add("BCD code:+5 Vdc supply failure");break;
            case 12:results.add("BCD code:+70 Vdc supply failure");break;
            case 13:results.add("BCD code:+35 Vdc failure");break;
            case 14:results.add("BCD code:Low voltage power supply failure");break;
            case 21:results.add("BCD code:Final stage over current");break;
            case 22:results.add("BCD code:Top antenna low power output");break;
            case 23:results.add("BCD code:Bottom antenna low power output");break;
            case 24:results.add("BCD code:Transmitter over temperature");break;
            case 31:results.add("BCD code:Lock detect");break;
            case 32:results.add("BCD code:Low power detect");break;
            case 41:results.add("BCD code:Top receiver channel failure");break;
            case 42:results.add("BCD code:Bottom receiver channel failure");break;
            case 43:results.add("BCD code:Top DPSK demodulator failure");break;
            case 44:results.add("BCD code:Bottom DPSK demodulator failure");break;
            case 51:results.add("BCD code:High-byte ROM failure");break;
            case 52:results.add("BCD code:Low-byte ROM failure");break;
            case 53:results.add("BCD code:Both ROM chips failure");break;
            case 61:results.add("BCD code:High-byte RAM failure");break;
            case 62:results.add("BCD code:Low-byte RAM failure");break;
            case 63:results.add("BCD code:Both RAM chips failure");break;
            case 64:results.add("BCD code:Cache RAM failure");break;
            case 65:results.add("BCD code:Cache RAM and high-byte RAM failure");break;
            case 66:results.add("BCD code:Cache RAM and low-byte RAM failure");break;
            case 67:results.add("BCD code:Cache RAM and both RAM chips failure");break;
            case 68:results.add("BCD code:Dual port RAM failure");break;
            case 70:results.add("BCD code:Non-volatile RAM failure");break;
            case 81:results.add("BCD code:ARINC 429 control UART failure");break;
            case 82:results.add("BCD code:ARINC 429 control part A inactive");break;
            case 83:results.add("BCD code:ARINC 429 control part B inactive");break;
            case 84:results.add("BCD code:ARINC 429 control part C inactive");break;
            case 85:results.add("BCD code:CSDB control port A inactive");break;
            case 91:results.add("BCD code:ARINC 429/575 altitude UART failure");break;
            case 92:results.add("BCD code:ARINC 429/575 altitude port A inactive");break;
            case 93:results.add("BCD code:ARINC 429/575 altitude port B inactive");break;
            case 94:results.add("BCD code:CSDB altitude port A inactive");break;
            case 95:results.add("BCD code:CSDB altitude port B inactive");break;
            default:results.add("Code isn't existing");

        }

        return results ;


    }
}
