package com.example.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.pet_care.LkActivity.Companion.name
import com.example.pet_care.LkActivity.Companion.sername

class pay : AppCompatActivity() {

    private lateinit var button_pay: Button
    private lateinit var summ: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        button_pay = findViewById(R.id.button_pay)
        summ = findViewById(R.id.summ)
    }

//    fun clickPay(view: View) {
//        val money = summ.text.toString()
//        val lkIntent = Intent(this, LkActivity::class.java)
//        lkIntent.putExtra(LkActivity.money, money)
//        startActivity(lkIntent)
//    }
}