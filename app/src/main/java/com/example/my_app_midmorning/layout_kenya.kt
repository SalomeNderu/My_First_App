package com.example.my_app_midmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class layout_kenya : AppCompatActivity() {
    private lateinit var kenyaimg:ImageView
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var phone:EditText
    private lateinit var password:EditText
    private lateinit var regbtn:Button
    private lateinit var logbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_kenya)
        kenyaimg = findViewById(R.id.kenya_img)
        name = findViewById(R.id.edit_name)
        email = findViewById(R.id.edit_email)
        phone = findViewById(R.id.edit_phone)
        password = findViewById(R.id.edit_password)
        regbtn = findViewById(R.id.reg_btn)
        logbtn = findViewById(R.id.log_btn)

        logbtn.setOnClickListener {
            Toast.makeText(this, "Trying to login", Toast.LENGTH_SHORT).show()
        }
    }
}