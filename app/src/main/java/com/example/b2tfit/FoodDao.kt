package com.example.b2tfit

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {
    // Query to get all data from the table HealthData
    @Query("SELECT * FROM HealthData")
    fun getAll(): Flow<List<FoodNutrition>>

    // Insert new item to the HealthData table
    @Insert
    fun insertAll(vararg food: FoodNutrition)

    // Delete all data from HealthTable
    @Query("DELETE FROM HealthData")
    fun deleteAll()

    // Delete single item from table
    @Delete
    fun deleteItem(food: FoodNutrition)

    //  Get the highest value
    @Query("SELECT MAX(Calories) FROM HealthData")
    fun getHighestCal(): Flow<Int>
}