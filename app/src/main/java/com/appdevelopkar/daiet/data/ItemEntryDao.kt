package com.appdevelopkar.daiet.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by kishorandroid on 27/09/17.
 */

@Dao
interface ItemEntryDao {

    @get:Query("SELECT * FROM item_entry ORDER BY time_stamp DESC")
    val allEntries: List<ItemEntry>

    @Insert
    fun insertItemEntry(itemEntry: ItemEntry)

    @Query("SELECT * FROM item_entry WHERE date_time LIKE :date")
    fun getEntryForDate(date: String): ItemEntry
}
