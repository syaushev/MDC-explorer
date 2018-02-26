package com.example.sergeyadmin.mdcanalyzer;

import java.util.ArrayList;

/**
 * Created by Sergey Admin on 30.01.2018.
 */

public class Faults {

    String sdi_result, ssm_result;


    public ArrayList<String> getFaults (String[] in, String[] systemcode){
        ArrayList<String> results = new ArrayList<String>();

        for (int i=2;i<21;i++)
        {
            if(in[i].equals("1")) results.add(systemcode[i]);
        }
        return (results);
    }

    public String checkSDI(String[] in, String[] sdi, String[]ssm){

        if(in[0].equals("0")) {
            if(in[1].equals("0")) sdi_result="SDI code:"+sdi[0];
            else sdi_result= "SDI code:"+sdi[1];}
        else {
            if (in[1].equals("0")) sdi_result= "SDI code:"+sdi[2];
            else sdi_result= "SDI code:"+sdi[3];}
        return sdi_result;

    }

    public String checkSSM(String[] in, String[] sdi, String[]ssm){

        if(in[21].equals("0")) {
            if(in[22].equals("0")) ssm_result= "SSM code:"+ssm[0];
            else ssm_result= "SSM code:"+ ssm[1];}
        else {
            if (in[22].equals("0")) ssm_result= "SSM code:"+ ssm[2];
            else ssm_result= "SSM code:"+ ssm[3];}
        return ssm_result;

    }

}
