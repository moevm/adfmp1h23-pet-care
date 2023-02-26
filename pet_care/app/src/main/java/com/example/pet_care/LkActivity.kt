package com.example.pet_care

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class LkActivity : AppCompatActivity() {

    private lateinit var nameField: TextView
    private lateinit var count_donation: TextView

    companion object {
        const val name = "name"
        const val sername = "sername"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lk)

        nameField = findViewById(R.id.nameField)
        count_donation = findViewById(R.id.count_donation)
        showName()
    }

    fun showName() {
        val name = intent.getStringExtra(name)
        val sername = intent.getStringExtra(sername)
        nameField.setText(name + " " + sername)
        count_donation.setText("0 руб.")
    }
}