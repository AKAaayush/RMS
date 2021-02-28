package com.aayush.resturant_management_system.RMS.`object`

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.aayush.resturant_management_system.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    //animation Variables
    private  lateinit var  topAnim : Animation
    private  lateinit var  bottomAnim : Animation

    private lateinit var  image : ImageView
    private  lateinit var  logo : TextView
    private lateinit var  slogan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        CoroutineScope(Dispatchers.Main).launch {
            delay(2500)
            startActivity(
                Intent(
                    this@SplashActivity,
                    SliderActivity::class.java
                )
            )
            finish()
        }

        //splash
        topAnim =AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim =AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        image = findViewById(R.id.imageView2)
        logo = findViewById(R.id.textView)
        slogan = findViewById(R.id.textView3)
        //animation
        image.animation = topAnim
        logo.animation = bottomAnim
        slogan.animation = bottomAnim
    }
}