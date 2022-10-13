package com.example.appui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView


class SplashScreen : AppCompatActivity() {


//    private lateinit var ivLogo: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        supportActionBar?.hide()
//
//        ivLogo = findViewById(R.id.iv_logo)
//
//        ivLogo.visibility = View.GONE
//
////        ivLogo.startAnimation(AnimationUtils.loadAnimation(this@SplashScreen,android.R.anim.fade_in))
//
//        Handler().postDelayed(
//            {
//                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
//                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
//                finish()
//            }, 1500
//        )

        startActivity(Intent(this@SplashScreen,MainActivity::class.java))
        finish()
    }
}