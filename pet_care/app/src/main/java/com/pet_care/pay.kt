package com.pet_care

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.view.View
import java.text.SimpleDateFormat
import java.util.*


class pay : AppCompatActivity() {

    private lateinit var button_pay: Button
    private lateinit var summ: EditText

    companion object{
        const val price = "price"
        const val name = "name"
        const val type = "type"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        button_pay = findViewById(R.id.button_pay)
        summ = findViewById(R.id.summ)

        val price: String = intent.getStringExtra(price)?: "null"
        if(price != "null"){
            summ.setText(price)
            summ.isFocusable = false
        }
    }

    fun clickPay(view: View) {
        val money = summ.text.toString()
        val name: String = intent.getStringExtra(name)?: "null"
        val type: String = intent.getStringExtra(type)?: "null"
        val sdf = SimpleDateFormat("dd.MM.yyyy")
        val curDate = sdf.format(Date())
        transactions.add(0,"$type $name от $curDate на сумму $money руб.")
        finish()
    }
}