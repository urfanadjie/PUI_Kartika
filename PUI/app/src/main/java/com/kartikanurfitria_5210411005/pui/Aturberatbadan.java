package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Aturberatbadan extends AppCompatActivity {
    Button buttonTambahBeratBatan, buttonKurangiBeratBadan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aturberatbadan);

        buttonTambahBeratBatan = (Button) findViewById(R.id.button9);
        buttonKurangiBeratBadan = (Button) findViewById(R.id.button8);

        buttonTambahBeratBatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Aturberatbadan.this, TambahBerat.class);
                startActivity(I);
            }
        });

        buttonKurangiBeratBadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Aturberatbadan.this, KurangiBerat.class);
                startActivity(I);
            }
        });
    }
}