package com.as.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStart extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started2);

        Button button = findViewById(R.id.getStarted);
        button.setOnClickListener(v -> {
            Intent intent=new Intent(GetStart.this, MainActivity.class);
            startActivity(intent);
        });
    }
}