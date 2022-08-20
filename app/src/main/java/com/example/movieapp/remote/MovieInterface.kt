package com.example.movieapp.remote

import com.example.movieapp.data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieInterface {
    @GET()
    suspend fun getAllMovies(
        @Query("i") i: String,
        @Query("apikey") apikey: Int,
        apiKey: String

    ):Response<MovieResponse>
}