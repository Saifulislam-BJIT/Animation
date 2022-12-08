package com.saiful.animation

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var rotation: Button
    private lateinit var rotationXml: Button
    private lateinit var translate: Button
    private lateinit var translateXml: Button
    private lateinit var scaler: Button

    private lateinit var ball1: ImageView
    private lateinit var ball2: ImageView
    private lateinit var ball3: ImageView
    private lateinit var ball4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rotation = findViewById(R.id.rotation)
        rotationXml = findViewById(R.id.rotation_xml)
        translate = findViewById(R.id.translate)
        translateXml = findViewById(R.id.translate_xml)
        scaler = findViewById(R.id.scaler)


        ball1 = findViewById(R.id.ball_1)
        ball2 = findViewById(R.id.ball_2)
        ball3 = findViewById(R.id.ball_3)
        ball4 = findViewById(R.id.ball_4)

//        rotation by object animatior
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

//        rotation by xml
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

//        translate by object animator
        translate.setOnClickListener {
            val animator = ObjectAnimator.ofFloat(ball1, View.TRANSLATION_Y, 0f, -400f)
            animator.repeatCount = 3
            animator.duration = 1000
            animator.repeatMode = ObjectAnimator.REVERSE
            animator.start()

            val animator2 = ObjectAnimator.ofFloat(ball2, View.TRANSLATION_Y, 0f, -400f)
            animator2.repeatCount = 3
            animator2.duration = 1300
            animator2.repeatMode = ObjectAnimator.REVERSE
            animator2.start()

            val animator3 = ObjectAnimator.ofFloat(ball3, View.TRANSLATION_Y, 0f, -400f)
            animator3.repeatCount = 3
            animator3.duration = 1700
            animator3.repeatMode = ObjectAnimator.REVERSE
            animator3.start()

            val animator4 = ObjectAnimator.ofFloat(ball4, View.TRANSLATION_Y, 0f, -400f)
            animator4.repeatCount = 3
            animator4.duration = 2000
            animator4.repeatMode = ObjectAnimator.REVERSE
            animator4.start()
        }

//        translate by xml
        translateXml.setOnClickListener {
            val animator = AnimationUtils.loadAnimation(this, R.anim.translation)
            animator.duration = 1000
            ball1.startAnimation(animator)

            val animator2 = AnimationUtils.loadAnimation(this, R.anim.translation)
            animator2.duration = 1300
            ball2.startAnimation(animator2)

            val animator3 = AnimationUtils.loadAnimation(this, R.anim.translation)
            animator3.duration = 1700
            ball3.startAnimation(animator3)

            val animator4 = AnimationUtils.loadAnimation(this, R.anim.translation)
            animator4.duration = 2000
            ball4.startAnimation(animator4)
        }

//        scale by object animator
        scaler.setOnClickListener {
            val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 2f)
            val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 2f)

            val animator = ObjectAnimator.ofPropertyValuesHolder(ball1, scaleX, scaleY)
            animator.repeatCount = 3
            animator.repeatMode = ObjectAnimator.REVERSE
            animator.start()

            val scaleX2 = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.5f)
            val scaleY2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.5f)
            val animator2 = ObjectAnimator.ofPropertyValuesHolder(ball2, scaleX2, scaleY2)
            animator2.repeatCount = 3
            animator2.repeatMode = ObjectAnimator.REVERSE
            animator2.start()

            val scaleX3 = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.5f)
            val scaleY3 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.5f)
            val animator3 = ObjectAnimator.ofPropertyValuesHolder(ball3, scaleX3, scaleY3)
            animator3.repeatCount = 3
            animator3.repeatMode = ObjectAnimator.REVERSE
            animator3.start()

            val scaleX4 = PropertyValuesHolder.ofFloat(View.SCALE_X, 2f)
            val scaleY4 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 2f)
            val animator4 = ObjectAnimator.ofPropertyValuesHolder(ball4, scaleX4, scaleY4)
            animator4.repeatCount = 3
            animator4.repeatMode = ObjectAnimator.REVERSE
            animator4.start()
        }
    }
}