package com.example.themoviedb_wahyu.service

import com.example.themoviedb_wahyu.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=281d3fe3f5911ed4f24e36ce986de054")
    fun getMovieList(): Call<MovieResponse>
}