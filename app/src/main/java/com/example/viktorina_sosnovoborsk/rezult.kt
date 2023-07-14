package com.example.viktorina_sosnovoborsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class rezult : AppCompatActivity() {


    // переменная для текста

    lateinit var rezultat:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rezult)
        // иниц-ем переменную
        rezultat=findViewById(R.id.y)
// переменная для получения данных
         var intent:Intent= getIntent()
        // объявляем переменную типа стринг
        var dannie :String

        // помещаем в нее данные из другого активити

        dannie= intent.getStringExtra("key").toString()
        rezultat.setText(dannie)



    }
}