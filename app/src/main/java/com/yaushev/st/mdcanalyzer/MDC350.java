package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class MDC350 extends Faults {
    String[] systemcode={
            "* SDI code",
            "* SDI code",
            "Block data source (1 = right DCU)",
            "Ready to receive data",
            "Maintenance information",
            "No MDC maintenance tables",
            "MDC failure",
            "Maintenance data is available",
            "Data base unit (DBU) failure",
            "DBU bus not available",
            "IOC 1A input not available",
            "IOC 1B input not available",
            "IOC 2A input not available",
            "IOC 2B input not available",
            "Queue overrun",
            "Battery voltage is low",
            "Block data reception acknowledge (ACK)",
            "Configuration strapping units (CSU) do not agree",
            "Watchdog monitor stopped",
            "BITE test port failure",
            "Internal clock failure",
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
            "Normal",
            "No data",
            "Functional test",
            "Not used"
    };
}
