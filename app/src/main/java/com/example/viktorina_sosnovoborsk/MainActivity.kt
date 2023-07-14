package com.example.viktorina_sosnovoborsk

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
// На уровне класса объявляем переменную типа VideoView
    lateinit var videoView : VideoView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализируем данную переменную
        videoView = findViewById(R.id.videoView3)

        // Указаваем путь к видео
        videoView.setVideoURI(Uri.parse("android.resource://" +
                getPackageName() +"/"+R.raw.snk))


        /*   можно было сделать так:
        String videoSource ="android.resource://ru.alexanderklimov.views/"+ R.raw.snk;
         videoView.setVideoURI(Uri.parse(videoSource));*/

        /* и еще проще :
        * val uri = videoSource.toUri()*/



        //Метод videoView.setMediaController(new MediaController(this));
        // позволяет вывести кнопки паузы и воспроизведения.
        // Кнопки появляются,если коснуться экрана. Можете не использовать
        // данную возможность или отключать программно, используя  значение null.
        videoView.setMediaController( MediaController(this))

       //Метод requestFocus() необходим, чтобы компонент получил
       // фокус и реагировал на касания пальцев.
        videoView.requestFocus(0)

        // Метод start() позволяет сразу начать воспроизведение файла.
        videoView.start();

    }

    fun start(view: android.view.View) {

        startActivity(Intent(this, start()::class.java))


    }
}