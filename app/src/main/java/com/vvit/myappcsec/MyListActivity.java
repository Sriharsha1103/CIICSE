package com.vvit.myappcsec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListActivity extends AppCompatActivity {
    String [] myFruits= {"Kiwi","Dragon Fruit","Apple",
            "Banana","Cherry","Mango","Strawberry","Raspberry",
            "Blueberry","Watermelon","Orange","PineApple","CustardApple",
            "Pomegranate","Grapes","Guava"};
    ListView myFruitsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        myFruitsList = findViewById(R.id.my_list_my_fruits);

        ArrayAdapter myFruitAdapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.row_my_fruits,myFruits);

        myFruitsList.setAdapter(myFruitAdapter);

    }
}