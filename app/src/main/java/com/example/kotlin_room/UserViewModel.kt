package com.example.kotlin_room

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application)
{
    private val allData:LiveData<List<User>>
    private val repository: UserRepository
    init {
        val userDao=UserDatabase.getDatabase(application).userDao()
        repository= UserRepository(userDao)
        allData=repository.readAllData
    }

    fun addUser(user:User) {
        viewModelScope.launch(IO){
            repository.addUser(user)
        }
    }
    fun delteUser(user:User) {
        viewModelScope.launch(IO){
            repository.deleteUser(user)
        }
    }
    fun updateUser(user:User) {
        viewModelScope.launch(IO){
            repository.updateUser(user)
        }
    }
    fun getAllData():LiveData<List<User>>{
        return allData
    }





}