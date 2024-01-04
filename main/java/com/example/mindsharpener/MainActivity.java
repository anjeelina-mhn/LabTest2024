package com.example.mindsharpener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        RadioButton radioButton3 = findViewById(R.id.radioButton3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);
        EditText editText = findViewById(R.id.editText);
        Button bigButton = findViewById(R.id.bigButton);
        TextView textView7 = findViewById(R.id.textView7);
        TextView textView8 = findViewById(R.id.textView8);


        textView1.setText("Instructions:");
        textView2.setText("This is a simple mathematic games which is believed can train your brain." +
                "Two numbers are given randomly based on your level choice together with the operator." +
                "You just need to calculate the answer, write your answer and press check button." +
                "Every correct answer will give you 1 point while wrong answer will deduct 1 point.");

        textView3.setText("Choose Level:");
        radioButton1.setText("i3");
        radioButton2.setText("i5");
        radioButton3.setText("i7");
        textView4.setText("                         1");
        textView5.setText("+");
        textView6.setText("1");
        textView7.setText("             POINT:");
        textView8.setText("0");


        bigButton.setText("Check");


        bigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}