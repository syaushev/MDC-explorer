package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SECU272 extends Faults {
    String[] systemcode={
            "*SDI code",
            "*SDI code",
            "Left hand spoileron outboard PCU active",
            "Left hand spoileron inboard PCU active",
            "Right hand spoileron outboard PCU active",
            "Right hand spoileron inboard PCU active",
            "Left hand flight spoiler outboard PCU active",
            "Left hand flight spoiler inboard PCU active",
            "Right hand flight spoiler inboard PCU active",
            "Right hand flight spoiler outboard PCU active",
            "Roll disconnect valid",
            "Pilot roll priority active",
            "Copilot roll priority active",
            "Pilot roll priority 1 selected",
            "Copilot roll priority 1 selected",
            "GLD manual arm selected",
            "GLD manual disarm selected",
            "Pilot roll priority 2 selected",
            "Copilot roll priority 2 selected",
            "GS manual arm active",
            "GS manual disarm selected",
            "**SSM code",
            "**SSM code",
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
            "Functional test",
            "Normal"
    };
}
