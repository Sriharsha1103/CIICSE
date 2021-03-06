package com.vvit.myappcsec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    TextView resultView;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        String result = getIntent().getStringExtra("result");
        resultView = findViewById(R.id.second_result);
        next = findViewById(R.id.second_next);

        setTitle(R.string.second_screen_title);
        resultView.setText(result);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondScreen.this,ThirdScreen.class);
                startActivity(intent);
            }
        });
    }
}