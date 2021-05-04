//By Amalan Tharmarasa
package com.example.student.vesselbyamalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity( new Intent(Splash_Activity.this, VesselList.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 3000);
    }
}
