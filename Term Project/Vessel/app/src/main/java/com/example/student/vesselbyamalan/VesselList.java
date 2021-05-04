//By Amalan Tharmarasa
package com.example.student.vesselbyamalan;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VesselList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        String[] desserts = {" Description ", " Hudson Yard ", " Admission ", "Fare ", " Audio "};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_vessel_list, R.id.Project, desserts));


    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, Description.class));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hudsonyardsnewyork.com/discover/vessel")));
                break;

            case 2:
                startActivity(new Intent(this, Admission.class));
                break;

            case 3:
                startActivity(new Intent(this, Fare.class));
                break;

            case 4:
                startActivity(new Intent(this, Audio.class));
                break;

        }

    }
}
