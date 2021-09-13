package com.gmail.lookpj2.movieapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "657e99233c17f4a294f4193ec0979817",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "657e99233c17f4a294f4193ec0979817",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "657e99233c17f4a294f4193ec0979817",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}