package com.namng.testflappybird

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var y: Float = 500f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            onTouchButton()
        }
        onDefault()

    }

    fun onDefault(){
        val imageVIew = findViewById<ImageView>(R.id.imageView)
        val animator = ObjectAnimator.ofFloat(imageVIew,"translationY",y,1000f)
        animator.duration = 100
        animator.interpolator = AccelerateInterpolator()
        animator.start()
    }

    fun onTouchButton(){
        val imageVIew = findViewById<ImageView>(R.id.imageView)
        val animator = ObjectAnimator.ofFloat(imageVIew,"translationY",y,-100f)
        animator.duration = 100
        animator.interpolator = AccelerateInterpolator()
        animator.start()
    }
}