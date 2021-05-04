package com.example.student.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Central_Park extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central__park);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_ch);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
}
