package com.example.rpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class zapis2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapis2);

        CalendarView calendarView = findViewById(R.id.calendarView);

        // Установить сегодняшнюю дату
        calendarView.setDate(System.currentTimeMillis(), false, true);

        // Слушатель выбора даты
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(getApplicationContext(), "Выбрана дата: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });





        TextView button = findViewById(R.id.button);

        // Устанавливаем обработчик нажатия
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаём Intent для перехода на zapis2
                Intent intent = new Intent(zapis2.this, zapis1.class);
                startActivity(intent);
            }
        });

        TextView button2 = findViewById(R.id.button2);

        // Устанавливаем обработчик нажатия
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаём Intent для перехода на zapis2
                Intent intent = new Intent(zapis2.this, zapis3.class);
                startActivity(intent);
            }
        });





    }
}
