package com.example.a9_splash_loginandhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler = Handler()
        handler.postDelayed({

            var intent = getIntent()
            var uname = intent.getStringExtra("uname")


            var int2 = Intent(this,Home::class.java)
            int2.putExtra("uname",uname.toString())
            startActivity(int2)

            finish()


        },5000)




    }
}