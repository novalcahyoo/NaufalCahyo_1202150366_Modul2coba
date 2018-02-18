package com.naufalcahyo.modul2.naufalcahyo_1202150366_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DineIn extends AppCompatActivity  {

    TextView nama;
    Button btnPilPes2;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

    }

    public void pilPes2(View view) {

        nama =(TextView) findViewById(R.id.name);
        String namaa = nama.getText().toString();

        btnPilPes2 = (Button) findViewById(R.id.btnPilPes2);
        sp = (Spinner) findViewById(R.id.isiSpinner);
        String meja = sp.getSelectedItem().toString();


        //kondisi ketika nilai meja = pilih meja anda dan nama kosong
        if (meja.equals("--Pilih Meja Anda--") && namaa.isEmpty()) {
            Toast.makeText(DineIn.this, "Isi nama dan pilih" +
                    "meja terlebih dahulu", Toast.LENGTH_LONG).show();
        } else if (meja.equals("--Pilih Meja Anda--") && namaa != null){
            Toast.makeText(DineIn.this, "Pilih meja terlebih dahulu",
                    Toast.LENGTH_LONG).show();
        } else if (!meja.equals("--Pilih Meja Anda--") && namaa.isEmpty()){
            Toast.makeText(DineIn.this, "Isi nama terlebih dahulu",
                    Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(DineIn.this, namaa + " " + "telah memilih" + " "
                            + meja,
                    Toast.LENGTH_LONG).show();
            startActivity(new Intent(DineIn.this, MainMenu.class));
        }
    }
}
