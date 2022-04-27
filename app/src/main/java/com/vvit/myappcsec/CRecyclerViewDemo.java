package com.vvit.myappcsec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRecyclerViewDemo extends AppCompatActivity {
    RecyclerView myAnimalListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crecycler_view_demo);
        myAnimalListView = findViewById(R.id._animals_list);

        List<String> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(getResources().getStringArray(R.array.my_animals)));

        AnimalAdapter adapter = new AnimalAdapter(myList);

        myAnimalListView.setLayoutManager(new LinearLayoutManager(this));
        myAnimalListView.setAdapter(adapter);
    }
}