package com.aayush.resturant_management_system.RMS.repository

import com.aayush.resturant_management_system.RMS.api.ApiRequest
import com.aayush.resturant_management_system.RMS.api.ServiceBuilder
import com.aayush.resturant_management_system.RMS.api.UserApi
import com.aayush.resturant_management_system.RMS.model.User
import com.aayush.resturant_management_system.RMS.response.LoginResponse
import com.aayush.resturant_management_system.RMS.response.RegisterResponse


class UserRepository: ApiRequest() {
    val myApi= ServiceBuilder.buildServices(UserApi::class.java)

    suspend fun registerUSer(user: User): RegisterResponse {
        return apiRequest {
            myApi.userAdd(user)
        }
    }
    suspend fun checkUser(email:String,password:String): LoginResponse {
        return apiRequest {
            myApi.checkUser(email, password)
        }
    }
}