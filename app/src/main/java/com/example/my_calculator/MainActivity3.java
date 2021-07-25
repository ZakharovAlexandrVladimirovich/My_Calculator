package com.example.my_calculator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    public static final String KEY_EDIT_TEXT = "KEY_EDIT_TEXT";
    public static final String KEY_TEXT_VIEW = "KEY_TEXT_VIEW";
    StringBuilder stringBuilder;
    EditText editText;
    TextView textView;
    private String a;
    private String b;
    private char mathSign;
    private double minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        stringBuilder = new StringBuilder();
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(v -> {
            textView.setText("Тут будет отображаться результат");
            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
            MainActivity3.this.startActivity(intent);
        });
        findViewById(R.id.button0).setOnClickListener(v -> {
            editText.append("0");
            stringBuilder.append('0');
        });
        findViewById(R.id.button1).setOnClickListener(v -> {
            editText.append("1");
            stringBuilder.append('1');
        });
        findViewById(R.id.button2).setOnClickListener(v -> {
            editText.append("2");
            stringBuilder.append('2');
        });
        findViewById(R.id.button3).setOnClickListener(v -> {
            editText.append("3");
            stringBuilder.append('3');
        });
        findViewById(R.id.button4).setOnClickListener(v -> {
            editText.append("4");
            stringBuilder.append('4');
        });
        findViewById(R.id.button5).setOnClickListener(v -> {
            editText.append("5");
            stringBuilder.append('5');
        });
        findViewById(R.id.button6).setOnClickListener(v -> {
            editText.append("6");
            stringBuilder.append('6');
        });
        findViewById(R.id.button7).setOnClickListener(v -> {
            editText.append("7");
            stringBuilder.append('7');
        });
        findViewById(R.id.button8).setOnClickListener(v -> {
            editText.append("8");
            stringBuilder.append('8');
        });
        findViewById(R.id.button9).setOnClickListener(v -> {
            editText.append("9");
            stringBuilder.append('9');
        });
        findViewById(R.id.buttonErase).setOnClickListener(v -> {
            editText.setText(" ");
            textView.setText(" ");
            a = " ";
            b = " ";
            stringBuilder.delete(0, stringBuilder.length());
        });

        findViewById(R.id.buttonCleaning).setOnClickListener(v -> {
            editText.setText(" ");
            stringBuilder.delete(0, stringBuilder.length());
        });

        findViewById(R.id.buttonMultiplication).setOnClickListener(v -> {
            a = String.valueOf(editText.getText());
            editText.setText("*");
            mathSign = '*';
            stringBuilder.append('*');
            editText.setText(" ");
        });
        findViewById(R.id.buttonDivision).setOnClickListener(v -> {
            a = String.valueOf(editText.getText());
            editText.setText("/");
            mathSign = '/';
            stringBuilder.append('/');
            editText.setText(" ");
        });
        findViewById(R.id.buttonSum).setOnClickListener(v -> {
            a = String.valueOf(editText.getText());
            editText.setText("+");
            mathSign = '+';
            stringBuilder.append('+');
            editText.setText(" ");
        });
        findViewById(R.id.buttonSubtraction).setOnClickListener(v -> {
            a = String.valueOf(editText.getText());
            editText.setText("-");
            mathSign = '-';
            stringBuilder.append('-');
            editText.setText(" ");
        });
        findViewById(R.id.buttonPoint).setOnClickListener(v -> {
            editText.append(".");
            stringBuilder.append('.');
        });
        findViewById(R.id.buttonANegativeNumber).setOnClickListener(v -> {
//            Не могу догнать как запрограммировать эту кнопку.
//            minus = -1 * Double.parseDouble(String.valueOf(editText.getText()));
//            a = minus + "";
        });
        findViewById(R.id.buttonEqual).setOnClickListener(v -> {
            b = String.valueOf(editText.getText());
            stringBuilder.append("=");
            editText.setText(stringBuilder);
            if (mathSign == '+') {
                textView.setText(String.valueOf(Double.parseDouble(a) + Double.parseDouble(b)));
            } else if (mathSign == '-') {
                textView.setText(String.valueOf(Double.parseDouble(a) - Double.parseDouble(b)));
            } else if (mathSign == '*') {
                textView.setText(String.valueOf(Double.parseDouble(a) * Double.parseDouble(b)));
            } else if (mathSign == '/') {
                textView.setText(String.valueOf(Double.parseDouble(a) / Double.parseDouble(b)));
            }
            a = String.valueOf(textView.getText());
            stringBuilder.delete(0, stringBuilder.length());
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        editText.setText(savedInstanceState.getString(KEY_EDIT_TEXT));
        textView.setText(savedInstanceState.getString(KEY_TEXT_VIEW));
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_EDIT_TEXT, String.valueOf(editText.getText()));
        outState.putString(KEY_TEXT_VIEW, String.valueOf(textView.getText()));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}



