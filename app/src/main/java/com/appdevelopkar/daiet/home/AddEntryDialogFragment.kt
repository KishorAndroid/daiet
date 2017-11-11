package com.appdevelopkar.daiet.home

import android.app.Dialog
import android.arch.persistence.room.Room
import android.support.design.widget.BottomSheetDialogFragment
import android.view.View
import com.appdevelopkar.daiet.R
import com.appdevelopkar.daiet.data.AppDatabase
import com.appdevelopkar.daiet.data.ItemEntry
import kotlinx.android.synthetic.main.fragment_add_entry.view.*

/**
 * Created by kishorandroid on 28/10/17.
 */
class AddEntryDialogFragment : BottomSheetDialogFragment() {

    override fun setupDialog(dialog: Dialog?, style: Int) {
        super.setupDialog(dialog, style)
        val contentView = View.inflate(context, R.layout.fragment_add_entry, null)
        dialog?.setContentView(contentView)

        contentView.button_save.setOnClickListener {
            var db = Room.databaseBuilder<AppDatabase>(this.context.applicationContext, AppDatabase::class.java!!, "DaietDB").allowMainThreadQueries().build()

            var timeStamp = System.currentTimeMillis()
            var rowId = timeStamp
            var categoryId = 85.0
            var itemName = contentView.et_item_name.text.toString()
            var itemPrice = contentView.et_item_price.text.toString().toDouble()
            var dateTime = timeStamp

            var itemEntry = ItemEntry(rowId, categoryId, itemName, itemPrice, dateTime, timeStamp)
            db.itemEntryDao().insertItemEntry(itemEntry)
        }
    }
}