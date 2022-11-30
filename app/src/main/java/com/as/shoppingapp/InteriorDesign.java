package com.as.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class InteriorDesign extends AppCompatActivity {
    RatingBar rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interior_design);

        View button = findViewById(R.id.view13);
        rate =findViewById(R.id.rate);
        button.setOnClickListener(v -> {
            Intent intent=new Intent(InteriorDesign.this,MainActivity.class);
            startActivity(intent);
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(rate.getRating());
                Toast.makeText(getApplicationContext(),s+"Star" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}