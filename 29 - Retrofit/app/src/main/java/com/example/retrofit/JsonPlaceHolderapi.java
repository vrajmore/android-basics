package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderapi {
    @GET("posts")
    Call<List<Post>> getpost();
}
