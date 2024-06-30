package com.example.activites

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class PurchaseConfirmationDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(requireContext())
                .setMessage(getString(R.string.app_name))
                .setPositiveButton(getString(R.string.hello_blank_fragment)) { _,_ -> }
                .create()

    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }
}