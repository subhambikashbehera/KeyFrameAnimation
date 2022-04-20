package com.subhambikash.keyframeanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationDrawable=AnimationDrawable()
        val frame1=AppCompatResources.getDrawable(this,R.drawable.pic1)
        val frame2=AppCompatResources.getDrawable(this,R.drawable.pic2)
        val frame3=AppCompatResources.getDrawable(this,R.drawable.pic3)
        animationDrawable.addFrame(frame1!!,200)
        animationDrawable.addFrame(frame2!!,300)
        animationDrawable.addFrame(frame3!!,200)

        imageView.background=animationDrawable

        button.setOnClickListener {
            animationDrawable.stop()
        }
        button2.setOnClickListener {
            animationDrawable.start()
        }

    }
}