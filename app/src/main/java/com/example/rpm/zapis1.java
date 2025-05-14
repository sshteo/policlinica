package com.example.rpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class zapis1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapis1);

        TextView button2 = findViewById(R.id.button2);

        // Устанавливаем обработчик нажатия
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаём Intent для перехода на zapis2
                Intent intent = new Intent(zapis1.this, zapis2.class);
                startActivity(intent);
            }
        });

        TextView button = findViewById(R.id.button);

        // Устанавливаем обработчик нажатия
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаём Intent для перехода на zapis2
                Intent intent = new Intent(zapis1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
