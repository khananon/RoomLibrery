package com.example.roomlibrery;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao

public class ExpenseDAO {
    @Query("select * from expense")
    List<Expense> getAllExpense() {


        return null;
    }


    @Insert
    void addTx(Expense expense) {
    }

    @Update
    void updateTx(Expense expense) {

    }

    @Delete
    void deleteTX(Expense expense) {

    }


}
