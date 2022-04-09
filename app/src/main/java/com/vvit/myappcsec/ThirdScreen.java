package com.vvit.myappcsec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdScreen extends AppCompatActivity {
    TextView resultView;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        String result = getIntent().getStringExtra("result");
        resultView = findViewById(R.id.third_result);
        next = findViewById(R.id.third_next);


        resultView.setText(result);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdScreen.this,FourthScreen.class);
                startActivity(intent);
            }
        });
    }
}