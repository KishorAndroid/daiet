package com.appdevelopkar.daiet.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kishorandroid on 27/09/17.
 */

@Entity(tableName = "item_entry")
public class ItemEntry implements Parcelable {

    @PrimaryKey
    public long rowId;

    @ColumnInfo(name = "category_id")
    public double categoryId;

    @ColumnInfo(name = "item_name")
    public String itemName;

    @ColumnInfo(name = "item_price")
    public double itemPrice;

    @ColumnInfo(name = "date_time")
    public long dateTime;

    @ColumnInfo(name = "time_stamp")
    public long timeStamp;

    public ItemEntry(long rowId, double categoryId, String itemName, double itemPrice, long dateTime, long timeStamp) {
        this.rowId = rowId;
        this.categoryId = categoryId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.dateTime = dateTime;
        this.timeStamp = timeStamp;
    }

    protected ItemEntry(Parcel in) {
        rowId = in.readLong();
        categoryId = in.readDouble();
        itemName = in.readString();
        itemPrice = in.readDouble();
        dateTime = in.readLong();
        timeStamp = in.readLong();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(rowId);
        dest.writeDouble(categoryId);
        dest.writeString(itemName);
        dest.writeDouble(itemPrice);
        dest.writeLong(dateTime);
        dest.writeLong(timeStamp);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ItemEntry> CREATOR = new Creator<ItemEntry>() {
        @Override
        public ItemEntry createFromParcel(Parcel in) {
            return new ItemEntry(in);
        }

        @Override
        public ItemEntry[] newArray(int size) {
            return new ItemEntry[size];
        }
    };
}
