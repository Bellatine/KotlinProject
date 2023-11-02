package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start()
    }

    private fun start(){
        val handle: Handle = Handle()
        val textView: TextView = findViewById(R.id.result)
        val CE: Button = findViewById(R.id.CE)
        CE.setOnClickListener {
            handle.onClickCE()
            textView.text = handle.getTextView()
        }
        val C: Button = findViewById(R.id.C)
        C.setOnClickListener {
            handle.onClickC()
            textView.text = handle.getTextView()
        }
        val BS: Button = findViewById(R.id.BS)
        val div: Button = findViewById(R.id.div)
        div.setOnClickListener {
            handle.onClickSign("/")
            textView.text = handle.getTextView()
        }
        val seven: Button = findViewById(R.id.seven)
        seven.setOnClickListener {
            handle.loadDigits("7")
            textView.text = handle.getTextView()
        }
        val eight: Button = findViewById(R.id.eight)
        eight.setOnClickListener {
            handle.loadDigits("8")
            textView.text = handle.getTextView()
        }
        val nine: Button = findViewById(R.id.nine)
        nine.setOnClickListener {
            handle.loadDigits("9")
            textView.text = handle.getTextView()
        }
        val mul: Button = findViewById(R.id.mul)
        mul.setOnClickListener {
            handle.onClickSign("x")
            textView.text = handle.getTextView()
        }
        val four: Button = findViewById(R.id.four)
        four.setOnClickListener {
            handle.loadDigits("4")
            textView.text = handle.getTextView()
        }
        val five: Button = findViewById(R.id.five)
        five.setOnClickListener {
            handle.loadDigits("5")
            textView.text = handle.getTextView()
        }
        val six: Button = findViewById(R.id.six)
        six.setOnClickListener {
            handle.loadDigits("6")
            textView.text = handle.getTextView()
        }
        val sub: Button = findViewById(R.id.sub)
        sub.setOnClickListener {
            handle.onClickSign("-")
            textView.text = handle.getTextView()
        }
        val one: Button = findViewById(R.id.one)
        one.setOnClickListener {
            handle.loadDigits("1")
            textView.text = handle.getTextView()
        }
        val two: Button = findViewById(R.id.two)
        two.setOnClickListener {
            handle.loadDigits("2")
            textView.text = handle.getTextView()
        }
        val three: Button = findViewById(R.id.three)
        three.setOnClickListener {
            handle.loadDigits("3")
            textView.text = handle.getTextView()
        }
        val add: Button = findViewById(R.id.add)
        add.setOnClickListener {
            handle.onClickSign("+")
            textView.text = handle.getTextView()
        }
        val add_or_sub: Button = findViewById(R.id.add_or_sub)
        val zero: Button = findViewById(R.id.zero)
        zero.setOnClickListener {
            handle.loadDigits("0")
            textView.text = handle.getTextView()
        }
        val dot: Button = findViewById(R.id.cham)
        dot.setOnClickListener {
            handle.loadDigits(".")
            textView.text = handle.getTextView()

        }
        val equal: Button = findViewById(R.id.equal)
        equal.setOnClickListener {
            handle.onClickEqual()
            textView.text = handle.getTextView()
        }


    }
}