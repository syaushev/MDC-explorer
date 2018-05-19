package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 17.05.2018.
 */

public class ADC351 extends Faults {

    String[] systemcode = {
            "* SDI code",
            "* SDI code",
            "0",
            "0",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Fault field",
            "Identification (Ident) field (LSB)",
            "Ident field",
            "Ident field",
            "Ident field (MSB)",
            "0",
            "** SSM code",
            "** SSM code",
            "Parity (odd)"
    };
    String[] identcode1={
         "Computational code:Pressure/baro altitude",
         "Computational code:Speed ref independent",
         "Computational code:SAT/TAT",
         "Computational code:True airspeed",
         "Computational code:Indicated airspeed",
         "Computational code:Mach (true/displayed)",
         "Computational code:Vmo",
         "Computational code:Cross compare error",
         "Computational code:SSEC",
         "Computational code:Trend vector",
         "0",
         "0"
    };
    String[] identcode2={
            "I/O code:ARINC bus input",
            "I/O code:FIFO",
            "I/O code:RS422 bus, cross-side ADC",
            "I/O code:RS422 bus, ARP",
            "I/O code:RS232",
            "I/O code:Temperature probe",
            "I/O code:Alt preselect is not usable",
            "I/O code:Vertical accel (AHRS)",
            "I/O code:Relays",
            "",
            "",
            ""
    };
    String[] identcode3={
            "Hardware code:Counters (ABS)",
            "Hardware code:Counters (DIF)",
            "Hardware code:Control validity bit 6",
            "Hardware code:Control validity bit 7",
            "Hardware code:Ps source equalization",
            "Hardware code:Qc source equalization",
            "Hardware code:Battery failure",
            "Hardware code:X-side speed ref sync",
            "",
            "",
            "Hardware code:Ps foreground",
            "Hardware code:Qc foreground"
    };
    String[] identcode4={
            "Memory code:ACM /ADC/Strapping incompatible",
            "Memory code:ACM (ABS)",
            "Memory code:Ps PROM",
            "Memory code:ACM (DIF)",
            "Memory code:PROM",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    String [] sdi={	"Not used",
            "1 (left)",
            "2 (right)",
            "Not used"};

    String [] ssm={	"Failure",
            "Not used",
            "Functional test",
            "Normal"};



    public ArrayList<String> getFaults(String[] in) {

        String identcode=in[19]+in[18]+in[17]+in[16];
        ArrayList<String> results=new ArrayList<>();

        switch (identcode){
            case "0001":
                for(int i=4; i<16;i++){
                    if(in[i].equals("1")) results.add(identcode1[i-4]);
                }



                break;
            case "0010":
                for(int i=4; i<16;i++){
                    if(in[i].equals("1")) results.add(identcode2[i-4]);
                }


                break;
            case "0011":
                for(int i=4; i<16;i++){
                    if(in[i].equals("1")) results.add(identcode3[i-4]);
                }




                break;
            case "0100":
                for(int i=4; i<16;i++){
                    if(in[i].equals("1")) results.add(identcode4[i-4]);
                }


                break;
            default:results.add("Such ident code isn't existing");

        }

        return results;

    }
}



