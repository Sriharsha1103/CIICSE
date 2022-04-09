package com.vvit.myappcsec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Log.d("Life Cycle","In on Create Method");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle","In on Restart Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle","In on Destroy Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle","In on Pause Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle","In on Resume Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle","In on Stop Method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle","In on Start Method");
    }
}