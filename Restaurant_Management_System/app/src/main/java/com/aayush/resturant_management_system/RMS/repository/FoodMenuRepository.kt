package com.aayush.resturant_management_system.RMS.repository

import com.aayush.resturant_management_system.RMS.api.ServiceBuilder
import com.aayush.resturant_management_system.RMS.api.UserApi


class FoodMenuRepository {
    private val WorkoutApi = ServiceBuilder.buildServices(WorkoutApi::class.java)

    suspend fun  getWorkOutApiData(): WorkOutResponse{
        return apiRequest {
            WorkoutApi.addWorkout(ServiceBuilder.token!!)
        }
    }
}