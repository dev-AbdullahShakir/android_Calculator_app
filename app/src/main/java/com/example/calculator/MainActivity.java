package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add, multiply, sum, devion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btAdd);
        multiply = findViewById(R.id.btMultiply);
        sum = findViewById(R.id.btSum);
        devion = findViewById(R.id.btDevion);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue + secondValue;
                tvAns.setText("Total is " +ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue * secondValue;
                tvAns.setText("Total is " +ans);
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue - secondValue;
                tvAns.setText("Total is " +ans);
            }
        });

        devion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue / secondValue;
                tvAns.setText("Total is " +ans);
            }
        });


    }
}