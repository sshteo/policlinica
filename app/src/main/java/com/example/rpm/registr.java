package com.example.rpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class registr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);


        TextView forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView);


        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(registr.this, zabpar.class);
                startActivity(intent);
            }
        });

        TextView vhodTextView = findViewById(R.id.vhodTextView);


        vhodTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(registr.this, vhod.class);
                startActivity(intent);
            }
        });


    }}