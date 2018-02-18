package com.example.android.mohakbaranshory_1202150004_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MenuActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        showToast();

    }
    private void showToast() {
        Toast toast = Toast.makeText(this, "MOHAKBARANSHORY_1202150004", Toast.LENGTH_LONG);
        toast.show();
    }

    public void pesan(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.tes);
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (checkedRadioButtonId == R.id.dineInRad) {
            intent = new Intent(this, DineInActivity.class);
        } else {
            intent = new Intent(this, TakeAwayActivity.class);
        }
        startActivity(intent);
    }
}
