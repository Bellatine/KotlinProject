package com.namng.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items: Array<String> = arrayOf("one","two","three","four","five","six","seven")
        val adapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
    }
}