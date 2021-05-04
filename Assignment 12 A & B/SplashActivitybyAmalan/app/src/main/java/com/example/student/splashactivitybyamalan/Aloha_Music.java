//by Amalan Tharmarasa
package com.example.student.splashactivitybyamalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Aloha_Music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloha__music);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Aloha_Music.this, MainActivity.class));

            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}
