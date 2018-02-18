package com.example.android.mohakbaranshory_1202150004_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.LinkedList;

public class DineInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    LinkedList<String> noMeja;      // Mendeklarasikan Kelas LinkedList yang bergeneric String
    Spinner spinner;                // Deklarasi Spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);         // Memulai Aktivitas
        setContentView(R.layout.activity_dine_in);  // Menampilkan layout
        spinner = (Spinner) findViewById(R.id.spinner);     // Assign nilai ke variabel spinner

        noMeja = new LinkedList<String>();          // Membuat objek struktur data linkedlist
        for (int i = 1; i < 9; i++) {               // Membuat perulangan agar nilai no meja diambil dari perulangan tsb
            String no = "Meja ";
            noMeja.addLast(no + i);              // Menambahkan gabungan dari "Meja"+angka
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, noMeja); // Instansiasi adapter
        spinner.setAdapter(adapter);    // Set data ke adapter
        spinner.setOnItemSelectedListener(this);    // Menambahkan bahwa data dari adapter telah diklik
    }

    public void pesanMeja(View view) {
        Intent intent = new Intent(this, ListMenuActivity.class);   // Instansiai intent lalu menjalankan aktivitas
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) { // Method turunanan dari  OnItemSelectedListener
        // Membuat toast dan sekaligus menampilkannya
        Toast.makeText(adapterView.getContext(), "Dine In : " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

