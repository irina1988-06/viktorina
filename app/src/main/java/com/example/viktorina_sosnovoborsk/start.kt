package com.example.viktorina_sosnovoborsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


    }

    fun testt(view: android.view.View) {

        startActivity(Intent(this, test()::class.java))


    }
}