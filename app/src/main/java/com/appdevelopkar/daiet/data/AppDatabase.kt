package com.appdevelopkar.daiet.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by kishorandroid on 11/11/17.
 */

@Database(entities = arrayOf(ItemEntry::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun itemEntryDao(): ItemEntryDao
}
