package com.naufalcahyo.modul2.naufalcahyo_1202150366_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    private EditText nama, telepon, alamat, catatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        nama = (EditText) findViewById(R.id.name);
        telepon = (EditText) findViewById(R.id.phone);
        alamat = (EditText) findViewById(R.id.alamat);
        catatan = (EditText) findViewById(R.id.catatan);

    }

    public void pilPes1 (View view){

        String namaa = nama.getText().toString();
        String teleponn = telepon.getText().toString();
        String alamatt = alamat.getText().toString();
        String catatann = catatan.getText().toString();

        if (namaa.isEmpty()|| teleponn.isEmpty() || alamatt.isEmpty() || catatann.isEmpty()){
            Toast.makeText(this,"Silahkan lengkapi dahulu " +
                    "informasi yang ada",Toast.LENGTH_LONG).show();
        }else {
            //menjalankan intent dan pindah ke MainMenu
            startActivity(new Intent(TakeAway.this, MainMenu.class));
        }
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = (month_string + "/" +
                day_string + "/" + year_string);

        String namaa = nama.getText().toString();
        String teleponn = telepon.getText().toString();
        String alamatt = alamat.getText().toString();
        String catatann = catatan.getText().toString();

        //kondisi ketika nama/telepon/alamat/catatan kosong
        if (namaa.isEmpty()|| teleponn.isEmpty() || alamatt.isEmpty() || catatann.isEmpty()){
            Toast.makeText(this,"Silahkan lengkapi dahulu " +
                    "informasi yang ada",Toast.LENGTH_LONG).show();
        //jika ada isi
        }else {
            Toast.makeText(this, namaa + " dengan nomor telepon " + teleponn
                            + " akan mengambil order pada " +  getString(R.string.date) + " "
                            + dateMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);

        String namaa = nama.getText().toString();
        String teleponn = telepon.getText().toString();
        String alamatt = alamat.getText().toString();
        String catatann = catatan.getText().toString();

        //kondisi ketika nama/telepon/alamat/catatan kosong
        if (namaa.isEmpty()|| teleponn.isEmpty() || alamatt.isEmpty() || catatann.isEmpty()){
            Toast.makeText(this,"Silahkan lengkapi dahulu " +
                    "informasi yang ada",Toast.LENGTH_LONG).show();
        //jika ada isi
        }else {
            String timeMessage = (hour_string + ":" + minute_string);
            Toast.makeText(this, namaa + " dengan nomor telepon " + teleponn +
                            " akan mengambil pesanan pada " + getString(R.string.time) + " " +
                    timeMessage, Toast.LENGTH_SHORT).show();
        }
    }
}

