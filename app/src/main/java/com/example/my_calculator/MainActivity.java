package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  button1 = findViewById(R.id.button4);
        EditText editText = findViewById(R.id.editTextTextMultiLine);

        button1.setOnClickListener(v -> editText.setText(String.format("%s", "12345")));

    }
}