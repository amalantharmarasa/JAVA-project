//By Amalan Tharmarasa
package com.example.student.project5a_concernticketbyamalantharmarasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double Life_Revealed= 70.00, Spatial_Sense= 80.00, Zig_Zag= 90.00;
    int numberOfTickets;
    double totalCost,subTotal,Tax;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets =(EditText)findViewById(R.id.txtTickets);
        final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        Button cost = (Button)findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id. txtResult));
            @Override
            public void onClick(View v) {
                numberOfTickets = Integer.parseInt(tickets.getText().toString());


                long show = group.getSelectedItemId();{
                    if (show == 0) {
                        subTotal = (Life_Revealed * numberOfTickets);
                        Tax = subTotal * 0.08875;
                        totalCost = Life_Revealed * numberOfTickets + Tax;
                    } else if (show == 1) {
                        subTotal = (Spatial_Sense * numberOfTickets);
                        Tax = subTotal * 0.08875;
                        totalCost = Spatial_Sense * numberOfTickets + Tax;
                    } else if (show == 2) {
                        subTotal = (Zig_Zag * numberOfTickets);
                        Tax = subTotal * 0.08875;
                        totalCost = Zig_Zag * numberOfTickets + Tax;
                    }
                }


                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();

                result.setText("Cost for " + groupChoice + " is " + currency.format(totalCost));




            }
        });
    }
}
