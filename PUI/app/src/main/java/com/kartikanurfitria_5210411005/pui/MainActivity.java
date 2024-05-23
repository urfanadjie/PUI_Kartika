package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView fiturkalkulatormbi, fituraturberat, Olahraga, fiturAturPolaMakan, fiturResepMakan, fiturProgres, navigationhome, navigationartikel, navigationprofil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fiturkalkulatormbi = (ImageView) findViewById(R.id.fiturkalkulatormbi);
        fituraturberat = (ImageView) findViewById(R.id.fituraturberat);
        Olahraga = (ImageView) findViewById(R.id.imageview6);
        fiturAturPolaMakan = (ImageView) findViewById(R.id.imageview7);
        fiturResepMakan = (ImageView) findViewById(R.id.imageview8);
        fiturProgres = (ImageView) findViewById(R.id.imageview9);
        navigationhome = (ImageView) findViewById(R.id.navigationhome);
        navigationartikel = (ImageView) findViewById(R.id.navigationartikel);
        navigationprofil = (ImageView) findViewById(R.id.navigationprofil);


        fiturkalkulatormbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukakalkulatorbmi = new Intent(MainActivity.this, Kalkulatorbmi.class);
                startActivity(bukakalkulatorbmi);
            }
        });

        fituraturberat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(MainActivity.this, Aturberatbadan.class);
                startActivity(I);
            }
        });

        Olahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(MainActivity.this, Olahraga.class);
                startActivity(A);
            }
        });

        fiturAturPolaMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(MainActivity.this, AturPolaMakan.class);
                startActivity(B);
            }
        });

        fiturResepMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C = new Intent(MainActivity.this, ResepMakanan.class);
                startActivity(C);
            }
        });

        fiturProgres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(MainActivity.this, Progres.class);
                startActivity(I);
            }
        });

        navigationhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent D = new Intent(MainActivity.this, MainActivity.class);
                startActivity(D);
            }
        });

        navigationartikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(MainActivity.this, ArtikelPengguna.class);
                startActivity(I);
            }
        });

        navigationprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent E = new Intent(MainActivity.this, ProfilPengguna.class);
                startActivity(E);
            }
        });





    }
}