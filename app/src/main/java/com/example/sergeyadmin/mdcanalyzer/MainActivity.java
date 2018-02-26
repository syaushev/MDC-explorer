package com.example.sergeyadmin.mdcanalyzer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public EditText editText;

    TextView findbuttton;
    ImageButton clear;
    TextView systemname;
    ImageButton help;


    final int ACFC350=1;
    final int ACFC351=2;
    final int ADC350=3;
    final int ADF350=4;
    final int AHRS350=5;
    final int AHRS351=6;
    final int APU350=7;
    final int APU351=8;
    final int APU352=9;
    final int BTMS350=10;
    final int CDU354=11;
    final int CFSS351=12;
    final int CPAM270=13;
    final int CPC270=14;
    final int DBU351=15;
    final int DCP352=16;
    final int DCU242=17;
    final int DCU350=18;
    final int DCU351=19;
    final int DCU352=20;
    final int DME350=21;
    final int ECFC351= 22;
    final int SECU350= 23;
    final int MDC350= 24;
    final int IRS353= 25;
    final int TCAS350= 26;
    final int SECU352= 27;
    final int SECU353= 28;
    final int FMS350= 29;
    final int GPS355= 30;
    final int SPS350= 31;
    final int HSTCU271= 32;
    final int ECFP351= 33;
    final int SECU273= 34;
    final int TDR350= 35;
    final int MFD350= 36;
    final int RCFLP351= 37;
    final int GPWS350= 38;
    final int IRS351= 39;
    final int HGS350= 40;
    final int SECU271= 41;
    final int HSTCU272= 42;
    final int SPS270= 43;
    final int LDU350= 44;
    final int HSTCU273= 45;
    final int EICAS350= 46;
    final int HSTCU350= 47;
    final int HSTCU270= 48;
    final int IOC350= 49;
    final int PFD351= 50;
    final int SECU272= 51;
    final int RCFRC351= 52;
    final int IRS350= 53;
    final int RAC350= 54;
    final int GPWS351= 55;
    final int FQGS276= 56;
    final int ECP377= 57;
    final int RTU352= 58;
    final int PFD350= 59;
    final int RCFLC351= 60;
    final int RTU350= 61;
    final int RCFRP351= 62;
    final int SECU351= 63;
    final int EICAS351= 64;
    final int PSEU273= 65;
    final int FQGS277= 66;
    final int MFD351= 67;




   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        systemname=(TextView) findViewById(R.id.textView2);
        editText=(EditText) findViewById(R.id.editText);
        findbuttton=(TextView) findViewById(R.id.button) ;
        findbuttton.setOnClickListener(this);
        clear=(ImageButton) findViewById(R.id.button3) ;
        clear.setOnClickListener(this);
        help=(ImageButton) findViewById(R.id.button2);
        help.setOnClickListener(this);


        editText.addTextChangedListener(wacher);

        registerForContextMenu(systemname);




    }


    TextWatcher wacher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            if(editText.length()==4|editText.length()==9|editText.length()==14|editText.length()==19|editText.length()==24){

                editText.setText(editText.getText()+"-");
                editText.setSelection(editText.getText().length());

            }

        }
    };

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                if((editText.getText().toString().equals(""))|(editText.getText().toString().length()<29)){
                    Toast toast=Toast.makeText(MainActivity.this,"You should enter 24 digits",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{

                    Intent intent = new Intent(this, FindActivity.class);
                    intent.putExtra("inputcode", editText.getText().toString());
                    intent.putExtra("systemname",systemname.getText());
                    startActivity(intent);}
                break;
            case R.id.button3: editText.setText("");
                break;
            case R.id.button2:
                Intent intent1 =new Intent(this,HelpActivity.class);
                startActivity(intent1);
                break;

        }

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,ACFC350,1,"ACFC(350)");
        menu.add(0,ACFC351,1,"ACFC (351)");
        menu.add(0,ADC350,1,"ADC (350)");
        menu.add(0,ADF350,1,"ADF (350)");
        menu.add(0,AHRS350,1,"AHRS (350)");
        menu.add(0,AHRS351,1,"AHRS (351)");
        menu.add(0,APU350,1,"APU (350)");
        menu.add(0,APU351,1,"APU (351)");
        menu.add(0,APU352,1,"APU (352)");
        menu.add(0,BTMS350,1,"BTMS (350)");
        menu.add(0,CDU354,1,"CDU (354)");
        menu.add(0,CFSS351,1,"CFSS (351)");
        menu.add(0,CPAM270,1,"CPAM (270)");
        menu.add(0,CPC270,1,"CPC (270)");
        menu.add(0,DBU351,1,"DBU (351)");
        menu.add(0,DCP352,1,"DCP (352)");
        menu.add(0,DCU242,1,"DCU (242)");
        menu.add(0,DCU350,1,"DCU (350)");
        menu.add(0,DCU351,1,"DCU (351)");
        menu.add(0,DCU352,1,"DCU (352)");
        menu.add(0,DME350,1,"DME (350)");
        menu.add(0,ECFC351,1,"ECFC (351)");
        menu.add(0,SECU350,1,"SECU (350)");
        menu.add(0,MDC350,1,"MDC (350)");
        menu.add(0,IRS353,1,"IRS (353)");
        menu.add(0,TCAS350,1,"TCAS (350)");
        menu.add(0,SECU352,1,"SECU (352)");
        menu.add(0,SECU353,1,"SECU (353)");
        menu.add(0,FMS350,1,"FMS (350)");
        menu.add(0,GPS355,1,"GPS (355)");
        menu.add(0,SPS350,1,"SPS (350)");
        menu.add(0,HSTCU271,1,"HSTCU (271)");
        menu.add(0,ECFP351,1,"ECFP (351)");
        menu.add(0,SECU273,1,"SECU (273)");
        menu.add(0,TDR350,1,"TDR (350)");
        menu.add(0,MFD350,1,"MFD (350)");
        menu.add(0,RCFLP351,1,"RCFLP (351)");
        menu.add(0,GPWS350,1,"GPWS (350)");
        menu.add(0,IRS351,1,"IRS (351)");
        menu.add(0,HGS350,1,"HGS (350)");
        menu.add(0,SECU271,1,"SECU (271)");
        menu.add(0,HSTCU272,1,"HSTCU (272)");
        menu.add(0,SPS270,1,"SPS (270)");
        menu.add(0,LDU350,1,"LDU (350)");
        menu.add(0,HSTCU273,1,"HSTCU273");
        menu.add(0,EICAS350,1,"EICAS (350)");
        menu.add(0,HSTCU350,1,"HSTCU (350)");
        menu.add(0,HSTCU270,1,"HSTCU (270)");
        menu.add(0,IOC350,1,"IOC (350)");
        menu.add(0,PFD351,1,"PFD (351)");
        menu.add(0,SECU272,1,"SECU (272)");
        menu.add(0,RCFRC351,1,"RCFRC (351)");
        menu.add(0,IRS350,1,"IRS (350)");
        menu.add(0,RAC350,1,"RAC (350)");
        menu.add(0,GPWS351,1,"GPWS (351)");
        menu.add(0,FQGS276,1,"FQGS (276)");
        menu.add(0,ECP377,1,"ECP (377)");
        menu.add(0,RTU352,1,"RTU (352)");
        menu.add(0,PFD350,1,"PFD (350)");
        menu.add(0,RCFLC351,1,"RCFLC (351)");
        menu.add(0,RTU350,1,"RTU (350)");
        menu.add(0,RCFRP351,1,"RCFRP (351)");
        menu.add(0,SECU351,1,"SECU (351)");
        menu.add(0,EICAS351,1,"EICAS (351)");
        menu.add(0,PSEU273,1,"PSEU (273)");
        menu.add(0,FQGS277,1,"FQGS (277)");
        menu.add(0,MFD351,1,"MFD (351)");




    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case ACFC350:systemname.setText("ACFC350");break;
            case ACFC351:systemname.setText("ACFC351");break;
            case ADC350:systemname.setText("ADC350");break;
            case ADF350:systemname.setText("ADF350");break;
            case AHRS350:systemname.setText("AHRS350");break;
            case AHRS351:systemname.setText("AHRS351");break;
            case APU350:systemname.setText("APU350");break;
            case APU351:systemname.setText("APU351");break;
            case APU352:systemname.setText("APU352");break;
            case BTMS350:systemname.setText("BTMS350");break;
            case CDU354:systemname.setText("CDU354");break;
            case CFSS351:systemname.setText("CFSS351");break;
            case CPAM270:systemname.setText("CPAM270");break;
            case CPC270:systemname.setText("CPC270");break;
            case DBU351:systemname.setText("DBU351");break;
            case DCP352:systemname.setText("DCP352");break;
            case DCU242:systemname.setText("DCU242");break;
            case DCU350:systemname.setText("DCU350");break;
            case DCU351:systemname.setText("DCU351");break;
            case DCU352:systemname.setText("DCU352");break;
            case DME350:systemname.setText("DME350");break;
            case ECFC351:systemname.setText("ECFC351");break;
            case SECU350:systemname.setText("SECU350");break;
            case MDC350:systemname.setText("MDC350");break;
            case IRS353:systemname.setText("IRS353");break;
            case TCAS350:systemname.setText("TCAS350");break;
            case SECU352:systemname.setText("SECU352");break;
            case SECU353:systemname.setText("SECU353");break;
            case FMS350:systemname.setText("FMS350");break;
            case GPS355:systemname.setText("GPS355");break;
            case SPS350:systemname.setText("SPS350");break;
            case HSTCU271:systemname.setText("HSTCU271");break;
            case ECFP351:systemname.setText("ECFP351");break;
            case SECU273:systemname.setText("SECU273");break;
            case TDR350:systemname.setText("TDR350");break;
            case MFD350:systemname.setText("MFD350");break;
            case RCFLP351:systemname.setText("RCFLP351");break;
            case GPWS350:systemname.setText("GPWS350");break;
            case IRS351:systemname.setText("IRS351");break;
            case HGS350:systemname.setText("HGS350");break;
            case SECU271:systemname.setText("SECU271");break;
            case HSTCU272:systemname.setText("HSTCU272");break;
            case SPS270:systemname.setText("SPS270");break;
            case LDU350:systemname.setText("LDU350");break;
            case HSTCU273:systemname.setText("HSTCU273");break;
            case EICAS350:systemname.setText("EICAS350");break;
            case HSTCU350:systemname.setText("HSTCU350");break;
            case HSTCU270:systemname.setText("HSTCU270");break;
            case IOC350:systemname.setText("IOC350");break;
            case PFD351:systemname.setText("PFD351");break;
            case SECU272:systemname.setText("SECU272");break;
            case RCFRC351:systemname.setText("RCFRC351");break;
            case IRS350:systemname.setText("IRS350");break;
            case RAC350:systemname.setText("RAC350");break;
            case GPWS351:systemname.setText("GPWS351");break;
            case FQGS276:systemname.setText("FQGS276");break;
            case ECP377:systemname.setText("ECP377");break;
            case RTU352:systemname.setText("RTU352");break;
            case PFD350:systemname.setText("PFD350");break;
            case RCFLC351:systemname.setText("RCFLC351");break;
            case RTU350:systemname.setText("RTU350");break;
            case RCFRP351:systemname.setText("RCFRP351");break;
            case SECU351:systemname.setText("SECU351");break;
            case EICAS351:systemname.setText("EICAS351");break;
            case PSEU273:systemname.setText("PSEU273");break;
            case FQGS277:systemname.setText("FQGS277");break;
            case MFD351:systemname.setText("MFD351");break;


        }


        return super.onContextItemSelected(item);
    }
}


