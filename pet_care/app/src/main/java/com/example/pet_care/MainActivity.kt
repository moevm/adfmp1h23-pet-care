package com.example.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var email_input: EditText
    private lateinit var password_input: EditText
    private lateinit var about_button: TextView
    private lateinit var signup_button: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email_input = findViewById(R.id.email_input)
        password_input = findViewById(R.id.password_input)
        about_button = findViewById(R.id.about)
        signup_button = findViewById(R.id.signin_button)
    }
    fun clickEntry(view: View) {
        val email = email_input.text.toString()
        val password = password_input.text.toString()
        if (email == "fenya@mail.ru" && password == "good") {
            val name = "Варя"
            val sername = "Иванова"
            val lkIntent = Intent(this, LkActivity::class.java)
            lkIntent.putExtra(LkActivity.name, name)
            lkIntent.putExtra(LkActivity.sername, sername)
            startActivity(lkIntent)
        } else {
            val entryToast = Toast.makeText(this, "Нет такого пользователя", Toast.LENGTH_SHORT)
            entryToast.show()
        }
    }

    fun clickAbout(view: View) {
        val aboutIntent = Intent(this, AboutActivity::class.java)
        startActivity(aboutIntent)
    }

    fun clickSignup(view: View) {
        val upIntent = Intent(this, SignUp::class.java)
        startActivity(upIntent)
    }
//    fun randomMe (view: View) {
//// Create an Intent to start the second activity
//        val randomIntent = Intent(this, SecondActivity::class.java)
//// Get the current value of the text view.
//        val countString = textView.text.toString()
////Convert the count to an int
//        val count = Integer.parseInt(countString)
//// Add the count to the extras for the Intent.
//        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
//// Start the new activity.
//        startActivity(randomIntent)
//    }
}