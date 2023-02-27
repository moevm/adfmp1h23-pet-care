package com.example.pet_care

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.io.FileNotFoundException
import java.io.InputStream

class LkActivity : AppCompatActivity() {

    private lateinit var nameField: TextView
    private lateinit var count_donation: TextView
    private lateinit var avatar: ImageView
    private lateinit var foto: Button
    private val Pick_image = 1

    companion object {
        const val name = "name"
        const val sername = "sername"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lk)

        nameField = findViewById(R.id.nameField)
        count_donation = findViewById(R.id.count_donation)
        avatar = findViewById(R.id.avatar)
        foto = findViewById(R.id.photo_button)
        showName()
    }
    fun clickFoto(view: View) {
        val fotoIntent = Intent(Intent.ACTION_PICK)
        //Тип получаемых объектов - image:
        fotoIntent.type = "image/*"
        //Запускаем переход с ожиданием обратного результата в виде информации об изображении:
        startActivityForResult(fotoIntent, Pick_image)
    }
    //Обрабатываем результат выбора в галерее:
    override fun onActivityResult(requestCode: Int, resultCode: Int, imageReturnedIntent: Intent?) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent)
        when (requestCode) {
            Pick_image -> if (resultCode == RESULT_OK) {
                try {
                    //Получаем URI изображения, преобразуем его в Bitmap
                    //объект и отображаем в элементе ImageView нашего интерфейса:
                    val imageUri = imageReturnedIntent?.data
                    val imageStream: InputStream? = imageUri?.let { contentResolver.openInputStream(it) }
                    val selectedImage = BitmapFactory.decodeStream(imageStream)
                    avatar.setImageBitmap(selectedImage)
                } catch (e: FileNotFoundException) {
                    e.printStackTrace()
                }
            }
        }
    }

    fun showName() {
        val name = intent.getStringExtra(name)
        val sername = intent.getStringExtra(sername)
        nameField.setText(name + " " + sername)
        count_donation.setText("0 руб.")
    }

    fun movePage(view: View) {
        val petsIntent = Intent(this, PetsActivity::class.java)
        startActivity(petsIntent)
    }

    fun myCare(view: View) {
        val myCareIntent = Intent(this, MyCareActivity::class.java)
        startActivity(myCareIntent)
    }

    fun favorite(view: View) {
        val favoriteIntent = Intent(this, FavoriteActivity::class.java)
        startActivity(favoriteIntent)
    }
}