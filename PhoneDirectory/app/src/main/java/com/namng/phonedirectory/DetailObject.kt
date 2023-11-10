package com.namng.phonedirectory

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailObject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_object)
        val icon = findViewById<ImageView>(R.id.detail_icon)
        val name = findViewById<TextView>(R.id.detail_name)
        val phoneNumber = findViewById<TextView>(R.id.phone_number)
        val email = findViewById<TextView>(R.id.email)

        try{
            val imageThumb = intent.getIntExtra("image_thumb",resources.getIdentifier("alphabet", "drawable", packageName))
            val object_name = intent.getStringExtra("name")
            val object_mail = intent.getStringExtra("email")
            val object_phone = intent.getStringExtra("phone_num")
            val object_id = intent.getIntExtra("ID",0)

            Log.v("TAG", "name: $object_name, mail: $object_mail, phone: $object_phone, id: $object_id")

            icon.setImageResource(imageThumb)

            name.setText(object_name)
            phoneNumber.setText(object_phone)
            email.setText(object_mail)
            setResult(Activity.RESULT_OK, intent)
        } catch (ex: Exception) {
            setResult(Activity.RESULT_CANCELED)
        }
    }
}