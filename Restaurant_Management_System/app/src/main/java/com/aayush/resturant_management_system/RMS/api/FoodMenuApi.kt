package com.aayush.resturant_management_system.RMS.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface FoodMenuApi {
    @GET("workout/display")
    suspend fun addWorkout(
            @Header("Authorization") token: String
    ): Response<>
}