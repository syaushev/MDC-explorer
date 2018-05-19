package com.yaushev.st.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 27.01.2018.
 */

public class AHRS351 extends Faults {



    String [] sdi={"SDI:Not used","SDI:1 left", "SDI:2 right", "SDI:3d used"};
    String [] ssm={"SSM:Failure","SSM:Not used", "SSM:STIM Mode", "SSM:Valid data"};


    public String [] systemcode=	{"* SDI code"	,
            "* SDI code"	,
            "Air data not correct"	,
            "Digital air data not correct"	,
            "Analog air data not correct"	,
            "Cosine select"	,
            "HDG gain switch 1 on"	,
            "HDG gain switch 2 on"	,
            "Mount configuration code"	,
            "Mount configuration code"	,
            "Weight on wheels (on grnd)"	,
            "STIM mode"	,
            "STIM mode ident byte"	,
            "STIM mode ident byte"	,
            "STIM mode ident byte"	,
            "STIM mode ident byte"	,
            "Hi motor voltage on"	,
            "SLW path init not complete"	,
            "Bias table calibration on"	,
            "Rev mode 1"	,
            "Test mode"	,
            "** SSM code"	,
            "** SSM code"	,
            "Parity (odd)"	};

    @Override
    public ArrayList<String> getFaults(String[] in, String[] systemcode) {
        ArrayList<String> results=new ArrayList<>();


        String unitFrontFaceCode=in[9]+in[8];
        String STIMmode=in[15]+in[14]+in[13]+in[12];
        switch (unitFrontFaceCode){
            case "00":results.add("Mount conf.code:Right");break;
            case "01":results.add("Mount conf.code:Left");break;
            case "10":results.add("Mount conf.code:Front");break;
            case "11":results.add("Mount conf.code:Aft");break;

        }

        switch (STIMmode){
            case "0000":results.add("STIM mode: not in STIM");break;
            case "0001":results.add("STIM mode: Roll only");break;
            case "0010":results.add("STIM mode: Pitch only");break;
            case "0011":results.add("STIM mode: Heading only");break;
            case "1010":results.add("STIM mode: All data");break;
            default:results.add("Such STIM code isn't existing");
        }

        for (int i=2;i<8;i++){
            if (in[i].equals("1")) results.add(systemcode[i]);
        }

        for (int i=16;i<21;i++){
            if (in[i].equals("1")) results.add(systemcode[i]);
        }





        return results;
    }
}
