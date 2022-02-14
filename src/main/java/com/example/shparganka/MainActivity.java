package com.example.shparganka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] Stixi = {"Что это такое?","Берёза","Письмо к женщине","Заметался пожар голубой…","Черный человек","Не жалею, не зову, не плачу…","Шаганэ ты моя, Шаганэ…","Письмо матери"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView countriesList = findViewById(R.id.stixilist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, Stixi);

        // устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
    }
}