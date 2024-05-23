package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kartikanurfitria_5210411005.pui.R;

public class ArtikelAdmin extends AppCompatActivity {

    Button tambahArtikel;
    ImageView editArtikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel_admin);

        tambahArtikel = (Button) findViewById(R.id.tambahartikel);
        editArtikel = (ImageView) findViewById(R.id.Imageedit);

        tambahArtikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(ArtikelAdmin.this, ArtikelAdminTambah.class);
                startActivity(I);
            }
        });

        editArtikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(ArtikelAdmin.this, ArtikelAdminEdit.class);
                startActivity(I);
            }
        });



    }
}