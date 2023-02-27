package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edtNumber1:EditText
    lateinit var edtNumber2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtNumber1 = findViewById(R.id.edit_1)
        edtNumber2 = findViewById(R.id.edit_2)
    }
}

fun buttonClick(v:View){
    var ans = 0.0
    val calculator = Calculator(
        edtNumber1.text.toString().toDouble(),
        edtNumber2.text.toString().toDouble())
    when(v.id){
        R.id.btnPlus -> ans = calculator.add()
        R.id.btnMinus -> ans = calculator.subtract()
        R.id.btnMultiply -> ans = calculator.multiply()
        R.id.btnDivide -> ans = calculator.divide()
    }
    println(ans)//this will print the output on the terminal
}