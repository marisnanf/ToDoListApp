package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] toDo = {"Webinar UI/UX", "Mengerjakan Project Android", "Rapat Kabinet", "Badminton"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.activity_list, toDo);
        ListView listView = (ListView) findViewById(R.id.itemListView);
        listView.setAdapter(listAdapter);
    }
}