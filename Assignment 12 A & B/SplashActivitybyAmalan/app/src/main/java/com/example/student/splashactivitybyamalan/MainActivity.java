//by Amalan Tharmarasa
package com.example.student.splashactivitybyamalan;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mpUkulele, mpDrums;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        button1 = (Button)findViewById(R.id.btnUkulele) ;
        button2 = (Button) findViewById(R.id.btnDrums);
        button1.setOnClickListener(bUkulele);
        button2.setOnClickListener(bDrums);
        mpUkulele = new MediaPlayer();
        mpUkulele = MediaPlayer.create(this, R.raw.ukulele);
        mpDrums = new MediaPlayer();
        mpDrums = MediaPlayer.create(this, R.raw.drums);
        playing = 0;

    }

    Button.OnClickListener bUkulele = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (playing) {
                case 0:
                    mpUkulele.start();
                    playing =1;
                    button1.setText("Pause Ukulele Songs");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpUkulele.pause();
                    playing =0;
                    button1.setText("Play Ukulele Song");
                    button2.setVisibility(View.VISIBLE);
                    break;

            }
        }
    };

    Button.OnClickListener bDrums = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (playing){
                case 0:
                    mpDrums.start();
                    playing =1;
                    button2.setText("Pause Drums Songs");
                    button1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpDrums.pause();
                    playing = 0;
                    button2.setText("Play Drums Songs");
                    button1.setVisibility(View.VISIBLE);
                    break;

            }

        }
    };

}
