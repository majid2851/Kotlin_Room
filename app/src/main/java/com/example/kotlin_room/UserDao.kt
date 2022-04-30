package com.example.kotlin_room

import androidx.annotation.RequiresPermission
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao
{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user:User)

    @Query("Select * from ${constance.tableName}")
     fun readAllData():LiveData<List<User>>







}