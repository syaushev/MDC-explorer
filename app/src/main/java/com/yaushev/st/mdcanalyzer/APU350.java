package com.yaushev.st.mdcanalyzer;

/**
 * Created by Sergey Admin on 27.01.2018.
 */
import java.util.ArrayList;

public class APU350 extends Faults {

    String [] sdi={"SDI:Default","SDI:Not used", "SDI:Not used", "SDI:Not used"};
    String [] ssm={"SSM:Normal","SSM:No data", "SSM:Not used", "SSM:Not used"};
    String sdi_result, ssm_result;

    String [] systemcode=	{"* SDI code"	,
            "* SDI code"	,
            "APU ready to load"	,
            "APU LCV open"	,
            "L bleed air S/O selected"	,
            "R bleed air S/O selected"	,
            "Weight on wheels"	,
            "Door inhibit"	,
            "APU LCV failure"	,
            "Any LRU failure"	,
            "APU failure shutdown"	,
            "Altitude received"	,
            "Airspeed received"	,
            "Status code (LSB)"	,
            "Status code	",
            "Status code	",
            "Status code (MSB)"	,
            "Start inhibit code (LSB)"	,
            "Start inhibit code"	,
            "Start inhibit code"	,
            "Start inhibit code (MSB)"	,
            "** SSM code"	,
            "** SSM code"	,
            "Parity (odd)"};

    String [] statuscode=	{
            "Status:Not used"	,
            "Status:Prestart bit in progress"	,
            "Status:ECU standby"	,
            "Status:APU start in progress"	,
            "Status:APU on speed"	,
            "Status:APU CMD shutdown"	,
            "Status:APU failure shutdown"	,
            "Status:ECU disabled"	};

    String [] startinhibitcode=	{"SIC:OK (no inhibit)"	,
            "SIC:Fuel solenoid"	,
            "SIC:LOP"	,
            "SIC:HOT"	,
            "SIC:Fuel torque motor"	,
            "SIC:Ignition switch"	,
            "SIC:T5 circuit"	,
            "SIC:Inlet door fault"	,
            "SIC:ECU fault"	,
            "SIC:Speed sensor"	};



    public ArrayList<String> getFaults (String[] in){

        ArrayList<String> results = new ArrayList<String>();

        for (int i=2;i<13;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        //Status code

        if((in[15].equals("0")&&(in[14].equals("0"))&&(in[13].equals("1")))) results.add(statuscode[1]);
        else if((in[15].equals("0")&&(in[14].equals("1"))&&(in[13].equals("0")))) results.add(statuscode[2]);
        else if((in[15].equals("0")&&(in[14].equals("1"))&&(in[13].equals("1")))) results.add(statuscode[3]);
        else if((in[15].equals("1")&&(in[14].equals("0"))&&(in[13].equals("0")))) results.add(statuscode[4]);
        else if((in[15].equals("1")&&(in[14].equals("0"))&&(in[13].equals("1")))) results.add(statuscode[5]);
        else if((in[15].equals("1")&&(in[14].equals("1"))&&(in[13].equals("0")))) results.add(statuscode[6]);
        else if((in[15].equals("1")&&(in[14].equals("1"))&&(in[13].equals("1")))) results.add(statuscode[7]);
        else if((in[15].equals("0")&&(in[14].equals("0"))&&(in[13].equals("0")))) results.add(statuscode[0]);
        else results.add("Status:endered code isn't existing");

        //Start inhibit code (SIC)

        if((in[20].equals("0")&&in[19].equals("0")&&(in[18].equals("0"))&&(in[17].equals("0")))) results.add(startinhibitcode[0]);
        else if((in[20].equals("0")&&in[19].equals("0")&&(in[18].equals("0"))&&(in[17].equals("1")))) results.add(startinhibitcode[1]);
        else if((in[20].equals("0")&&in[19].equals("0")&&(in[18].equals("1"))&&(in[17].equals("0")))) results.add(startinhibitcode[2]);
        else if((in[20].equals("0")&&in[19].equals("0")&&(in[18].equals("1"))&&(in[17].equals("1")))) results.add(startinhibitcode[3]);
        else if((in[20].equals("0")&&in[19].equals("1")&&(in[18].equals("0"))&&(in[17].equals("0")))) results.add(startinhibitcode[4]);
        else if((in[20].equals("0")&&in[19].equals("1")&&(in[18].equals("0"))&&(in[17].equals("1")))) results.add(startinhibitcode[5]);
        else if((in[20].equals("0")&&in[19].equals("1")&&(in[18].equals("1"))&&(in[17].equals("0")))) results.add(startinhibitcode[6]);
        else if((in[20].equals("0")&&in[19].equals("1")&&(in[18].equals("1"))&&(in[17].equals("1")))) results.add(startinhibitcode[7]);
        else if((in[20].equals("1")&&in[19].equals("0")&&(in[18].equals("0"))&&(in[17].equals("0")))) results.add(startinhibitcode[8]);
        else if((in[20].equals("1")&&in[19].equals("0")&&(in[18].equals("0"))&&(in[17].equals("1")))) results.add(startinhibitcode[9]);
        else results.add("SIC: endered code isn't existing");


        return (results);
    }





}
