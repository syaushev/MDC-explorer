package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 27.01.2018.
 */

public class AHRS350 extends Faults{

    String [] sdi={"SDI:Not used","SDI:1 left", "SDI:2 right", "SDI:3d used"};
    String [] ssm={"SSM:Failure","SSM:Not used", "SSM:STIM Mode", "SSM:Valid data"};



    String [] systemcode=	{"	* SDI code	"	,
            "* SDI code"	,
            "Heading not satisfactory"	,
            "Attitude not satisfactory"	,
            "Rate compare not satisfactory"	,
            "Acceleration compare not satisfactory"	,
            "Checksum not satisfactory"	,
            "Alignment not satisfactory"	,
            "Flux detector data not satisfactory"	,
            "I/O data not satisfactory"	,
            "Hardware not satisfactory"	,
            "Wheel 1 failure"	,
            "Wheel 2 failure"	,
            "Initialization mode not completed"	,
            "High rate not satisfactory"	,
            "Box orientation not satisfactory"	,
            "RAM backup cannot be used (low battery)"	,
            "Wraparound disabled (normally 1)"	,
            "Compensation mode"	,
            "Directional gyro (DG) mode (not slaved)"	,
            "ADC input bus failure"	,
            "** SSM code"	,
            "** SSM code"	,
            "Parity (odd)"	};


}

