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

public class KurangiBerat extends AppCompatActivity {
    Button tambahJadwal, rekomendasiMakan, rekomendasiOlahraga,tipsTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turunkanberat);
        tambahJadwal = (Button) findViewById(R.id.button4);
        rekomendasiMakan = (Button) findViewById(R.id.button8);
        rekomendasiOlahraga = (Button) findViewById(R.id.button2);
        tipsTips = (Button) findViewById(R.id.button13);


        tambahJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(KurangiBerat.this, TurunkanJadwalMakan.class);
                startActivity(I);
            }
        });

        rekomendasiMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(KurangiBerat.this, TurunkanRekomendasiMakan.class);
                startActivity(A);
            }
        });

        rekomendasiOlahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(KurangiBerat.this, TurunkanRekomendasiOlahraga.class);
                startActivity(B);
            }
        });

        tipsTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C = new Intent(KurangiBerat.this, TurunkanTipsTips.class);
                startActivity(C);
            }
        });


    }
}