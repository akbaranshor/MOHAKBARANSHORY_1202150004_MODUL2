package com.example.android.mohakbaranshory_1202150004_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenuActivity extends AppCompatActivity {
    RecyclerView recyclerView;      // Mendeklarasikan recycleview
    MenuAdapter adapter;            // Mendeklarasikan MenuAdapter

    List<MenuItem> menuItems;       // Mendeklarasikan struktur data list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);    // Menampilkan layout

        menuItems = new ArrayList<>();  // Assign objek ArrayList ke List
        recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);     // agar adapter tidak dapat mengganggu recycle view
        recyclerView.setLayoutManager(new LinearLayoutManager(this));   // Menampung recycleview

        menuItems.add(new MenuItem("Nasi Goreng", "Pake Sosis", 20000));    // menambahkan nilai ke dalam strukdata List
        menuItems.add(new MenuItem("Nasi Kuning", "Pake Ayam", 25000));
        adapter = new MenuAdapter(this, menuItems);
        recyclerView.setAdapter(adapter);       // Set data ke adapter
    }
}
