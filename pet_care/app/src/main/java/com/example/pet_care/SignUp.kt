package com.example.pet_care

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.FileNotFoundException
import java.io.InputStream


class SignUp : AppCompatActivity() {

    private lateinit var signin_button: TextView
    private lateinit var email_input: EditText
    private lateinit var password_input: EditText
    private lateinit var name_input: EditText
    private lateinit var sername_input: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signin_button = findViewById(R.id.signin_button)
        email_input = findViewById(R.id.email_input)
        password_input = findViewById(R.id.password_input)
        name_input = findViewById(R.id.name_input)
        sername_input = findViewById(R.id.sername_input)

    }

    fun clickSignin(view: View) {
        val inIntent = Intent(this, MainActivity::class.java)
        startActivity(inIntent)
    }

    fun clickEntry(view: View) {
        val name = name_input.text.toString()
        val sername = sername_input.text.toString()
        val lkIntent = Intent(this, LkActivity::class.java)
        lkIntent.putExtra(LkActivity.name, name)
        lkIntent.putExtra(LkActivity.sername, sername)
        startActivity(lkIntent)
    }

    fun clickAbout(view: View) {
        val aboutIntent = Intent(this, AboutActivity::class.java)
        startActivity(aboutIntent)
    }
}