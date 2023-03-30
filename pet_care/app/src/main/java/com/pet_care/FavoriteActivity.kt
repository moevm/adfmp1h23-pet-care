package com.pet_care

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

var favorites: MutableList<Array<String>> = mutableListOf(
    arrayOf(
        "Дикобраз Жора\n",
        "Возраст: 4 года\n",
        "Опека до 25.07.2023"
        ),
    arrayOf(
        "Филин Степан\n",
        "Возраст: 1 год\n",
        "Опекун: Отсутствует"
    ),
    arrayOf(
        "Фенек Граф\n",
        "Возраст: 3 года\n",
        "Опекун: Евгений Игнашев"
    )
)

class FavoriteActivity : AppCompatActivity() {
    private lateinit var tableLayout: TableLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        tableLayout = findViewById(R.id.listFav)
        for (i in favorites) {
            var tableRow = TableRow(this)
            var textView = TextView(this)
            var icon = ImageView(this)
            var but = ImageButton(this)
            icon.setImageResource(R.drawable.pet_icon_min)

            but.setImageResource(R.drawable.del_icon)
            but.backgroundTintList = this.getColorStateList(R.color.white)
            textView.textSize = 18F
            textView.lineHeight = 90
            textView.setPadding(10,10,0,10)
            textView.setTextColor(ContextCompat.getColor(this,R.color.darck_blue))
            textView.setTypeface(null, Typeface.BOLD);
            textView.text = i[0]+i[1]+i[2]
            tableRow.setPadding(0,10,0,10)
            tableRow.addView(icon)
            tableRow.addView(textView)
            tableRow.addView(but)
            tableLayout.addView(tableRow)
        }
    }

    fun clickReturn(view: View) {
        finish()
    }

//    fun goToPetProfile(view: View){
//        when(view.id){
//            R.id.go_to5->{
//                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
//                petProfileIntent.putExtra(PetProfileActivity.petId, 1)
//                startActivity(petProfileIntent)
//            }
//            R.id.go_to6->{
//                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
//                petProfileIntent.putExtra(PetProfileActivity.petId, 2)
//                startActivity(petProfileIntent)
//            }
//            R.id.go_to7->{
//                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
//                petProfileIntent.putExtra(PetProfileActivity.petId, 3)
//                startActivity(petProfileIntent)
//            }
//        }
//    }
}