package com.naufalcahyo.modul2.naufalcahyo_1202150366_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Naufal Cahyo on 2/17/2018.
 */

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> rvData,rvHarga;
    private ArrayList<Integer> gambar;

    public MyAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga,
                     ArrayList<Integer> gmbr) {
        rvData = inputData;
        rvHarga = dataHarga;
        gambar = gmbr;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        // menggunakan data String dan Integer untuk tiap item
        public TextView namaMenu, harga;
        public ImageView gbrMenu;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();

            //deklarasi TextView, ImageView dan LinearLayoout
            namaMenu = (TextView) v.findViewById(R.id.namaMenu);
            harga = (TextView) v.findViewById(R.id.harga);
            gbrMenu = (ImageView) v.findViewById(R.id.gbr);
            ItemList = v.findViewById(R.id.list);

            // isi dari array nya dapat pindah layout dengan membawa deskripsi sebagaimana
            // telah ditetapkan
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailMenu.class);
                    String ingredient ="";
                    switch (getAdapterPosition()){
                        // case sesuai dengan indeks array
                        case 0 :
                            intent.putExtra("Nama Menu",rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Burger, chips, tenderloin double beef, mustard";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("Nama Menu",rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Egg, bacon (beef), double tenderloin beef";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            intent.putExtra("Nama Menu",rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Jeger, sari rasa ginseng";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("Nama Menu",rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "French fries, double sausage";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            intent.putExtra("Nama Menu",rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "French fries";
                            intent.putExtra("ordinary burger as the name called sammy",ingredient);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            intent.putExtra("Nama Menu",rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Casual burger with seringai merch";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_menu,
                parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // mengambil data dari posisi tertentu dalam recycler view
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = gambar.get(position);

        // menetapkan nilai
        holder.namaMenu.setText(name);
        holder.harga.setText(harga);
        holder.gbrMenu.setImageResource(test);

    }

    @Override
    public int getItemCount() {
        // menghitung jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}
