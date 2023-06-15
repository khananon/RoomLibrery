package com.example.roomlibrery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edttitle;
    EditText edtMAnt;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMAnt= findViewById(R.id.edtAmnt);
        edttitle= findViewById(R.id.edtname);
        btn= findViewById(R.id.btn);
        DatabaseHelper databaseHelper=DatabaseHelper.getDB(this);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
String title= edttitle.getText().toString();
String amount= edtMAnt.getText().toString();
        databaseHelper.expenseDAO().addTx(
                new Expense(title,amount)
        );

      ArrayList<Expense> arrExpense=  (ArrayList<Expense>) databaseHelper.expenseDAO().getAllExpense();
      for(int i=0; i<arrExpense.size();i++){
          Log.d("Data","Title: "+arrExpense.get(i).getTitle()+"Amount:"+arrExpense.get(i).getAmount());

      }
    }
});


    }
}