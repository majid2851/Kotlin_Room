package com.example.kotlin_room

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao)
{

    val readAllData : LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun deleteUser(user: User){
        userDao.delete(user)
    }

    suspend fun updateUser(user: User){
        userDao.update(user)
    }



}