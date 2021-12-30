package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var points:Int = 0
    var number1:Int = 0
    var number2:Int = 0
    var numberRan: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textPoints).setText("$points")
        generateRandom()


    }

    fun generateRandom(){
        var op:Int = (0..1).random()
        var numberFal:Int = 0
        numberRan = 0
        do{
            numberRan = (1..20).random()
            numberFal = (1..20).random()
        }while(numberRan == numberFal)

        when(op){
            0 -> {
                number2 = numberRan
                number1 = numberFal
            }
            1 -> {
                number1 = numberRan
                number2 = numberFal
            }
        }
        println(numberRan)
        findViewById<Button>(R.id.buttonNumber2).setText("$number2")
        findViewById<Button>(R.id.buttonNumber1).setText("$number1")
    }

    fun onClick2(view: View) {
        var n2:Int = findViewById<Button>(R.id.buttonNumber2).text.toString().toInt()
        if(n2 == numberRan){
            points += 1
        }
        else{
            points -= 1
        }
        findViewById<TextView>(R.id.textPoints).setText("$points")
        generateRandom()

    }
    fun onClick1(view: View) {
        var n1:Int = findViewById<Button>(R.id.buttonNumber1).text.toString().toInt()
        if(n1 == numberRan){
            points += 1
        }
        else{
            points -= 1
        }
        findViewById<TextView>(R.id.textPoints).setText("$points")
        generateRandom()


    }


}