package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.txt_for_homework)
        val btn: MaterialButton = findViewById(R.id.btn_for_homework)
        val btnSecond: MaterialButton = findViewById(R.id.btn_for_homework_copy)
        val btnForfor: MaterialButton = findViewById(R.id.btn_forfor)
        val testData = Note("test tittle", "test note", 1)
        val APIKEY = "4db55167-7b49-430a-b02f-37fe5983c8f9"



        btnForfor.setOnClickListener {
            taskFor()
        }

        btn.setOnClickListener {
            textView.text = presenterWeather(testData.tittle, testData.note, testData.color)
        }

        btnSecond.setOnClickListener {
            textView.text = presenterWeather(Repository.newCopy.tittle, Repository.newCopy.note, Repository.newCopy.color)
        }


    }

    private fun presenterWeather(tittle: String, note: String, color: Int): String {
        return "Tittle: $tittle \n Note: $note \n Color: $color"
    }

    fun taskFor() {

        for (i in 1..10) {
            print("Forward: $i")
        }

        for (i in 10 downTo 1 step 2) {
            print("Back: $i")
        }

    }

}