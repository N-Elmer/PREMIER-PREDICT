package com.premierpredict.bettapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    //Time till splash screen switches to main screen = 3 secs.
    static int TIMEOUT_MILLIS = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //hide title bar till screen switches
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        //switching delay method
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                //switch command
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

                // close this activity
                finish();
            }
        }, TIMEOUT_MILLIS);
    }
}