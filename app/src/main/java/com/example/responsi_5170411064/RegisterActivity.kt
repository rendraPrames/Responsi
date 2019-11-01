package com.example.responsi_5170411064

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    private lateinit var buttonRegist: Button
    private lateinit var Username: EditText
    private lateinit var Email: EditText
    private lateinit var Password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        buttonRegist = findViewById(R.id.button_register2)
        Username = findViewById(R.id.editText_username)
        Email = findViewById(R.id.editText_email)
        Password = findViewById(R.id.editText_password)

        buttonRegist.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("dataNim", Username.text.toString())
            bundle.putString("dataNama", Email.text.toString())
            bundle.putString("dataNilai", Password.text.toString())

            intent = Intent(this, AccountActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
