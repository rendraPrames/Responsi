package com.example.responsi_5170411064

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class AccountActivity : AppCompatActivity() {

    private lateinit var Username: TextView
    private lateinit var Email: TextView
    private lateinit var Password: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)


        val bundle = intent.extras
        if (bundle != null){
            Username.setText("Username    : " + bundle.getString("dataUser"))
            Email.setText("E - Mail : " + bundle.getString("dataEmail"))
            Password.setText("Password   : " + bundle.getString("dataPass"))
        }
    }
}
