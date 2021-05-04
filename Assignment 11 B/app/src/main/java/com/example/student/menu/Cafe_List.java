//By Amalan Tharmarasa
package com.example.student.menu;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cafe_List extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] desserts = {"Chocolate Mousse", "Chocolate Cake", "Chocolate Macaron", "Chocolate cafe website"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_cafe__list, R.id.cake, desserts));

    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, Mousse.class));
                break;

            case 1:
                startActivity(new Intent(this, Cake.class));
                break;

            case 2:
                startActivity(new Intent(this, Macaron.class));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://chocolatharlem.com")));
                break;

        }

    }
}