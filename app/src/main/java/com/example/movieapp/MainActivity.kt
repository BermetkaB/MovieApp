package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //http://www.omdbapi.com/apikey.aspx?VERIFYKEY=e282e642-7d0b-4375-8c52-1429506a5399
    }
}