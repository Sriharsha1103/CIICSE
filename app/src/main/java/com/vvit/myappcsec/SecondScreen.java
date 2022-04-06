package com.vvit.myappcsec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        String result = getIntent().getStringExtra("result");
        resultView = findViewById(R.id.second_result);

        setTitle(R.string.second_screen_title);
        resultView.setText(result);
    }
}