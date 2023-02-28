package com.example.pet_care

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TransactionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transactions)
    }

    fun clickReturn(view: View){
        finish()
    }
}