package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SECU351 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Pilot’s roll priority switch failure",
            "Copilot’s roll priority switch failure",
            "Roll disconnect switch failure",
            "Spare",
            "Spare",
            "Spare",
            "GS test not performed",
            "Left outboard ground-spoiler position cannot be used",
            "Right outboard ground-spoiler position cannot be used",
            "Left inboard ground-spoiler position cannot be used",
            "Right inboard ground-spoiler position cannot be used",
            "Left spoileron outboard PCU spool failure",
            "Left spoileron inboard PCU spool failure",
            "Right spoileron outboard PCU spool failure",
            "Right spoileron inboard PCU spool failure",
            "Left flight spoiler outboard PCU spool failure",
            "Left flight spoiler inboard PCU spool failure",
            "Right flight spoiler inboard PCU spool failure",
            "Right flight spoiler outboard PCU spool failure",
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
            "Failure data",
            "No data",
            "Funct/bite test",
            "Normal"
    };
}
