package com.appdevelopkar.daiet.home

import android.app.Dialog
import android.support.design.widget.BottomSheetDialogFragment
import android.view.View
import com.appdevelopkar.daiet.R

/**
 * Created by kishorandroid on 28/10/17.
 */
class AddEntryDialogFragment : BottomSheetDialogFragment() {

    override fun setupDialog(dialog: Dialog?, style: Int) {
        super.setupDialog(dialog, style)
        val contentView = View.inflate(context, R.layout.fragment_add_entry, null)
        dialog?.setContentView(contentView)
    }
}