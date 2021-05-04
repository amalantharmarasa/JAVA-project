//By Amalan Tharmarasa
package com.example.student.vesselbyamalan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Audio extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mpEmpire, mpNewYork;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        button1 = (Button) findViewById(R.id.btnEmpire);
        button2 = (Button) findViewById(R.id.btnNewyork);
        button1.setOnClickListener(English);
        button2.setOnClickListener(Sting);
        mpEmpire = new MediaPlayer();
        mpEmpire = MediaPlayer.create(this, R.raw.emprestate);
        mpNewYork = new MediaPlayer();
        mpNewYork = MediaPlayer.create(this, R.raw.sting);
        playing = 0;

        ImageButton button_home =(ImageButton)findViewById(R.id.btnAHome);
        button_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Audio.this, VesselList.class));
            }
        });
    }

        Button.OnClickListener English = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing) {
                    case 0:
                        mpEmpire.start();
                        playing =1;
                        button1.setText("Pause Empire State of Mind");
                        button2.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpEmpire.pause();
                        playing =0;
                        button1.setText("Play Empire State of Mind");
                        button2.setVisibility(View.VISIBLE);
                        break;

                }
            }
        };

        Button.OnClickListener Sting = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing){
                    case 0:
                        mpNewYork.start();
                        playing =1;
                        button2.setText("Pause Englishman in New York");
                        button1.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpNewYork.pause();
                        playing = 0;
                        button2.setText("Play Englishman in New York");
                        button1.setVisibility(View.VISIBLE);
                        break;

                }

            }
        };




    }
