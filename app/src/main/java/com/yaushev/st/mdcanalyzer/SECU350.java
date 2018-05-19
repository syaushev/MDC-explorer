package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SECU350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Pilot’s roll control input-module (RCIM) failure",
            "Copilot’s RCIM failure",
            "Pilot’s and copilot’s RCIMs do not agree",
            "Flight spoiler control lever failure",
            "Flight spoiler control-levers do not agree",
            "SECU 1 module A failure",
            "SECU 1 module B failure",
            "SECU 2 module A failure",
            "SECU 2 module B failure",
            "Outboard ground-spoiler selector-valve failure",
            "Inboard ground-spoiler selector-valve failure",
            "Left spoileron outboard power-control-unit (PCU) position",
            "Left spoileron inboard PCU position failure",
            "Right spoileron outboard PCU position failure",
            "Right spoileron inboard PCU position failure",
            "Left flight spoiler outboard PCU position failure",
            "Left flight spoiler inboard PCU position failure",
            "Right flight spoiler inboard PCU position",
            "Right flight spoiler outboard PCU position",
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
