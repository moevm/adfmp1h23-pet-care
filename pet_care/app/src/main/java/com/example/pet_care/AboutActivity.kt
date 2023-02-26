package com.example.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {

    private lateinit var return_entry: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        return_entry = findViewById(R.id.return_entry)
    }

    fun clickReturn(view: View) {
        val entryIntent = Intent(this, MainActivity::class.java)
        startActivity(entryIntent)
    }
}

