package com.example.android.mohakbaranshory_1202150004_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailMenuActivity extends AppCompatActivity {
    TextView harga, nama, desk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);      // Menampilkan layout

        // Assign nilai ke dalam variabel
        harga = findViewById(R.id.namaMakananTxt);
        nama = findViewById(R.id.hargaMakananTxt);
        desk = findViewById(R.id.deskMakananTxt);

        // Set text berdasarkan nilai yang didapat dari variabel extra
        nama.setText("Nama Makanan : "+getIntent().getStringExtra("nama"));
        harga.setText("Harga : Rp. "+getIntent().getStringExtra("harga"));
        desk.setText("Deskripsi : "+getIntent().getStringExtra("desk"));
    }
}
