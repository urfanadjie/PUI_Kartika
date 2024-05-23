package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kartikanurfitria_5210411005.pui.R;

public class Olahraga extends AppCompatActivity {

    Button menurunkanBerat, menaikkanberat, meningkatkanStamina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahraga);

        menurunkanBerat = (Button) findViewById(R.id.button4);
        menaikkanberat = (Button) findViewById(R.id.button8);
        meningkatkanStamina = (Button) findViewById(R.id.button21);

        menurunkanBerat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Olahraga.this, OlahragaMenurunkanBerat.class);
                startActivity(I);
            }
        });

        menaikkanberat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(Olahraga.this, OlahragaMenaikkanBerat.class);
                startActivity(B);
            }
        });

        meningkatkanStamina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C = new Intent(Olahraga.this, OlahragaMeningkatkanStamina.class);
                startActivity(C);
            }
        });

    }
}
