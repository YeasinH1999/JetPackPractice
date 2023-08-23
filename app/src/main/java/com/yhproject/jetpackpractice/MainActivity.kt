package com.yhproject.jetpackpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yhproject.jetpackpractice.models.MainViewModel
import com.yhproject.jetpackpractice.practices.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(mainViewModel = MainViewModel())
        }
    }
}

