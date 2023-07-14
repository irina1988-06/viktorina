package com.example.viktorina_sosnovoborsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox

class test : AppCompatActivity() {
    var ball :Int = 0
// объявляем числовую переменную, чтобы в нее положить значение переменной балл

    lateinit var text_ball : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

          // Объявляем переменные

        val Vp_1_a: CheckBox = findViewById(R.id.vp_1_a)
        val Vp_1_b: CheckBox = findViewById(R.id.vp_1_b)
        val Vp_1_c: CheckBox = findViewById(R.id.vp_1_c)
        val Vp_1_d: CheckBox = findViewById(R.id.vp_1_d)



// Лямбда-выражения представляют небольшие кусочки кода,
// которые выполняют некоторые действия. Фактически лямбды
// преставляют сокращенную запись функций.
        //Лямбда-выражения оборачиваются в фигурные скобки
        //Лямбды как и функции могут принимать параметры.
        // Для передачи параметров используется стрелка ->.
        // Параметры указываются слева от стрелки, а тело лямбда-выражения,
        // то есть сами выполняемые действия, справа от стрелки.



//Флажок является составной кнопкой в том смысле, что он имеет два состояния.
// Также он является производным от android.widget.Класс CompoundButton.
// CompoundButton - это абстрактный класс, определенный в пакете android.widget,
// который действует как определение интерфейса для обратного вызова,
// который вызывается при изменении проверенного состояния его дочернего элемента.
// CompoundButton сам по себе является кнопкой, поэтому сам флажок унаследует
// возможности для кнопок.



        // Рефлизуем функции проверки активна или нет
        Vp_1_a.setOnCheckedChangeListener{ compoundButton, b ->
            //обратный вызов, который
            // уведомляет о включении / выключении кнопки
            if (b){
                 // для каждого ответа своя числовая переменная в конце сложить в одну и отправить
                Vp_1_b.isChecked=false
                Vp_1_c.isChecked=false
                Vp_1_d.isChecked=false
            }
        }

            Vp_1_b.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    Vp_1_a.isChecked=false
                    Vp_1_c.isChecked=false
                    Vp_1_d.isChecked=false
                }

                }
        Vp_1_c.setOnCheckedChangeListener{ compoundButton, b ->
            if (b){
                Vp_1_a.isChecked=false
                Vp_1_b.isChecked=false
                Vp_1_d.isChecked=false
            }
        }

        Vp_1_d.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                Vp_1_a.isChecked=false
                Vp_1_b.isChecked=false
                Vp_1_c.isChecked=false
            }

        }







    }

    fun rezult(view: android.view.View) {
      // присваеваем значение переменной занячение балла
        text_ball= ball!!.toString()
         // объявляем переменную с намерением для перехода на другой активити

        var intent= Intent(Intent(this, rezult()::class.java))

        // передаем данные
        intent.putExtra("key",text_ball)

        // запускаем намерение

        startActivity(intent)





    }


}
