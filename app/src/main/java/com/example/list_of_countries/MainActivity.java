package com.example.list_of_countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int flags[] = {R.drawable.rus, R.drawable.usa, R.drawable.germany, R.drawable.china, R.drawable.moldova, R.drawable.argentina, R.drawable.france, R.drawable.italy, R.drawable.brazil, R.drawable.canada};
        ListView listView = findViewById(R.id.listView);
        String[] countries = getResources().getStringArray(R.array.countries);

        // используем адаптер данных
        CountryAdapter countryAdapter = new CountryAdapter(getApplicationContext(), countries, flags);
        listView.setAdapter(countryAdapter);
    }
}