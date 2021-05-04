//By Amalan Tharmarasa
package com.example.student.thecityguideappbyamalan;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class City_Guide extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[ ] attraction={ "Art Institute of Chicaco", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_city__guide,R.id.travel, attraction));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://artic.edu")));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.themagnificentmile.com")));
                break;

            case 2:
                startActivity(new Intent(City_Guide.this, Willis.class));
                break;

            case 3:
                startActivity(new Intent(City_Guide.this, Pier.class));
                break;

            case 4:
                startActivity(new Intent(City_Guide.this, Water.class));
                break;

        }
    }
}
