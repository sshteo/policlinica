package com.example.rpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class zapis3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapis3);

        TextView button = findViewById(R.id.button);

        // Устанавливаем обработчик нажатия
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаём Intent для перехода на zapis2
                Intent intent = new Intent(zapis3.this, zapis2.class);
                startActivity(intent);
            }
        });
    }
}
