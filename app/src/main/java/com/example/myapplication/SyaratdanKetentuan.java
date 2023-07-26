package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SyaratdanKetentuan extends AppCompatActivity {

    ImageView panah_sk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syaratdan_ketentuan);

        panah_sk = findViewById(R.id.panah_sk);

        panah_sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SyaratdanKetentuan.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        panah_sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SyaratdanKetentuan.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}