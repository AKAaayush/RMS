package com.aayush.resturant_management_system

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    private lateinit var btnLogRegister : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        btnLogRegister = findViewById(R.id.btnLogRegister)
        btnLogRegister.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
    }

}
