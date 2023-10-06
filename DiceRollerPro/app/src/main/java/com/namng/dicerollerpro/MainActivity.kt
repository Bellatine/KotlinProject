/*
    Author: Nam.ng205103
 */
package com.namng.dicerollerpro

import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
         button.setOnClickListener {
             val diceValue1 = rollDice(findViewById(R.id.imageView))
             val diceValue2 = rollDice(findViewById(R.id.imageView2))
             val diceValue3 = rollDice(findViewById(R.id.imageView3))
             val textView: TextView = findViewById(R.id.textView)
             if (diceValue1 == diceValue2 && diceValue1 == diceValue3) {
                 textView.text = "Congratulation Lucky Boy !!"
                 textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28F)
             }else if (diceValue1 == diceValue2 || diceValue2 == diceValue3 || diceValue3 == diceValue1){
                 textView.text = "Not Bad ;))"
             }else{
                 textView.text = "Good luck for you in next roll !"
                 textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28F)
             }
         }
    }

    private fun rollDice(diceImage: ImageView): Int {
        val dice = RandNum(6)
        val diceValue = dice.roll()
        when (diceValue){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        return diceValue
    }

    class RandNum(val numSides: Int){
        fun roll(): Int{
            return (1..numSides).random()
        }
    }
}