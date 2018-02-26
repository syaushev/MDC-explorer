package com.example.sergeyadmin.mdcanalyzer;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class IOC350 extends Faults {
    String[] systemcode={
            "0",
            "0",
            "RAM test failure",
            "Mapper or map checksum failure",
            "0",
            "0",
            "Code checksum failure",
            "IOC version number failure",
            "Initialization mode failure",
            "Multiplexer (Mux) or *UART status word error",
            "Warm start",
            "Strap hardware test fail (initialization)",
            "Strap hardware test fail (background)",
            "Local straps test failure",
            "IAPS strap test failure (parity)",
            "CPU test failure",
            "Test vector simulation failure",
            "Input queue overrun error",
            "Output queue overrun error",
            "IAPS environmental control card failure",
            "Onside cross quadrant power supply overheat",
            "**SSM code",
            "**SSM code",
            "Parity (odd)"};

    String [] sdi={
            "Not used",
            "Not used",
            "Not used",
            "Not used"
    };
    String [] ssm={
            "Fail warning",
            "No computed data",
            "Functional test",
            "Normal"
    };
}
