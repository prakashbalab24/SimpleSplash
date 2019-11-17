package com.singledev.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animateLogo()
    }

    private fun animateLogo() {
        val animation = AnimationUtils.loadAnimation(this, R.anim.splashanim)
        iv_logo.startAnimation(animation)
    }
}
