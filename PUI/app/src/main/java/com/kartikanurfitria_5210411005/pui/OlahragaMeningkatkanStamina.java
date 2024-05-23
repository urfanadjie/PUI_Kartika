package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kartikanurfitria_5210411005.pui.R;

public class OlahragaMeningkatkanStamina extends AppCompatActivity {

    ImageView Level1, Level2, Level3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahragameningkatkanstamina);

        Level1 = (ImageView) findViewById(R.id.Image11);
        Level2 = (ImageView) findViewById(R.id.Image22);
        Level3 = (ImageView) findViewById(R.id.Image33);

        Level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(OlahragaMeningkatkanStamina.this, OlahragaStaminaLevel1.class);
                startActivity(I);
            }
        });

        Level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(OlahragaMeningkatkanStamina.this, OlahragaStaminaLevel2.class);
                startActivity(A);
            }
        });

        Level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(OlahragaMeningkatkanStamina.this, OlahragaStaminaLevel3.class);
                startActivity(B);
            }
        });

    }
}