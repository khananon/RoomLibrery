package com.example.roomlibrery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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
    }
}