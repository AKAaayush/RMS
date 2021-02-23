package com.aayush.resturant_management_system

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    lateinit var linear: LinearLayout
    private lateinit var toolbar: Toolbar
    private lateinit var drawer: DrawerLayout
    lateinit var toggleAction: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        drawer=findViewById(R.id.drawer_layout);

        toggleAction = ActionBarDrawerToggle(this, drawer,  R.string.navigation_drawer_open, R.string.navigation_drawer_close )
        drawer.addDrawerListener(toggleAction);
        toggleAction.syncState()

        linear =findViewById(R.id.linear)
        toolbar=findViewById(R.id.toolbar)
        setSupportActionBar(toolbar);

    }


}