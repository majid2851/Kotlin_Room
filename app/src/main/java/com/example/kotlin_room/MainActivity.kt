package com.example.kotlin_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel().addUser(User(0,"majid","bagher",27))
        viewModel().addUser(User(0,"ali","2851",27))
        viewModel().addUser(User(0,"sami","2231",27))

        viewModel().getAllData().observe(this, Observer {
            Log.i("mag2851",viewModel().getAllData().value?.size.toString()  )
        })


               


    }

    private fun viewModel():UserViewModel{
        return ViewModelProvider(this).get(UserViewModel::class.java)
    }
}