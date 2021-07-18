package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button team;
    TextView textViewTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        team = findViewById(R.id.team);
//        team.setOnClickListener(v -> {
//
//            textViewTeam.setText("Светлая тема");
//        });

    }
}