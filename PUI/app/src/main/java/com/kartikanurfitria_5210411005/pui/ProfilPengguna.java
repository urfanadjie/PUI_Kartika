package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kartikanurfitria_5210411005.pui.R;

public class ProfilPengguna extends AppCompatActivity {

    CardView button_tambahartikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilpengguna);

        button_tambahartikel = (CardView) findViewById(R.id.button_tambahartikel);

        button_tambahartikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukatambahartikel = new Intent(ProfilPengguna.this, ArtikelAdmin.class);
                startActivity(bukatambahartikel);
            }
        });
    }
}