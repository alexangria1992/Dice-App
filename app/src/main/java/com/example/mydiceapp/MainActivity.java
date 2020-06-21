package com.example.mydiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int myBox = 10;
        float myFloatBox = 4.2f;
        double mtDoubleBox = 3.34578923;

        Button btnRoll = findViewById(R.id.btnRollTheDice);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Log.i("MyDiceApp", "btnRoll is tapped now!");
            }
        });


    }
}