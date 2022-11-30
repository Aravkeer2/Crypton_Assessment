package com.as.shoppingapp;



import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View button = findViewById(R.id.interior);
        button.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,InteriorDesign.class);
            startActivity(intent);
        });

    }


}