package com.vvit.myappcsec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstScreen extends AppCompatActivity {
    //1. Create objects
    EditText firstValue,secondValue;
    Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        //2. map objects to views

        firstValue = findViewById(R.id.first_input1);
        secondValue = findViewById(R.id.first_input2);
        addButton = findViewById(R.id.first_add_button);




    }


    public void handleAddClick(View view) {

        int value1 = Integer.parseInt(firstValue.getText().toString());
        Log.d("Debug - First Value",String.valueOf(value1));
        int value2 = Integer.parseInt(secondValue.getText().toString());
        Log.d("Debug - Second Value",String.valueOf(value2));
        int result = value1 + value2;
        Log.d("Debug - Result Value",String.valueOf(result));

        //4. Navigation instantiate an object for Intent class
        Intent intent = new Intent(this,SecondScreen.class);
        intent.putExtra("result",String.valueOf(result));
        startActivity(intent);
    }
}