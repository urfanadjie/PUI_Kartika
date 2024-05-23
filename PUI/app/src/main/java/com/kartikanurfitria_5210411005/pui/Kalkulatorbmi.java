package com.kartikanurfitria_5210411005.pui;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Kalkulatorbmi extends AppCompatActivity {

     EditText etWeight, etHeight;
     RadioButton radioButtonMale, radioButtonFemale;
     Button buttoncalculatebmi, buttonhasilkalkulator;
     TextView tvBMIResult, tvCategoryResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_bmi);

        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        buttoncalculatebmi = findViewById(R.id.buttoncalculatebmi);
        tvBMIResult = findViewById(R.id.tvBMIResult);
        tvCategoryResult = findViewById(R.id.tvCategoryResult);
        buttonhasilkalkulator = findViewById(R.id.buttonhasilkalkulator);

        buttoncalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });

        buttonhasilkalkulator = (Button) findViewById(R.id.buttonhasilkalkulator);

        buttonhasilkalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bukainformasibmi = new Intent(Kalkulatorbmi.this, Informasibmi.class);
                startActivity(bukainformasibmi);
            }
        });

    }

    private void calculateBMI() {
        // Mengambil nilai berat badan dan tinggi badan dari input pengguna
        double weight = Double.parseDouble(etWeight.getText().toString());
        double height = Double.parseDouble(etHeight.getText().toString()) / 100;

        // Menghitung BMI
        double bmi = weight / (height * height);

        // Menampilkan hasil kalkulasi BMI
        tvBMIResult.setText(String.format("%.2f", bmi));



        // Menentukan kategori BMI
        String category;
        if (radioButtonMale.isChecked()) {
            // Kriteria BMI untuk laki-laki
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }
        } else if (radioButtonFemale.isChecked()) {
            // Kriteria BMI untuk perempuan
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 24) {
                category = "Normal";
            } else if (bmi < 29) {
                category = "Overweight";
            } else {
                category = "Obese";
            }
        } else {
            // Jika tidak ada jenis kelamin yang dipilih, berikan pesan kesalahan
            category = "Please select gender";
        }

        tvCategoryResult.setText("" + category);
    }

}
