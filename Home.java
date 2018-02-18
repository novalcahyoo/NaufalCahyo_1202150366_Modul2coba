package com.naufalcahyo.modul2.naufalcahyo_1202150366_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Home extends AppCompatActivity {


    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void pesanNow(View view) {

        //deklarasi radio group
        rg = (RadioGroup) findViewById(R.id.radioGroup);


        //kondisi ketika yang di pilih dine in
        if (rg.getCheckedRadioButtonId()== R.id.rbDineIn){

            Toast.makeText(this, "Anda Memilih Dine In",
                    Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, DineIn.class));
        //kondisi ketika yang dipilih take away
        } else {
            Toast.makeText(this, "Anda Memilih Take Away",
                    Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, TakeAway.class));
        }

    }


}
