package com.example.todoapp.dialogs

import androidx.appcompat.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class CustomAlertDialog(val callback: () -> Unit): DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Delete")
        builder.setMessage("Are you sure to Delete?")
        builder.setPositiveButton("Yes"){ dialog, which ->
            callback()
        }
        builder.setNegativeButton("Cancel", null)
        return builder.create()
    }
}