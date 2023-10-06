package com.namng.dicerollerv2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView3)
            textView.text = "NamNG"

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }

        val diceButton: ImageButton = findViewById(R.id.imageButton2)
        diceButton.setOnClickListener {
            val dice = Dice(6)
            val diceRoll = dice.roll()
            val result:TextView = findViewById(R.id.textView2)
            result.text = diceRoll.toString()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSide: Int) {
    fun roll():Int {
        return (1..numSide).random()
    }
}