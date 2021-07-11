package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final int[] buttons = {R.id.button0, R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9};
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClickInitialaizer();
//        Button button1 = findViewById(R.id.button1);
        editText = findViewById(R.id.editTextTextMultiLine);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setText("1");
//            }
//        });
//        Button button2 = findViewById(R.id.button2);
//        button2.setOnClickListener(v -> setText("2"));
    }

    private void buttonClickInitialaizer() {
        int i = 0;
        for (int button : buttons) {
            setButtonClickListeners(button, i++);
        }
    }

    private void setButtonClickListeners(int button, int number) {
        findViewById(button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.setText(number);
            }
        });
    }

    public void setText(int string) {
        String buffer = editText.getText().toString();
        editText.setText(String.format("%s", buffer + string));
    }

}