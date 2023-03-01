package com.example.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MyCareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_care)
    }

    fun clickReturn(view: View) {
        finish()
    }

    fun movePage(view: View) {
        val petsIntent = Intent(this, PetsActivity::class.java)
        startActivity(petsIntent)
    }

    fun goToPetProfile(view: View){
        when(view.id){
            R.id.go_to4->{
                val petProfileIntent = Intent(this, PetProfileActivity::class.java)
                petProfileIntent.putExtra(PetProfileActivity.petId, 1)
                startActivity(petProfileIntent)
            }
        }
    }
    fun showDialog(v: View?) {
        val dialog = CustomDialogFragment()
        dialog.show(supportFragmentManager, "custom")
    }
}