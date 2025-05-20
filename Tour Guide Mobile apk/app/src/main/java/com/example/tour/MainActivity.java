package com.example.tour;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final long DELAY_TIME_MS = 3000; // Delay time in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Delay navigation to register page
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToRegister();
            }
        }, DELAY_TIME_MS);
    }

    private void navigateToRegister() {
        Intent intent = new Intent(MainActivity.this, activity_register.class);
        startActivity(intent);
        finish(); // Finish the current activity so that user cannot navigate back to it
    }
}
