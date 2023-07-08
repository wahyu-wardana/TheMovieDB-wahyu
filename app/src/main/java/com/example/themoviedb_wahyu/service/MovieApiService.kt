package com.example.themoviedb_wahyu.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieApiService {
    companion object val BASE_URL = "https://www.api.themoviedb.org"

    private var retrofit : Retrofit? = null

    fun getInstance(): Retrofit {
        if(retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}