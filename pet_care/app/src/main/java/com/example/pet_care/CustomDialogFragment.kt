package com.example.pet_care

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment


class CustomDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        return builder
            .setTitle("Выберите тип")
            .setView(R.layout.dialog)
            .setPositiveButton("OK", null)
            .setNegativeButton("Отмена", null)
            .create()
    }
}