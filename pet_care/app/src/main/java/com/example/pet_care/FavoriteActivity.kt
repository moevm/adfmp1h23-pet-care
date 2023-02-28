package com.example.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)
    }

    fun clickReturn(view: View) {
        finish()
    }

    fun goToPetProfile(view: View){
        when(view.id){
            R.id.go_to5->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 1)
                startActivity(petProfileIntent)
            }
            R.id.go_to6->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 2)
                startActivity(petProfileIntent)
            }
            R.id.go_to7->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 3)
                startActivity(petProfileIntent)
            }
        }

    }
}