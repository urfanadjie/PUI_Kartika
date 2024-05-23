package com.kartikanurfitria_5210411005.pui;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Informasibmi extends AppCompatActivity {

    private TextView textView6, textViewCategory, textViewMinWeight, textViewMaxWeight, editTextHeight;
    private ImageView imageViewBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kalkulator_bmi);
        textViewMinWeight = findViewById(R.id.dataminberat);
        textViewMaxWeight = findViewById(R.id.datamaxberat);


        // Ambil data yang dikirim dari Activity sebelumnya (Activity A)
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double bmi = extras.getDouble("bmi");
            String category = extras.getString("category");
            double minHeight = extras.getDouble("minHeight");
            double maxHeight = extras.getDouble("maxHeight");

            // Tampilkan hasil kalkulasi BMI dan kategori
            textView6.setText(String.format("BMI: %.2f", bmi));
            textViewCategory.setText("Category: " + category);

            // Mengambil tinggi badan dari input pengguna
            double tinggi = Double.parseDouble(editTextHeight.getText().toString());

            // Menghitung berat badan minimal dan maksimal berdasarkan BMI
            double beratMinimal = 18.5 * Math.pow(tinggi / 100, 2);
            double beratMaksimal = 24.9 * Math.pow(tinggi / 100, 2);

            // Tampilkan informasi minimal dan maksimal berat badan
            textViewMinWeight.setText(String.format("Ideal Weight: %.2f - %.2f kg", minHeight));
            textViewMaxWeight.setText(String.format("Ideal Weight: %.2f - %.2f kg", maxHeight));


            // Tampilkan gambar berdasarkan kategori BMI
            if (category.equals("Underweight")) {
                imageViewBMI.setImageResource(R.drawable.kurus);
            } else if (category.equals("Normal")) {
                imageViewBMI.setImageResource(R.drawable.normal);
            } else if (category.equals("Overweight")) {
                imageViewBMI.setImageResource(R.drawable.kurus);
            } else {
                imageViewBMI.setImageResource(R.drawable.normal);
            }
        }
    }
}
