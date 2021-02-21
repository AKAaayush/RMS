package com.aayush.resturant_management_system.RMS.`object`

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aayush.resturant_management_system.R


class LoginActivity : AppCompatActivity() {
private lateinit var  btnsignup : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnsignup = findViewById(R.id.btn_signup)
        
//open signup activity
        btnsignup.setOnClickListener(){
            startActivity(Intent(this, RegisterActivity::class.java))
        }



    }
}