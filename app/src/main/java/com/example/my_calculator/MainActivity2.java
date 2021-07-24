package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static com.example.my_calculator.R.id.buttonTeamBlack;
import static com.example.my_calculator.R.id.buttonTeamWhite;

public class MainActivity2 extends AppCompatActivity {
    Button team;
    TextView textViewTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(buttonTeamWhite).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            MainActivity2.this.startActivity(intent);

        });
        findViewById(buttonTeamBlack).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            MainActivity2.this.startActivity(intent);

        });

    }
}