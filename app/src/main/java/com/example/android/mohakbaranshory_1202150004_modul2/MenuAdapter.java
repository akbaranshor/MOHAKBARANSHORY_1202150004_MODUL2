package com.example.android.mohakbaranshory_1202150004_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Abay on 2/17/2018.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{
    List<MenuItem> menuList;    // Deklarasi struktur data List
    Context context;            // Deklarasi Context

    public MenuAdapter(Context context, List<MenuItem> menuList) {  // Konsttruktor
        this.context = context;
        this.menuList = menuList;
    }

    // dipanggil ketika RecycleView ingin diperbarui
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(context);
        View mItemView = mInflater.inflate(R.layout.menu_item, parent, false);
        MenuViewHolder holder = new MenuViewHolder(mItemView);
        return new MenuViewHolder(mItemView);
    }

    // Dipanggil RecycleView ketika ingin menampilkan data ditempat yang spesifik
    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        MenuItem menu = menuList.get(position);
        holder.namaTxt.setText(menu.getNama());
        holder.hargaTxt.setText(Integer.toString(menu.getHarga()));
    }

    // Menghitng jumlah item
    @Override
    public int getItemCount() {
        return menuList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView namaTxt, hargaTxt;
        public MenuViewHolder(View itemView) {      // Konstruktor
            super(itemView);
            itemView.setOnClickListener(this);
            // Mengassign nilai kedalam variabel, yang telah diambil dari Resource
            namaTxt = itemView.findViewById(R.id.namaMakanan);
            hargaTxt = itemView.findViewById(R.id.hargaMakanan);
        }

        @Override
        public void onClick(View view) {
            // Mencari posisi yang diklik
            int mPosition = getLayoutPosition();
            // Mengakses nilai dari list
            MenuItem element = menuList.get(mPosition);
            Intent intent = new Intent(context, DetailMenuActivity.class);
            // Menaruh beberapa value ke variabel extra
            intent.putExtra("nama", element.getNama());
            intent.putExtra("harga", Integer.toString(element.getHarga()));
            intent.putExtra("desk", element.getDeskripsi());
            context.startActivity(intent);      // Memulai akivitas

        }
    }
}
