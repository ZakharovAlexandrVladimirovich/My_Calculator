package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final int[] buttons = {R.id.button0, R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9,
            R.id.buttonDivision, R.id.buttonMultiplication, R.id.buttonPoint, R.id.buttonSubtraction,
            R.id.buttonSum,R.id.buttonEqual,R.id.buttonANegativeNumber};
    private final String[] buttonsValue = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "/",
            "*", ".", "-", "+","=","-"};
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClickInitialaizer2();
        editText = findViewById(R.id.editTextTextMultiLine);

//        Button button = findViewById(R.id.buttonMultiplication);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText("*");
//            }
//        });


    }

    private void buttonClickInitialaizer2() {
        int i = 0;
        for (int button : buttons) {
            setButtonClickListeners2(button, buttonsValue[i++]);
        }
    }

    private void setButtonClickListeners2(int button, String number) {
        findViewById(button).setOnClickListener(v -> setText2(number));
    }

    public void setText2(String string) {
        String buffer = editText.getText().toString();
        editText.setText(String.format("%s", buffer + string));
//        editText.append(String.valueOf(string));
    }


//    private void buttonClickInitialaizer() {
//        int i = 0;
//        for (int button : buttons) {
//            setButtonClickListeners(button, i++);
//        }
//    }
//    private void setButtonClickListeners(int button, int number) {
//        findViewById(button).setOnClickListener(v -> setText(number));
//    }
//    public void setText(int string) {
//        String buffer = editText.getText().toString();
//        editText.setText(String.format("%s", buffer + string));
////        editText.append(String.valueOf(string));
//    }

}