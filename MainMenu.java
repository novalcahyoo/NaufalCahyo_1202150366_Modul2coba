package com.naufalcahyo.modul2.naufalcahyo_1202150366_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

//import com.naufalcahyo.modul2.naufalcahyo_1202150366_modul2.MyAdapter;

import java.util.ArrayList;

/**
 * Created by Naufal Cahyo on 2/17/2018.
 */

public class MainMenu extends AppCompatActivity {

//    ListView listView;

    private RecyclerView rv;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;

    //Daftar Menu Makanan
    private String[] Menus = {"The Lemmy", "Gopur","Arian","Burger Kill","Samm","Seringai"};
    //Daftar Harga
    private String[] Hargas = {"Rp. 85.000", "Rp. 55.000","Rp. 35.000","Rp. 60.000",
            "Rp. 85.000","Rp. 40.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,
            R.drawable.menu4,R.drawable.menu5,R.drawable.menu6};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rv = (RecyclerView) findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        adapter = new MyAdapter(dataMenu,dataHarga,gambar);
        rv.setAdapter(adapter);

    }

    //melakukan pengulangan selama kondisi terpenuhi (indeks array Menus)
    private void DaftarItem() {
        for (int w=0; w<Menus.length; w++){
            dataMenu.add(Menus[w]);
            dataHarga.add(Hargas[w]);
            gambar.add(Gambar[w]);
        }
    }

}
