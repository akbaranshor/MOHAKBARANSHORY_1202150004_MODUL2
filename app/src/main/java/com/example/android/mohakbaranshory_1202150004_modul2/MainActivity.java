package com.example.android.mohakbaranshory_1202150004_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;      // Membuat variabel yang mengatur detiknya splash
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);         // Memulai aktivitas
        setContentView(R.layout.activity_main);     // Mensetting content aktivitas ke view eksplisit
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {             // Instansiasi handler yang berguna untuk menambahkan Runnable ke queue pesan dengan waktu tertentu
                Intent homeIntent = new Intent(MainActivity.this, MenuActivity.class);  // penghubung antar dua aktivitas
                startActivity(homeIntent);  // Mengeksekusi aktivitas
                finish();                   // Dilakukan untuk mengakhiri aktiviras
            }
        }, SPLASH_TIME_OUT);
    }
}
