package com.example.student.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Empire_State_Building extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empire__state__building);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_ch);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
}
