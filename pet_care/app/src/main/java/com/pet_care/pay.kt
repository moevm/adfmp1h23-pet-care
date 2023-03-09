package com.pet_care

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent


class pay : AppCompatActivity() {

    private lateinit var button_pay: Button
    private lateinit var summ: EditText

    companion object{
        const val price = "price"
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

//    fun clickPay(view: View) {
//        val money = summ.text.toString()
//        val lkIntent = Intent(this, LkActivity::class.java)
//        lkIntent.putExtra(LkActivity.money, money)
//        startActivity(lkIntent)
//    }
}