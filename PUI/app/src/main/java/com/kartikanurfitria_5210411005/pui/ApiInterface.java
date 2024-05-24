package com.kartikanurfitria_5210411005.pui;

import android.database.Observable;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.Path;


public interface ApiInterface {
    @GET("articles")
    Call<List<Articles>> getArticles();

    @PATCH("alerts/{alert_id}/accept")
    Call<Void>
    accept_invited_alerts(
            @Header("X-Api-Token"
            )
            String api_token,
            @Path("alert_id") int alert_id);

}
