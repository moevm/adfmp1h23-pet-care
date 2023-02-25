package com.example.pet_care

import android.app.ProgressDialog.show
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email_input = findViewById(R.id.email_input)
        password_input = findViewById(R.id.password_input)
    }
    fun clickEntry(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val email = email_input.text.toString()
        val password = password_input.text.toString()
        if (email == "fenya2011@mail.ru" && password == "good1402") {
            val entryToast = Toast.makeText(this, "Успех", Toast.LENGTH_SHORT)
            entryToast.show()
        } else {
            val entryToast = Toast.makeText(this, "Нет такого пользователя", Toast.LENGTH_SHORT)
            entryToast.show()
        }

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