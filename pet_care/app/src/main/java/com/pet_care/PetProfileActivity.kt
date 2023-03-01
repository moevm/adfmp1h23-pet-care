package com.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PetProfileActivity : AppCompatActivity() {
    private lateinit var pet_name: TextView
    private lateinit var about_pet: TextView
    private lateinit var more_info: TextView
    private lateinit var about_care: TextView
    private lateinit var pay_care: Button
    private lateinit var pet_photo: ImageView

    private var pets: Array<Array<String>> = arrayOf(
        arrayOf(
            "Енот-полоскун Феня",
            "Возраст: 5 лет.\nЛюбит лакомиться бананами, морковкой, малиной. Из мясного предпочитает индейку. Иногда любит полакомиться рыбой.",
            "Вы можете устроить Фене праздник, отправив донат на любую сумму или оформив опеку на пол года.",
            "При покупке подписки Вы становитесь официальным опекуном Фени, что позволит Вам в течение полугода посещать наш зоопарк бесплатно. Также Ваше имя и фото профиля появятся на карточке рядом с карточкой Фени в нашем зооперке.",
            "Опека на пол года 18 000 руб."
        ),
        arrayOf(
            "Дикобраз Жора",
            "Возраст: 4 года.\nЛюбит лакомиться яблоками, репой, клубникой и арбузами. Зимой в рацион добавляется кора деревьев. Иногда любит полакомиться насекомыми.",
            "Вы можете устроить Жоре праздник, отправив донат на любую сумму или оформив опеку на пол года.",
            "При покупке подписки Вы становитесь официальным опекуном Жоры, что позволит Вам в течение полугода посещать наш зоопарк бесплатно. Также Ваше имя и фото профиля появятся на карточке рядом с карточкой Фени в нашем зооперке.",
            "Опека на пол года 18 000 руб."
        ),
        arrayOf(
            "Филин Степан",
            "Возраст: 1 год.\nЛюбит лакомиться рыбой. Также в рацион входят мелкие грызуны и ящерицы.",
            "Вы можете устроить Степану праздник, отправив донат на любую сумму или оформив опеку на пол года.",
            "При покупке подписки Вы становитесь официальным опекуном Степана, что позволит Вам в течение полугода посещать наш зоопарк бесплатно. Также Ваше имя и фото профиля появятся на карточке рядом с карточкой Фени в нашем зооперке.",
            "Опека на пол года 10 000 руб."
        ),
        arrayOf(
            "Фенек Граф",
            "Возраст: 3 года.\nКаждый день в рацион входят насекомые и мясо. Иногда мясо заменяют на рыбу. Можно угостить огурцами, тыквой или яблоками.",
            "Вы можете устроить Графу праздник, отправив донат на любую сумму или оформив опеку на пол года.",
            "При покупке подписки Вы становитесь официальным опекуном Графа, что позволит Вам в течение полугода посещать наш зоопарк бесплатно. Также Ваше имя и фото профиля появятся на карточке рядом с карточкой Фени в нашем зооперке.",
            "Опека на пол года 20 000 руб."
        )
    )
    companion object{
        const val petId = "petId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_profile)

        pet_photo = findViewById(R.id.pet_photo)
        pet_name = findViewById(R.id.pet_name)
        about_pet = findViewById(R.id.about_pet)
        more_info = findViewById(R.id.more_info)
        about_care = findViewById(R.id.about_care)
        pay_care = findViewById(R.id.pay_care)
        setPage()
    }

    fun setPage(){
        val id = intent.getIntExtra(petId,0)
        val pet = pets[id]
        when(id){
            0 -> {pet_photo.setImageResource(R.drawable.raccoon)}
            1 -> {pet_photo.setImageResource(R.drawable.porcupine)}
            2 -> {pet_photo.setImageResource(R.drawable.owl)}
            3 -> {pet_photo.setImageResource(R.drawable.fennec)}
        }

        pet_name.setText(pet[0])
        about_pet.setText(pet[1])
        more_info.setText(pet[2])
        about_care.setText(pet[3])
        pay_care.setText(pet[4])
    }

    fun goToPay(view: View){
        val payIntent = Intent(this, pay::class.java)
        startActivity(payIntent)
    }

    fun clickReturn(view: View) {
        finish()
    }
}