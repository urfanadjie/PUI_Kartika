package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kartikanurfitria_5210411005.pui.R;

public class OlahragaMenaikkanBerat extends AppCompatActivity {

    ImageView Level1, Level2, Level3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahragamenaikkanberat);

        Level1 = (ImageView) findViewById(R.id.Image11);
        Level2 = (ImageView) findViewById(R.id.Image22);
        Level3 = (ImageView) findViewById(R.id.Gambar3);



        Level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(OlahragaMenaikkanBerat.this, OlahragaMenaikkanLevel1.class);
                startActivity(I);
            }
        });

        Level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(OlahragaMenaikkanBerat.this, OlahragaMenaikkanLevel2.class);
                startActivity(B);
            }
        });

        Level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C = new Intent(OlahragaMenaikkanBerat.this, OlahragaMenaikkanLevel3.class);
                startActivity(C);
            }
        });
    }
}