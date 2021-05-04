package com.example.student.menu;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attraction = {"  NYC Guide", "  Coffee Cafe"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_menu, R.id.travel, attraction));

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, NYC_Guide_List.class));
                break;

            case 1:
                startActivity(new Intent(this, Cafe_List.class));
                break;

        }}
}

