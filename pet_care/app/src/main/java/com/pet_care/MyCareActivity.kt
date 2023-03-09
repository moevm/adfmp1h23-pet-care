package com.pet_care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
import android.transition.Slide
import android.transition.TransitionManager
import android.widget.*

class MyCareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_care)

        // Get the widgets reference from XML layout
        val rootLayout = findViewById<ConstraintLayout>(R.id.root)
        val button = findViewById<ImageButton>(R.id.butShare)

        // Button click listener
        button.setOnClickListener {
            // Initialize a new layout inflater instance
            val inflater: LayoutInflater = getSystemService(
                Context.LAYOUT_INFLATER_SERVICE
            ) as LayoutInflater

            // Inflate a custom view using layout inflater
            val view = inflater.inflate(R.layout.share_view,null)

            // Initialize a new instance of popup window
            val shareWindow = PopupWindow(
                view, // Custom view to show in popup window
                LayoutParams.WRAP_CONTENT, // Width of popup window
                LayoutParams.WRAP_CONTENT // Window height
            )

            // Set an elevation for the popup window
            shareWindow.elevation = 10.0F

            // Slide animation for popup window enter transition
            val slideIn = Slide()
            slideIn.slideEdge = Gravity.TOP
            shareWindow.enterTransition = slideIn

            // Slide animation for popup window exit transition
            val slideOut = Slide()
            slideOut.slideEdge = Gravity.END
            shareWindow.exitTransition = slideOut

            // Get the widgets reference from custom view
            val buttonShare = view.findViewById<Button>(R.id.buttonShare)

            // Set a click listener for popup's button widget
            buttonShare.setOnClickListener{
                // Dismiss the popup window
                shareWindow.dismiss()
            }

            // Finally, show the popup window on app
            TransitionManager.beginDelayedTransition(rootLayout)
            shareWindow.showAtLocation(
                rootLayout, // Location to display popup window
                Gravity.BOTTOM, // Layout position to display popup
                0, // X offset
                0 // Y offset
            )
        }
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