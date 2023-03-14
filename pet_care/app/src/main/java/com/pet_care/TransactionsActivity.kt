package com.pet_care

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.webkit.WebSettings.TextSize
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


var transactions: MutableList<String> = mutableListOf(
    "Опека над дикобразом Жорой от 25.01.2023 на сумму 18000 руб.",
    "Донат филину Степану от 12.01.2023 на сумму 1000 руб.",
    "Донат фенеку Графу от 12.01.2023 на сумму 2000 руб."
)

class TransactionsActivity : AppCompatActivity() {
    private lateinit var tableLayout: TableLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transactions)

        tableLayout = findViewById(R.id.listTrans)
        for (i in transactions) {
            var tableRow = TableRow(this)
            var textView = TextView(this)
            textView.width = 1250
            textView.height = 200
            textView.textSize = 20F
            textView.setTextColor(ContextCompat.getColor(this,R.color.darck_blue))
            textView.setTypeface(null, Typeface.BOLD);
            textView.text = i
            tableRow.addView(textView)
            tableLayout.addView(tableRow)
        }
    }

    fun clickReturn(view: View){
        finish()
    }
}