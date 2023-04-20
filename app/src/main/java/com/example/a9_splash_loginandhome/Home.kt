package com.example.a9_splash_loginandhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var intent = getIntent()
        var uname = intent.getStringExtra("uname")
        userET.text = uname.toString()
    }
}