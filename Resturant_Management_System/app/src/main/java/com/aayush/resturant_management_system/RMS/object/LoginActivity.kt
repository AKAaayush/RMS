package com.aayush.resturant_management_system.RMS.`object`

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.aayush.resturant_management_system.R


class LoginActivity : AppCompatActivity() {
    private lateinit var login_email : EditText
    private  lateinit var login_password : EditText
    private  lateinit var btn_login : Button
    private lateinit var  btnsignup : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnsignup = findViewById(R.id.btn_signup)
        login_email = findViewById(R.id.login_email)
        login_password = findViewById(R.id.login_password)
        btn_login = findViewById(R.id.btn_login)

        
//open signup activity
        btnsignup.setOnClickListener(){
            startActivity(Intent(this, RegisterActivity::class.java))
        }



    }
}