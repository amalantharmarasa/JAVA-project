package com.example.student.menu;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NYC_Guide_List extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attraction = {"Grand Central Terminal", "Chelsea Market", "World Trade Center", "Empire Tower", "Central Park"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_nyc__guide__list, R.id.travel, attraction));

    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.grandcentralterminal.com")));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://chelseamarket.com")));
                break;

            case 2:
                startActivity(new Intent(this, World_Trade_Center.class));
                break;

            case 3:
                startActivity(new Intent(this, Empire_State_Building.class));
                break;

            case 4:
                startActivity(new Intent(this, Central_Park.class));
                break;


        }

    }
}
