package com.yhproject.jetpackpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yhproject.jetpackpractice.practices.LazyStaggeredGrid
import com.yhproject.jetpackpractice.ui.theme.JetpackPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackPracticeTheme {
                LazyStaggeredGrid()
            }

        }
    }
}

