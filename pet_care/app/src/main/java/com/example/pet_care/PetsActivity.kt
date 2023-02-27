package com.example.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pets)
    }

    fun movePage(view: View) {
        val lkIntent = Intent(this, LkActivity::class.java)
        startActivity(lkIntent)
    }
}