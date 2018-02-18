package com.example.android.mohakbaranshory_1202150004_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TakeAwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);    // Menampilkan layout
        showToast();    // Menjalankan method yang menjalankan toast
    }

    private void showToast() {
        Toast toast = Toast.makeText(this, "Take Away", Toast.LENGTH_SHORT); // Membuat toast
        toast.show();   // Memunculkan toast
    }

    public void pesanTake(View view) {
        Intent intent = new Intent(this, ListMenuActivity.class);   // Membuat intent
        startActivity(intent);  // Memulai Aktivitas
    }
}
