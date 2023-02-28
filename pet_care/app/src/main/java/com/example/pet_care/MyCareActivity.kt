package com.example.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MyCareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_care)
    }

    fun clickReturn(view: View) {
        onBackPressed()
    }

    fun movePage(view: View) {
        val petsIntent = Intent(this, PetsActivity::class.java)
        startActivity(petsIntent)
    }
}