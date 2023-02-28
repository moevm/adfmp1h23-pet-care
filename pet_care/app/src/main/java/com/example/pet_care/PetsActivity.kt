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
        onBackPressed()
    }

    fun goToPetProfile(view: View){
        when(view.id){
            R.id.go_to->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 0)
                startActivity(petProfileIntent)
            }
            R.id.go_to1->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 1)
                startActivity(petProfileIntent)
            }
            R.id.go_to2->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 2)
                startActivity(petProfileIntent)
            }
            R.id.go_to3->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 3)
                startActivity(petProfileIntent)
            }
        }

    }
}