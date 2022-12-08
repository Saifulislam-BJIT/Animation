package com.saiful.animation

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var rotation: Button
    private lateinit var rotationXml: Button

    private lateinit var ball1: ImageView
    private lateinit var ball2: ImageView
    private lateinit var ball3: ImageView
    private lateinit var ball4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rotation = findViewById(R.id.rotation)
        rotationXml = findViewById(R.id.rotation_xml)

        ball1 = findViewById(R.id.ball_1)
        ball2 = findViewById(R.id.ball_2)
        ball3 = findViewById(R.id.ball_3)
        ball4 = findViewById(R.id.ball_4)

        rotation.setOnClickListener {
            val animationBall1 = ObjectAnimator.ofFloat(ball1, View.ROTATION, 0f, 360f)
            animationBall1.duration = 1000
            animationBall1.start()

            val animationBall2 = ObjectAnimator.ofFloat(ball2, View.ROTATION, 0f, 360f)
            animationBall2.duration = 1300
            animationBall2.start()

            val animationBall3 = ObjectAnimator.ofFloat(ball3, View.ROTATION, 0f, 360f)
            animationBall3.duration = 1700
            animationBall3.start()

            val animationBall4 = ObjectAnimator.ofFloat(ball4, View.ROTATION, 0f, 360f)
            animationBall4.duration = 2000
            animationBall4.start()
        }

        rotationXml.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotation)
            animation.duration = 1000
            ball1.startAnimation(animation)

            val animation2 = AnimationUtils.loadAnimation(this, R.anim.rotation)
            animation2.duration = 1300
            ball2.startAnimation(animation2)

            val animation3 = AnimationUtils.loadAnimation(this, R.anim.rotation)
            animation3.duration = 1700
            ball3.startAnimation(animation3)

            val animation4 = AnimationUtils.loadAnimation(this, R.anim.rotation)
            animation4.duration = 2000
            ball4.startAnimation(animation4)

        }
//        buttonOne = findViewById(R.id.button_one)
//        buttonTwo = findViewById(R.id.button_two)
//        imageView = findViewById(R.id.imageView)
//        textView = findViewById(R.id.textView)
//
//        buttonOne.setOnClickListener {
//            Toast.makeText(this,"Click button one", Toast.LENGTH_SHORT).show()
//            val animation = ObjectAnimator.ofFloat(imageView, View.ROTATION, 0f,360f)
//            animation.repeatCount = 1
//            animation.duration = 1000
//            animation.repeatMode = ObjectAnimator.RESTART
//            animation.start()
//        }
//
//        buttonTwo.setOnClickListener {
//            val animation = AnimationUtils.loadAnimation(this, R.anim.rotation)
//            textView.startAnimation(animation)
//        }
    }

//    private fun rotaionBall() {
//        val animationBall1 = ObjectAnimator.ofFloat(ball1, View.ROTATION, 0f, 360f)
//        animationBall1.duration = 1000
//        animationBall1.start()
//    }
}