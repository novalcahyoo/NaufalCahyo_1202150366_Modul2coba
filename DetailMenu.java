package com.naufalcahyo.modul2.naufalcahyo_1202150366_modul2;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DetailMenu extends AppCompatActivity {

    private TextView namaMenu,hargaMenu,kompoMenu;
    private ImageView gbrMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //variabel yang mengambil id dari teks view dan image view yang telah ditetapkan
        namaMenu = (TextView) findViewById(R.id.menuDtl);
        hargaMenu = (TextView) findViewById(R.id.hargaDtl);
        kompoMenu = (TextView) findViewById(R.id.komposisiDtl);
        gbrMenu = (ImageView) findViewById(R.id.gambarDtl);

        Intent c = getIntent();

        //mengambil nilai dari intent yang dikirim dengan mengacu pada key
        String menu = c.getStringExtra("Nama Menu");
        String hrga = c.getStringExtra("Harga");
        String kmposisi= c.getStringExtra("Komposisi");
        Integer gbr = c.getIntExtra("gambar",0);

        //penetapan nilai untuk teks dan gambar
        namaMenu.setText(menu);
        hargaMenu.setText(hrga);
        kompoMenu.setText(kmposisi);
        gbrMenu.setImageResource(gbr);


    }

}
