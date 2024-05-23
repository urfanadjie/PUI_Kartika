package com.kartikanurfitria_5210411005.pui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TambahBerat extends AppCompatActivity {
    Button tambahJadwal,rekomenadasiMakanan, rekomendasiOlahraga, tipsTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahberat);
        tambahJadwal = (Button) findViewById(R.id.button4);
        rekomenadasiMakanan = (Button) findViewById(R.id.button8);
        rekomendasiOlahraga = (Button) findViewById(R.id.button13);
        tipsTips = (Button) findViewById(R.id.button6);


        tambahJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(TambahBerat.this, NaikkanJadwalMakan.class);
                startActivity(I);
            }
        });

        rekomenadasiMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(TambahBerat.this, NaikkanRekomendasiMakanan.class);
                startActivity(A);
            }
        });

        rekomendasiOlahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(TambahBerat.this, NaikkanRekomendasiOlahraga.class);
                startActivity(B);
            }
        });

        tipsTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C = new Intent(TambahBerat.this, NaikkanTipsTips.class);
                startActivity(C);
            }
        });
    }
}