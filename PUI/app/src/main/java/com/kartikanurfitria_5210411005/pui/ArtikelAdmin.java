package com.kartikanurfitria_5210411005.pui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//inisialisasi recyclerview
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//inisialisasi list adapter
import java.util.List;

//inisialisasi retrofit
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.kartikanurfitria_5210411005.pui.R;

public class ArtikelAdmin extends AppCompatActivity {

    private ApiInterface apiService;
    private RecyclerView recyclerView;
    private ArticleAdapter adapter;

    Button tambahArtikel;
    ImageView editArtikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel_admin);

        //buat konstruktor recyclerview
        apiService = ApiClient.getClient().create(ApiInterface.class);
        recyclerView = findViewById(R.id.recyclerViewArticles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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

        // Memanggil API untuk mendapatkan daftar artikel
        Call<List<Articles>> call = apiService.getArticles();
        call.enqueue(new Callback<List<Articles>>() {
            @Override
            public void onResponse(Call<List<Articles>> call, Response<List<Articles>> response) {
                if (response.isSuccessful()) {
                    List<Articles> articles = response.body();
                    adapter = new ArticleAdapter(ArtikelAdmin.this, articles);
                    recyclerView.setAdapter(adapter);
                } else {
                    Toast.makeText(ArtikelAdmin.this, "Failed to get articles", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Articles>> call, Throwable t) {
                Toast.makeText(ArtikelAdmin.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}

