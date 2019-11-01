package com.example.responsi_5170411064

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var buttonLogin: Button
    private lateinit var buttonRegist: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLogin = findViewById(R.id.button_login)
        buttonRegist = findViewById(R.id.button_register2)

        buttonLogin.setOnClickListener {

            val username = editText_username.text.toString()
            val password = editText_password.text.toString()

            //if (username.isEmpty() || password.isEmpty()){
            //    Toast.makeText(this, "Please insert username and password", Toast.LENGTH_SHORT).show()
            //}
            if (username == "RendraPrames" && password == "1234"){
                intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else {
                Toast.makeText(this, "Username atau Password anda salah", Toast.LENGTH_SHORT).show()
            }
        }

        buttonRegist.setOnClickListener {
        intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        }
    }
}