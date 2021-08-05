package com.example.minesweepergame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button level2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        level2 = findViewById(R.id.button2);
    }
    public void openactivity(View v){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }
    public void openactivity3(View v){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

    }
    public void openactivity4(View v){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);

    }
}