package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kartikanurfitria_5210411005.pui.R;

public class ResepMakanan extends AppCompatActivity {

    ImageView Resep1, Resep2, Resep3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resepmakanan);

        Resep1 = (ImageView) findViewById(R.id.Image1);
        Resep2 = (ImageView) findViewById(R.id.Image2);
        Resep3 = (ImageView) findViewById(R.id.Image3);

        Resep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(ResepMakanan.this, ResepMakanan1.class);
                startActivity(A);
            }
        });

        Resep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(ResepMakanan.this, ResepMakanan2.class);
                startActivity(B);
            }
        });

        Resep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C = new Intent(ResepMakanan.this, ResepMakanan3.class);
                startActivity(C);
            }
        });


    }
}