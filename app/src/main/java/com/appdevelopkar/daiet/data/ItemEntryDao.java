package com.appdevelopkar.daiet.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by kishorandroid on 27/09/17.
 */

@Dao
public interface ItemEntryDao {

    @Insert
    void insertItemEntry(ItemEntry itemEntry);

    @Query("SELECT * FROM item_entry ORDER BY time_stamp DESC")
    List<ItemEntry> getAllEntries();

    @Query("SELECT * FROM item_entry WHERE date_time LIKE :date")
    ItemEntry getEntryForDate(String date);
}
