package com.example.kotlin_room

import android.provider.SyncStateContract
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = constance.tableName)
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val firstName:String,
    val lastName:String,
    val age:Int
)

