//by: Amalan Tharmarasa
package com.example.student.nyccityguidebyamalan;

import android.app.ListActivity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NYC_Guige_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyc__guige__main);
       ImageButton button =(ImageButton)findViewById(R.id.btnGuide);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NYC_Guige_Main.this, list.class));
            }
        });
    }
}
