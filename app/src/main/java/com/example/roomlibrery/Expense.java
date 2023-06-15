package com.example.roomlibrery;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "expense")
public class Expense {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name="amount")
   private String  amount;

    Expense(int id, String title , String amount){
        this.id= id;
        this.amount= amount;
        this.title= title;
    }

}
