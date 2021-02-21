package com.aayush.resturant_management_system.RMS.api

import com.aayush.resturant_management_system.RMS.model.User
import com.aayush.resturant_management_system.RMS.response.LoginResponse
import com.aayush.resturant_management_system.RMS.response.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface UserApi {

    @POST("user/add")
    suspend fun userAdd(@Body users: User): Response<RegisterResponse>

    @FormUrlEncoded
    @POST("auth/login")
    suspend fun checkUser(
        @Field("email") email:String,
        @Field("password") password:String
    ): Response<LoginResponse>

}