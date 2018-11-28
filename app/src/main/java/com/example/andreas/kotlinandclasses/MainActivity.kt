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
import beans_game.Dragon
import beans_game.Lion
import beans_game.Player

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf<Shape>(Circle(5.0), Rectangle(2.5, 4.5), Square(6.0))

        list.iterator().forEach {
            Log.d("Test Shape",it.calculateArea().toString())
        }

        for(s in list)
        {
            Log.d("Test Shape",s.calculateArea().toString())
        }

        val dragon1 = Dragon("Smaug",9001,15, false)
        val lion1 = Lion("Lion",100,3, true)
        val player1 = Player("Kotlin Man",314,10, true,7,100)

        player1.attack(lion1)
        lion1.attack(player1)
        dragon1.attack(player1)
    }
}
