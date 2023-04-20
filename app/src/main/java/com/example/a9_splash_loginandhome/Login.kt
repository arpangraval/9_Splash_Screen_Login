package com.example.a9_splash_loginandhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBTN.setOnClickListener {
            if(usernameET.text.toString() != "" && passwordET.text.toString()!="")
            {
                if(usernameET.text.toString() == "test" && passwordET.text.toString() =="test123")
                {
                    var intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("uname",usernameET.text.toString())
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this,"Enter Valid Credentials",Toast.LENGTH_LONG).show()
                    usernameET.setText("")
                    passwordET.setText("")
                    usernameET.requestFocus()
                }
            }
            else
            {
                Toast.makeText(this,"Enter all Credentials",Toast.LENGTH_LONG).show()
            }


        }

    }
}