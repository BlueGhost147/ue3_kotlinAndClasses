package com.example.andreas.kotlinandclasses

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.util.Log
import beans.Circle
import beans.Rectangle
import beans.Shape
import beans.Square

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(Circle(5.0), Rectangle(2.5, 4.5), Square(6.0), Shape())

        list.iterator().forEach {
            Log.d("Test Shape",it.calculateArea().toString())
        }

        for(s in list)
        {
            Log.d("Test Shape",s.calculateArea().toString())
        }
    }
}
