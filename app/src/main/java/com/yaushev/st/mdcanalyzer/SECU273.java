package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class SECU273 extends Faults {
    String[] systemcode={
            "*SDI code",
            "*SDI code",
            "Left hand spoileron outboard PCU failure",
            "Left hand spoileron inboard PCU failure",
            "Right hand spoileron outboard PCU failure",
            "Right hand spoileron inboard PCU failure",
            "Left hand flight spoiler outboard PCU failure",
            "Left hand flight spoiler inboard PCU failure",
            "Right hand flight spoiler inboard PCU failure",
            "Right hand flight spoiler outboard PCU failure",
            "Spoilerons GLD arm status: armed",
            "Spoilerons on ground deploy command: extend",
            "Flight spoilers GLD arm status: armed",
            "Flight spoilers on ground deploy command: extend",
            "SECU 1 programming discrete 1: true",
            "SECU 1 programming discrete 2: true",
            "SECU 1 programming discrete 3: true",
            "SECU 2 programming discrete 1: true",
            "SECU 2 programming discrete 2: true",
            "SECU 2 programming discrete 3: true",
            "Spare",
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
            "Normal",
            "No data",
            "Functional test",
            "Not used"
    };
}
