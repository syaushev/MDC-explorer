package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 27.01.2018.
 */

public class AHRS351 extends Faults {

    //НЕ ГОТОВО

    String [] sdi={"SDI:Not used","SDI:1 left", "SDI:2 right", "SDI:3d used"};
    String [] ssm={"SSM:Failure","SSM:Not used", "SSM:STIM Mode", "SSM:Valid data"};
    String sdi_result, ssm_result;

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







}
