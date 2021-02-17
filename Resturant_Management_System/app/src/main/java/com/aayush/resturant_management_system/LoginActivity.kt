package com.aayush.resturant_management_system

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LoginActivity : AppCompatActivity() {
    private  lateinit var  btnRegLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnRegLogin = findViewById(R.id.btnRegLogin)
        btnRegLogin.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
    }
}