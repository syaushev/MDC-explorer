package com.yaushev.st.mdcanalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FindActivity extends AppCompatActivity {

    TextView out;
    StringBuilder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);


        StringBuilder builder=new StringBuilder();



        out=(TextView)findViewById(R.id.textView3) ;

        Intent intent=getIntent();
        String inputcodeString=intent.getStringExtra("inputcode");
        inputcodeString=inputcodeString.replaceAll(" ","");
        String systemname=intent.getStringExtra("systemname");

// Преобразование кода к необходимому виду
        inputcodeString=inputcodeString.replace("-","");
        String[] inputcodetemp=inputcodeString.split("");
        System.out.println(inputcodetemp.length);

        String [] inputcode=new String[24];


        for(int i=0; i<inputcode.length; i++){
            inputcode[i]=inputcodetemp[i+1];

        }
        String [] inputcodereverse=new String[24];

        for(int i=0; i<inputcode.length;i++){

            inputcodereverse[i]=inputcode[23-i];
        }
        inputcode=inputcodereverse;










// Объявление классов

        ACFC350 ACFC350 = new ACFC350();
        ACFC351 ACFC351 = new ACFC351();
        ADF350 ADF350 = new ADF350();
        AHRS350 ahrs350 = new AHRS350();
        AHRS351 ahrs351 = new AHRS351();
        APU350 apu350=new APU350();
        APU351 APU351=new APU351();
        APU352 APU352=new APU352();
        ADC350 ADC350=new ADC350();
        ADC351 ADC351=new ADC351();
        BTMS350 BTMS350=new BTMS350();
        CDU354 CDU354=new CDU354();
        CFSS351 CFSS351=new CFSS351();
        CPAM270 CPAM270=new CPAM270();
        CPC270 CPC270=new CPC270();
        DCP352 DCP352=new DCP352();
        DBU351 DBU351=new DBU351();
        DCU242 DCU242=new DCU242();
        DCU350 DCU350=new DCU350();
        DCU351 DCU351=new DCU351();
        DCU352 DCU352=new DCU352();
        DME350 DME350=new DME350();
        ECFC351 ECFC351=new ECFC351();
        ECFP351 ECFP351=new ECFP351();
        ECP377 ECP377=new ECP377();
        EICAS350 EICAS350=new EICAS350();
        EICAS351 EICAS351=new EICAS351();
        FMS350 FMS350=new FMS350();
        FQGS276 FQGS276=new FQGS276();
        FQGS277 FQGS277=new FQGS277();
        GPS355 GPS355=new GPS355();
        GPWS350 GPWS350=new GPWS350();
        GPWS351 GPWS351=new GPWS351();
        HGS350 HGS350=new HGS350();
        HSTCU270 HSTCU270=new HSTCU270();
        HSTCU271 HSTCU271=new HSTCU271();
        HSTCU272 HSTCU272=new HSTCU272();
        HSTCU273 HSTCU273=new HSTCU273();
        HSTCU350 HSTCU350=new HSTCU350();
        IOC350 IOC350=new IOC350();
        IRS350 IRS350=new IRS350();
        IRS351 IRS351=new IRS351();
        IRS353 IRS353=new IRS353();
        LDU350 LDU350=new LDU350();
        MDC350 MDC350=new MDC350();
        MFD350 MFD350=new MFD350();
        MFD351 MFD351=new MFD351();
        PFD350 PFD350=new PFD350();
        PFD351 PFD351=new PFD351();
        PSEU273 PSEU273=new PSEU273();
        RAC350 RAC350=new RAC350();
        RCFLC351 RCFLC351=new RCFLC351();
        RCFLP351 RCFLP351=new RCFLP351();
        RCFRP351 RCFRP351=new RCFRP351();
        RCFRC351 RCFRC351=new RCFRC351();
        RTU350 RTU350=new RTU350();
        RTU352 RTU352=new RTU352();
        SECU271 SECU271=new SECU271();
        SECU272 SECU272=new SECU272();
        SECU273 SECU273=new SECU273();
        SECU350 SECU350=new SECU350();
        SECU351 SECU351=new SECU351();
        SECU352 SECU352=new SECU352();
        SECU353 SECU353=new SECU353();
        SPS270 SPS270=new SPS270();
        SPS350 SPS350=new SPS350();
        TCAS350 TCAS350=new TCAS350();
        TDR350 TDR350=new TDR350();
        VHFCOMM350 VHFCOMM350=new VHFCOMM350();
        VHFNAV350 VHFNAV350=new VHFNAV350();
        WXP270 WXP270=new WXP270();
        WXR354 WXR354=new WXR354();
        FCC071 FCC071=new FCC071();
        FCC351Repair FCC351Repair=new FCC351Repair();
        FCC351ApDis FCC351ApDis=new FCC351ApDis();
        FCC351ApEng FCC351ApEng=new FCC351ApEng();
        FCC351Boost FCC351Boost=new FCC351Boost();
        FCC351YdDis FCC351YdDis=new FCC351YdDis();
        FCC351YdEng FCC351YdEng=new FCC351YdEng();






















        switch(systemname){
            case "FCC351:Repair":

                for(int i=0; i< FCC351Repair.getFaults(inputcode,FCC351Repair.systemcode).size();i++) {
                    builder.append(FCC351Repair.getFaults(inputcode,FCC351Repair.systemcode).get(i)+ "\n");}



                out.setText(builder.toString());
                break;
            case "FCC351:AP ENG":

                for(int i=0; i< FCC351ApEng.getFaults(inputcode,FCC351ApEng.systemcode).size();i++) {
                    builder.append(FCC351ApEng.getFaults(inputcode,FCC351ApEng.systemcode).get(i)+ "\n");}



                out.setText(builder.toString());
                break;
            case "FCC351:AP DISENG":

                for(int i=0; i< FCC351ApDis.getFaults(inputcode,FCC351ApDis.systemcode).size();i++) {
                    builder.append(FCC351ApDis.getFaults(inputcode,FCC351ApDis.systemcode).get(i)+ "\n");}

                out.setText(builder.toString());
                break;
            case "FCC351:YD ENG":

                for(int i=0; i< FCC351YdEng.getFaults(inputcode,FCC351YdEng.systemcode).size();i++) {
                    builder.append(FCC351YdEng.getFaults(inputcode,FCC351YdEng.systemcode).get(i)+ "\n");}

                out.setText(builder.toString());
                break;
            case "FCC351:YD DISENG":

                for(int i=0; i< FCC351YdDis.getFaults(inputcode,FCC351YdDis.systemcode).size();i++) {
                    builder.append(FCC351YdDis.getFaults(inputcode,FCC351YdDis.systemcode).get(i)+ "\n");}

                out.setText(builder.toString());
                break;
            case "FCC351:Boost":

                for(int i=0; i< FCC351Boost.getFaults(inputcode,FCC351Boost.systemcode).size();i++) {
                    builder.append(FCC351Boost.getFaults(inputcode,FCC351Boost.systemcode).get(i)+ "\n");}

                out.setText(builder.toString());
                break;
            case "ACFC350":

                for(int i=0; i< ACFC350.getFaults(inputcode,ACFC350.systemcode).size();i++) {
                    builder.append(ACFC350.getFaults(inputcode,ACFC350.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(ACFC350.checkSDI(inputcode,ACFC350.sdi,ACFC350.ssm)+ "\n");
                builder.append(ACFC350.checkSSM(inputcode,ACFC350.sdi,ACFC350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "ACFC351":


                for(int i=0; i< ACFC351.getFaults(inputcode,ACFC351.systemcode).size();i++) {

                    builder.append(ACFC351.getFaults(inputcode,ACFC351.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(ACFC351.checkSDI(inputcode,ACFC351.sdi,ACFC351.ssm)+ "\n");
                builder.append(ACFC351.checkSSM(inputcode,ACFC351.sdi,ACFC351.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "ADC350":


                for(int i=0; i< ADC350.getFaults(inputcode,ADC350.systemcode).size();i++) {

                    builder.append(ADC350.getFaults(inputcode,ADC350.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(ADC350.checkSDI(inputcode,ADC350.sdi,ADC350.ssm)+ "\n");
                builder.append(ADC350.checkSSM(inputcode,ADC350.sdi,ADC350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "ADC351":


                for(int i=0; i< ADC351.getFaults(inputcode).size();i++) {

                    builder.append(ADC351.getFaults(inputcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(ADC351.checkSDI(inputcode,ADC351.sdi,ADC351.ssm)+ "\n");
                builder.append(ADC351.checkSSM(inputcode,ADC351.sdi,ADC351.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "VHFCOMM350":


                for(int i=0; i< VHFCOMM350.getFaults(inputcode,VHFCOMM350.systemcode).size();i++) {

                    builder.append(VHFCOMM350.getFaults(inputcode,VHFCOMM350.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(VHFCOMM350.checkSDI(inputcode,VHFCOMM350.sdi,VHFCOMM350.ssm)+ "\n");
                builder.append(VHFCOMM350.checkSSM(inputcode,VHFCOMM350.sdi,VHFCOMM350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "VHFNAV350":


                for(int i=0; i< VHFNAV350.getFaults(inputcode,VHFNAV350.systemcode).size();i++) {

                    builder.append(VHFNAV350.getFaults(inputcode,VHFNAV350.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(VHFNAV350.checkSDI(inputcode,VHFNAV350.sdi,VHFNAV350.ssm)+ "\n");
                builder.append(VHFNAV350.checkSSM(inputcode,VHFNAV350.sdi,VHFNAV350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "WXP270":


                for(int i=0; i< WXP270.getFaults(inputcode,WXP270.systemcode).size();i++) {

                    builder.append(WXP270.getFaults(inputcode,WXP270.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(WXP270.checkSDI(inputcode,WXP270.sdi,WXP270.ssm)+ "\n");
                builder.append(WXP270.checkSSM(inputcode,WXP270.sdi,WXP270.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "WXR354":


                for(int i=0; i< WXR354.getFaults(inputcode,WXR354.systemcode).size();i++) {

                    builder.append(WXR354.getFaults(inputcode,WXR354.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(WXR354.checkSDI(inputcode,WXR354.sdi,WXR354.ssm)+ "\n");
                builder.append(WXR354.checkSSM(inputcode,WXR354.sdi,WXR354.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "ADF350":


                for(int i=0; i< ADF350.getFaults(inputcode,ADF350.systemcode).size();i++) {

                    builder.append(ADF350.getFaults(inputcode,ADF350.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(ADF350.checkSDI(inputcode,ADF350.sdi,ADF350.ssm)+ "\n");
                builder.append(ADF350.checkSSM(inputcode,ADF350.sdi,ADF350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "AHRS350":

                for(int i=0; i< ahrs350.getFaults(inputcode,ahrs350.systemcode).size();i++) {

                    builder.append(ahrs350.getFaults(inputcode,ahrs350.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(ahrs350.checkSDI(inputcode,ahrs350.sdi,ahrs350.ssm)+ "\n");
                builder.append(ahrs350.checkSSM(inputcode,ahrs350.sdi,ahrs350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "AHRS351":

                for(int i=0; i< ahrs351.getFaults(inputcode,ahrs351.systemcode).size();i++) {

                    builder.append(ahrs351.getFaults(inputcode,ahrs351.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(ahrs351.checkSDI(inputcode,ahrs351.sdi,ahrs351.ssm)+ "\n");
                builder.append(ahrs351.checkSSM(inputcode,ahrs351.sdi,ahrs351.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "APU350":
                for(int i=0; i< apu350.getFaults(inputcode).size();i++) {

                    builder.append(apu350.getFaults(inputcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(apu350.checkSDI(inputcode,apu350.sdi,apu350.ssm)+ "\n");
                builder.append(apu350.checkSSM(inputcode,apu350.sdi,apu350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "APU351":

                for(int i=0; i< APU351.getFaults(inputcode,APU351.systemcode).size();i++) {

                    builder.append(APU351.getFaults(inputcode,APU351.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(APU351.checkSDI(inputcode,APU351.sdi,APU351.ssm)+ "\n");
                builder.append(APU351.checkSSM(inputcode,APU351.sdi,APU351.ssm)+ "\n");

                out.setText(builder.toString());
                break;

            case "APU352":

                for(int i=0; i< APU352.getFaults(inputcode).size();i++) {

                    builder.append(APU352.getFaults(inputcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(APU352.checkSDI(inputcode,APU352.sdi,APU352.ssm)+ "\n");
                builder.append(APU352.checkSSM(inputcode,APU352.sdi,APU352.ssm)+ "\n");

                out.setText(builder.toString());
                break;

            case "BTMS350":

                for(int i=0; i< BTMS350.getFaults(inputcode,BTMS350.systemcode).size();i++) {

                    builder.append(BTMS350.getFaults(inputcode,BTMS350.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(BTMS350.checkSDI(inputcode,BTMS350.sdi,BTMS350.ssm)+ "\n");
                builder.append(BTMS350.checkSSM(inputcode,BTMS350.sdi,BTMS350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "CDU354":

                for(int i=0; i< CDU354.getFaults(inputcode,CDU354.systemcode).size();i++) {

                    builder.append(CDU354.getFaults(inputcode,CDU354.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(CDU354.checkSDI(inputcode,CDU354.sdi,CDU354.ssm)+ "\n");
                builder.append(CDU354.checkSSM(inputcode,CDU354.sdi,CDU354.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "CFSS351":

                for(int i=0; i< CFSS351.getFaults(inputcode,CFSS351.systemcode).size();i++) {

                    builder.append(CFSS351.getFaults(inputcode,CFSS351.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(CFSS351.checkSDI(inputcode,CFSS351.sdi,CFSS351.ssm)+ "\n");
                builder.append(CFSS351.checkSSM(inputcode,CFSS351.sdi,CFSS351.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "CPAM270":

                for(int i=0; i< CPAM270.getFaults(inputcode,CPAM270.systemcode).size();i++) {

                    builder.append(CPAM270.getFaults(inputcode,CPAM270.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(CPAM270.checkSDI(inputcode,CPAM270.sdi,CPAM270.ssm)+ "\n");
                builder.append(CPAM270.checkSSM(inputcode,CPAM270.sdi,CPAM270.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "CPC270":

                for(int i=0; i< CPC270.getFaults(inputcode,CPC270.systemcode).size();i++) {

                    builder.append(CPC270.getFaults(inputcode,CPC270.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(CPC270.checkSDI(inputcode,CPC270.sdi,CPC270.ssm)+ "\n");
                builder.append(CPC270.checkSSM(inputcode,CPC270.sdi,CPC270.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "DBU351":

                for(int i=0; i< DBU351.getFaults(inputcode,DBU351.systemcode).size();i++) {

                    builder.append(DBU351.getFaults(inputcode,DBU351.systemcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(DBU351.checkSDI(inputcode,DBU351.sdi,DBU351.ssm)+ "\n");
                builder.append(DBU351.checkSSM(inputcode,DBU351.sdi,DBU351.ssm)+ "\n");

                out.setText(builder.toString());
                break;

            case "DME350":
                                for(int i=0; i< DME350.getFaults(inputcode).size();i++) {

                    builder.append(DME350.getFaults(inputcode).get(i)+ "\n");}
                builder.append("______________"+ "\n");

                builder.append(DME350.checkSDI(inputcode,DME350.sdi,DME350.ssm)+ "\n");
                builder.append(DME350.checkSSM(inputcode,DME350.sdi,DME350.ssm)+ "\n");

                out.setText(builder.toString());
                break;
            case "ECFC351":     for(int i=0; i< ECFC351.getFaults(inputcode,ECFC351.systemcode).size();i++) { builder.append(ECFC351.getFaults(inputcode,ECFC351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(ECFC351.checkSDI(inputcode,ECFC351.sdi,ECFC351.ssm)+ "\n");builder.append(ECFC351.checkSSM(inputcode,  ECFC351.sdi,ECFC351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SECU350":     for(int i=0; i< SECU350.getFaults(inputcode,SECU350.systemcode).size();i++) { builder.append(SECU350.getFaults(inputcode,SECU350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SECU350.checkSDI(inputcode,SECU350.sdi,SECU350.ssm)+ "\n");builder.append(SECU350.checkSSM(inputcode,  SECU350.sdi,SECU350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "IRS353":     for(int i=0; i< IRS353.getFaults(inputcode,IRS353.systemcode).size();i++) { builder.append(IRS353.getFaults(inputcode,IRS353.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(IRS353.checkSDI(inputcode,IRS353.sdi,IRS353.ssm)+ "\n");builder.append(IRS353.checkSSM(inputcode,  IRS353.sdi,IRS353.ssm)+ "\n"); out.setText(builder.toString());break;
            case "MDC350":     for(int i=0; i< MDC350.getFaults(inputcode,MDC350.systemcode).size();i++) { builder.append(MDC350.getFaults(inputcode,MDC350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(MDC350.checkSDI(inputcode,MDC350.sdi,MDC350.ssm)+ "\n");builder.append(MDC350.checkSSM(inputcode,  MDC350.sdi,MDC350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "TCAS350":     for(int i=0; i< TCAS350.getFaults(inputcode,TCAS350.systemcode).size();i++) { builder.append(TCAS350.getFaults(inputcode,TCAS350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(TCAS350.checkSDI(inputcode,TCAS350.sdi,TCAS350.ssm)+ "\n");builder.append(TCAS350.checkSSM(inputcode,  TCAS350.sdi,TCAS350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SECU352":     for(int i=0; i< SECU352.getFaults(inputcode,SECU352.systemcode).size();i++) { builder.append(SECU352.getFaults(inputcode,SECU352.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SECU352.checkSDI(inputcode,SECU352.sdi,SECU352.ssm)+ "\n");builder.append(SECU352.checkSSM(inputcode,  SECU352.sdi,SECU352.ssm)+ "\n"); out.setText(builder.toString());break;
            case "DCU242":     for(int i=0; i< DCU242.getFaults(inputcode,DCU242.systemcode).size();i++) { builder.append(DCU242.getFaults(inputcode,DCU242.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(DCU242.checkSDI(inputcode,DCU242.sdi,DCU242.ssm)+ "\n");builder.append(DCU242.checkSSM(inputcode,  DCU242.sdi,DCU242.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SECU353":     for(int i=0; i< SECU353.getFaults(inputcode,SECU353.systemcode).size();i++) { builder.append(SECU353.getFaults(inputcode,SECU353.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SECU353.checkSDI(inputcode,SECU353.sdi,SECU353.ssm)+ "\n");builder.append(SECU353.checkSSM(inputcode,  SECU353.sdi,SECU353.ssm)+ "\n"); out.setText(builder.toString());break;
            case "FMS350":     for(int i=0; i< FMS350.getFaults(inputcode).size();i++) { builder.append(FMS350.getFaults(inputcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(FMS350.checkSDI(inputcode,FMS350.sdi,FMS350.ssm)+ "\n");builder.append(FMS350.checkSSM(inputcode,  FMS350.sdi,FMS350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "GPS355":     for(int i=0; i< GPS355.getFaults(inputcode,GPS355.systemcode).size();i++) { builder.append(GPS355.getFaults(inputcode,GPS355.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(GPS355.checkSDI(inputcode,GPS355.sdi,GPS355.ssm)+ "\n");builder.append(GPS355.checkSSM(inputcode,  GPS355.sdi,GPS355.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SPS350":     for(int i=0; i< SPS350.getFaults(inputcode,SPS350.systemcode).size();i++) { builder.append(SPS350.getFaults(inputcode,SPS350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SPS350.checkSDI(inputcode,SPS350.sdi,SPS350.ssm)+ "\n");builder.append(SPS350.checkSSM(inputcode,  SPS350.sdi,SPS350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "HSTCU271":     for(int i=0; i< HSTCU271.getFaults(inputcode,HSTCU271.systemcode).size();i++) { builder.append(HSTCU271.getFaults(inputcode,HSTCU271.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(HSTCU271.checkSDI(inputcode,HSTCU271.sdi,HSTCU271.ssm)+ "\n");builder.append(HSTCU271.checkSSM(inputcode,  HSTCU271.sdi,HSTCU271.ssm)+ "\n"); out.setText(builder.toString());break;
            case "ECFP351":     for(int i=0; i< ECFP351.getFaults(inputcode,ECFP351.systemcode).size();i++) { builder.append(ECFP351.getFaults(inputcode,ECFP351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(ECFP351.checkSDI(inputcode,ECFP351.sdi,ECFP351.ssm)+ "\n");builder.append(ECFP351.checkSSM(inputcode,  ECFP351.sdi,ECFP351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SECU273":     for(int i=0; i< SECU273.getFaults(inputcode,SECU273.systemcode).size();i++) { builder.append(SECU273.getFaults(inputcode,SECU273.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SECU273.checkSDI(inputcode,SECU273.sdi,SECU273.ssm)+ "\n");builder.append(SECU273.checkSSM(inputcode,  SECU273.sdi,SECU273.ssm)+ "\n"); out.setText(builder.toString());break;
            case "DCP352":     for(int i=0; i< DCP352.getFaults(inputcode,DCP352.systemcode).size();i++) { builder.append(DCP352.getFaults(inputcode,DCP352.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(DCP352.checkSDI(inputcode,DCP352.sdi,DCP352.ssm)+ "\n");builder.append(DCP352.checkSSM(inputcode,  DCP352.sdi,DCP352.ssm)+ "\n"); out.setText(builder.toString());break;
            case "TDR350":     for(int i=0; i< TDR350.getFaults(inputcode,TDR350.systemcode).size();i++) { builder.append(TDR350.getFaults(inputcode,TDR350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(TDR350.checkSDI(inputcode,TDR350.sdi,TDR350.ssm)+ "\n");builder.append(TDR350.checkSSM(inputcode,  TDR350.sdi,TDR350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "DCU351":     for(int i=0; i< DCU351.getFaults(inputcode,DCU351.systemcode).size();i++) { builder.append(DCU351.getFaults(inputcode,DCU351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(DCU351.checkSDI(inputcode,DCU351.sdi,DCU351.ssm)+ "\n");builder.append(DCU351.checkSSM(inputcode,  DCU351.sdi,DCU351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "MFD350":     for(int i=0; i< MFD350.getFaults(inputcode,MFD350.systemcode).size();i++) { builder.append(MFD350.getFaults(inputcode,MFD350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(MFD350.checkSDI(inputcode,MFD350.sdi,MFD350.ssm)+ "\n");builder.append(MFD350.checkSSM(inputcode,  MFD350.sdi,MFD350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "RCFLP351":     for(int i=0; i< RCFLP351.getFaults(inputcode,RCFLP351.systemcode).size();i++) { builder.append(RCFLP351.getFaults(inputcode,RCFLP351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(RCFLP351.checkSDI(inputcode,RCFLP351.sdi,RCFLP351.ssm)+ "\n");builder.append(RCFLP351.checkSSM(inputcode,  RCFLP351.sdi,RCFLP351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "GPWS350":     for(int i=0; i< GPWS350.getFaults(inputcode,GPWS350.systemcode).size();i++) { builder.append(GPWS350.getFaults(inputcode,GPWS350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(GPWS350.checkSDI(inputcode,GPWS350.sdi,GPWS350.ssm)+ "\n");builder.append(GPWS350.checkSSM(inputcode,  GPWS350.sdi,GPWS350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "HGS350":     for(int i=0; i< HGS350.getFaults(inputcode,HGS350.systemcode).size();i++) { builder.append(HGS350.getFaults(inputcode,HGS350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(HGS350.checkSDI(inputcode,HGS350.sdi,HGS350.ssm)+ "\n");builder.append(HGS350.checkSSM(inputcode,  HGS350.sdi,HGS350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "IRS351":     for(int i=0; i< IRS351.getFaults(inputcode,IRS351.systemcode).size();i++) { builder.append(IRS351.getFaults(inputcode,IRS351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(IRS351.checkSDI(inputcode,IRS351.sdi,IRS351.ssm)+ "\n");builder.append(IRS351.checkSSM(inputcode,  IRS351.sdi,IRS351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SECU271":     for(int i=0; i< SECU271.getFaults(inputcode,SECU271.systemcode).size();i++) { builder.append(SECU271.getFaults(inputcode,SECU271.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SECU271.checkSDI(inputcode,SECU271.sdi,SECU271.ssm)+ "\n");builder.append(SECU271.checkSSM(inputcode,  SECU271.sdi,SECU271.ssm)+ "\n"); out.setText(builder.toString());break;
            case "HSTCU272":     for(int i=0; i< HSTCU272.getFaults(inputcode,HSTCU272.systemcode).size();i++) { builder.append(HSTCU272.getFaults(inputcode,HSTCU272.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(HSTCU272.checkSDI(inputcode,HSTCU272.sdi,HSTCU272.ssm)+ "\n");builder.append(HSTCU272.checkSSM(inputcode,  HSTCU272.sdi,HSTCU272.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SPS270":     for(int i=0; i< SPS270.getFaults(inputcode,SPS270.systemcode).size();i++) { builder.append(SPS270.getFaults(inputcode,SPS270.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SPS270.checkSDI(inputcode,SPS270.sdi,SPS270.ssm)+ "\n");builder.append(SPS270.checkSSM(inputcode,  SPS270.sdi,SPS270.ssm)+ "\n"); out.setText(builder.toString());break;
            case "LDU350":     for(int i=0; i< LDU350.getFaults(inputcode,LDU350.systemcode).size();i++) { builder.append(LDU350.getFaults(inputcode,LDU350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(LDU350.checkSDI(inputcode,LDU350.sdi,LDU350.ssm)+ "\n");builder.append(LDU350.checkSSM(inputcode,  LDU350.sdi,LDU350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "HSTCU273":     for(int i=0; i< HSTCU273.getFaults(inputcode,HSTCU273.systemcode).size();i++) { builder.append(HSTCU273.getFaults(inputcode,HSTCU273.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(HSTCU273.checkSDI(inputcode,HSTCU273.sdi,HSTCU273.ssm)+ "\n");builder.append(HSTCU273.checkSSM(inputcode,  HSTCU273.sdi,HSTCU273.ssm)+ "\n"); out.setText(builder.toString());break;
            case "EICAS350":     for(int i=0; i< EICAS350.getFaults(inputcode,EICAS350.systemcode).size();i++) { builder.append(EICAS350.getFaults(inputcode,EICAS350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(EICAS350.checkSDI(inputcode,EICAS350.sdi,EICAS350.ssm)+ "\n");builder.append(EICAS350.checkSSM(inputcode,  EICAS350.sdi,EICAS350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "HSTCU350":     for(int i=0; i< HSTCU350.getFaults(inputcode,HSTCU350.systemcode).size();i++) { builder.append(HSTCU350.getFaults(inputcode,HSTCU350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(HSTCU350.checkSDI(inputcode,HSTCU350.sdi,HSTCU350.ssm)+ "\n");builder.append(HSTCU350.checkSSM(inputcode,  HSTCU350.sdi,HSTCU350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "HSTCU270":     for(int i=0; i< HSTCU270.getFaults(inputcode,HSTCU270.systemcode).size();i++) { builder.append(HSTCU270.getFaults(inputcode,HSTCU270.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(HSTCU270.checkSDI(inputcode,HSTCU270.sdi,HSTCU270.ssm)+ "\n");builder.append(HSTCU270.checkSSM(inputcode,  HSTCU270.sdi,HSTCU270.ssm)+ "\n"); out.setText(builder.toString());break;
            case "IOC350":     for(int i=0; i< IOC350.getFaults(inputcode,IOC350.systemcode).size();i++) { builder.append(IOC350.getFaults(inputcode,IOC350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(IOC350.checkSDI(inputcode,IOC350.sdi,IOC350.ssm)+ "\n");builder.append(IOC350.checkSSM(inputcode,  IOC350.sdi,IOC350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "PFD351":     for(int i=0; i< PFD351.getFaults(inputcode,PFD351.systemcode).size();i++) { builder.append(PFD351.getFaults(inputcode,PFD351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(PFD351.checkSDI(inputcode,PFD351.sdi,PFD351.ssm)+ "\n");builder.append(PFD351.checkSSM(inputcode,  PFD351.sdi,PFD351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SECU272":     for(int i=0; i< SECU272.getFaults(inputcode,SECU272.systemcode).size();i++) { builder.append(SECU272.getFaults(inputcode,SECU272.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SECU272.checkSDI(inputcode,SECU272.sdi,SECU272.ssm)+ "\n");builder.append(SECU272.checkSSM(inputcode,  SECU272.sdi,SECU272.ssm)+ "\n"); out.setText(builder.toString());break;
            case "RCFRC351":     for(int i=0; i< RCFRC351.getFaults(inputcode,RCFRC351.systemcode).size();i++) { builder.append(RCFRC351.getFaults(inputcode,RCFRC351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(RCFRC351.checkSDI(inputcode,RCFRC351.sdi,RCFRC351.ssm)+ "\n");builder.append(RCFRC351.checkSSM(inputcode,  RCFRC351.sdi,RCFRC351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "IRS350":     for(int i=0; i< IRS350.getFaults(inputcode).size();i++) { builder.append(IRS350.getFaults(inputcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(IRS350.checkSDI(inputcode,IRS350.sdi,IRS350.ssm)+ "\n");builder.append(IRS350.checkSSM(inputcode,  IRS350.sdi,IRS350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "RAC350":     for(int i=0; i< RAC350.getFaults(inputcode).size();i++) { builder.append(RAC350.getFaults(inputcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(RAC350.checkSDI(inputcode,RAC350.sdi,RAC350.ssm)+ "\n");builder.append(RAC350.checkSSM(inputcode,  RAC350.sdi,RAC350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "GPWS351":     for(int i=0; i< GPWS351.getFaults(inputcode,GPWS351.systemcode).size();i++) { builder.append(GPWS351.getFaults(inputcode,GPWS351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(GPWS351.checkSDI(inputcode,GPWS351.sdi,GPWS351.ssm)+ "\n");builder.append(GPWS351.checkSSM(inputcode,  GPWS351.sdi,GPWS351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "DCU352":     for(int i=0; i< DCU352.getFaults(inputcode,DCU352.systemcode).size();i++) { builder.append(DCU352.getFaults(inputcode,DCU352.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(DCU352.checkSDI(inputcode,DCU352.sdi,DCU352.ssm)+ "\n");builder.append(DCU352.checkSSM(inputcode,  DCU352.sdi,DCU352.ssm)+ "\n"); out.setText(builder.toString());break;
            case "FQGS276":     for(int i=0; i< FQGS276.getFaults(inputcode,FQGS276.systemcode).size();i++) { builder.append(FQGS276.getFaults(inputcode,FQGS276.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(FQGS276.checkSDI(inputcode,FQGS276.sdi,FQGS276.ssm)+ "\n");builder.append(FQGS276.checkSSM(inputcode,  FQGS276.sdi,FQGS276.ssm)+ "\n"); out.setText(builder.toString());break;
            case "ECP377":     for(int i=0; i< ECP377.getFaults(inputcode,ECP377.systemcode).size();i++) { builder.append(ECP377.getFaults(inputcode,ECP377.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(ECP377.checkSDI(inputcode,ECP377.sdi,ECP377.ssm)+ "\n");builder.append(ECP377.checkSSM(inputcode,  ECP377.sdi,ECP377.ssm)+ "\n"); out.setText(builder.toString());break;
            case "RTU352":     for(int i=0; i< RTU352.getFaults(inputcode,RTU352.systemcode).size();i++) { builder.append(RTU352.getFaults(inputcode,RTU352.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(RTU352.checkSDI(inputcode,RTU352.sdi,RTU352.ssm)+ "\n");builder.append(RTU352.checkSSM(inputcode,  RTU352.sdi,RTU352.ssm)+ "\n"); out.setText(builder.toString());break;
            case "PFD350":     for(int i=0; i< PFD350.getFaults(inputcode,PFD350.systemcode).size();i++) { builder.append(PFD350.getFaults(inputcode,PFD350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(PFD350.checkSDI(inputcode,PFD350.sdi,PFD350.ssm)+ "\n");builder.append(PFD350.checkSSM(inputcode,  PFD350.sdi,PFD350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "RCFLC351":     for(int i=0; i< RCFLC351.getFaults(inputcode,RCFLC351.systemcode).size();i++) { builder.append(RCFLC351.getFaults(inputcode,RCFLC351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(RCFLC351.checkSDI(inputcode,RCFLC351.sdi,RCFLC351.ssm)+ "\n");builder.append(RCFLC351.checkSSM(inputcode,  RCFLC351.sdi,RCFLC351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "RTU350":     for(int i=0; i< RTU350.getFaults(inputcode,RTU350.systemcode).size();i++) { builder.append(RTU350.getFaults(inputcode,RTU350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(RTU350.checkSDI(inputcode,RTU350.sdi,RTU350.ssm)+ "\n");builder.append(RTU350.checkSSM(inputcode,  RTU350.sdi,RTU350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "RCFRP351":     for(int i=0; i< RCFRP351.getFaults(inputcode,RCFRP351.systemcode).size();i++) { builder.append(RCFRP351.getFaults(inputcode,RCFRP351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(RCFRP351.checkSDI(inputcode,RCFRP351.sdi,RCFRP351.ssm)+ "\n");builder.append(RCFRP351.checkSSM(inputcode,  RCFRP351.sdi,RCFRP351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "SECU351":     for(int i=0; i< SECU351.getFaults(inputcode,SECU351.systemcode).size();i++) { builder.append(SECU351.getFaults(inputcode,SECU351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(SECU351.checkSDI(inputcode,SECU351.sdi,SECU351.ssm)+ "\n");builder.append(SECU351.checkSSM(inputcode,  SECU351.sdi,SECU351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "EICAS351":     for(int i=0; i< EICAS351.getFaults(inputcode,EICAS351.systemcode).size();i++) { builder.append(EICAS351.getFaults(inputcode,EICAS351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(EICAS351.checkSDI(inputcode,EICAS351.sdi,EICAS351.ssm)+ "\n");builder.append(EICAS351.checkSSM(inputcode,  EICAS351.sdi,EICAS351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "PSEU273":     for(int i=0; i< PSEU273.getFaults(inputcode,PSEU273.systemcode).size();i++) { builder.append(PSEU273.getFaults(inputcode,PSEU273.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(PSEU273.checkSDI(inputcode,PSEU273.sdi,PSEU273.ssm)+ "\n");builder.append(PSEU273.checkSSM(inputcode,  PSEU273.sdi,PSEU273.ssm)+ "\n"); out.setText(builder.toString());break;
            case "FQGS277":     for(int i=0; i< FQGS277.getFaults(inputcode,FQGS277.systemcode).size();i++) { builder.append(FQGS277.getFaults(inputcode,FQGS277.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(FQGS277.checkSDI(inputcode,FQGS277.sdi,FQGS277.ssm)+ "\n");builder.append(FQGS277.checkSSM(inputcode,  FQGS277.sdi,FQGS277.ssm)+ "\n"); out.setText(builder.toString());break;
            case "DCU350":     for(int i=0; i< DCU350.getFaults(inputcode,DCU350.systemcode).size();i++) { builder.append(DCU350.getFaults(inputcode,DCU350.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(DCU350.checkSDI(inputcode,DCU350.sdi,DCU350.ssm)+ "\n");builder.append(DCU350.checkSSM(inputcode,  DCU350.sdi,DCU350.ssm)+ "\n"); out.setText(builder.toString());break;
            case "MFD351":     for(int i=0; i< MFD351.getFaults(inputcode,MFD351.systemcode).size();i++) { builder.append(MFD351.getFaults(inputcode,MFD351.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(MFD351.checkSDI(inputcode,MFD351.sdi,MFD351.ssm)+ "\n");builder.append(MFD351.checkSSM(inputcode,  MFD351.sdi,MFD351.ssm)+ "\n"); out.setText(builder.toString());break;
            case "FCC071":     for(int i=0; i< FCC071.getFaults(inputcode,FCC071.systemcode).size();i++) { builder.append(FCC071.getFaults(inputcode,FCC071.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(FCC071.checkSDI(inputcode,FCC071.sdi,FCC071.ssm)+ "\n");builder.append(FCC071.checkSSM(inputcode,  FCC071.sdi,FCC071.ssm)+ "\n"); out.setText(builder.toString());break;
            //case "":     for(int i=0; i< .getFaults(inputcode,.systemcode).size();i++) { builder.append(.getFaults(inputcode,.systemcode).get(i)+ "\n");}builder.append("______________"+ "\n"); builder.append(.checkSDI(inputcode,.sdi,.ssm)+ "\n");builder.append(.checkSSM(inputcode,  .sdi,.ssm)+ "\n"); out.setText(builder.toString());break;









        }
        }
    }

