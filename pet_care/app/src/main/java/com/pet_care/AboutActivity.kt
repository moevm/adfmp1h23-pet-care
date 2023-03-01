package com.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import com.pet_care.MainActivity
import com.pet_care.R

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

