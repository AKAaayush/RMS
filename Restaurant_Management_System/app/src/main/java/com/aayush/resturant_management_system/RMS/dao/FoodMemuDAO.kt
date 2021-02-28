package com.aayush.resturant_management_system.RMS.dao

import androidx.room.Insert
import androidx.room.Query
import com.aayush.resturant_management_system.RMS.entity.FoodMenu

interface FoodMemuDAO {
    @Query("Delete from FoodMenu")
    suspend fun deleteWorkOutData()

    @Insert
    suspend fun insertWorkOutData(workout: MutableList<FoodMenu>?)
}