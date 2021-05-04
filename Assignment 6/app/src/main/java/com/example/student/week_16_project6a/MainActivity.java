//by Amalan Tharmarasa
package com.example.student.week_16_project6a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    final double Peak_Jones_Beach=25.00, Peak_Long_Beach=35.00, Peak_Fire_Island=45.00;
    final double nonPeak_Jones_Beach=20.00, nonPeak_Long_Beach=30.00, nonPeak_Fire_Island=40.00;
    final double Tax_Rate=0.08875;
    int numberOfTickets;
    double totalCost, subTotal, Tax;
    String DestChoice;
    String TimeChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets = (EditText) findViewById(R.id.txtTickets);
        final Spinner Destinations = (Spinner) findViewById(R.id.txtDestinations);
        final Spinner Time = (Spinner) findViewById(R.id.txtTime);
        Button cost = (Button) findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView) findViewById(R.id.txtResult));
            @Override
            public void onClick(View view) {
                numberOfTickets = Integer.parseInt(tickets.getText().toString());
                DestChoice = Destinations.getSelectedItem().toString();
                TimeChoice = Time.getSelectedItem().toString();
                long selDest = Destinations.getSelectedItemId();
                long selTime = Time.getSelectedItemId();{
                    if (selDest == 0)
                                {
                        if      (selTime==0)  totalCost = Peak_Jones_Beach * numberOfTickets;
                        else if (selTime==1)  totalCost = nonPeak_Jones_Beach * numberOfTickets;
                                 }
                    else if (selDest == 1)
                                {
                        if      (selTime==0) totalCost= Peak_Long_Beach * numberOfTickets;
                        else if (selTime==1) totalCost= nonPeak_Long_Beach *numberOfTickets;
                                 }
                  else {
                               if (selTime==0) totalCost= Peak_Fire_Island * numberOfTickets;
                          else if (selTime==1) totalCost=nonPeak_Fire_Island * numberOfTickets;
                       }
                subTotal = totalCost + (totalCost * Tax_Rate);
                DecimalFormat currency = new DecimalFormat("$###,###.00");
                result.setText("Cost for " + TimeChoice + DestChoice + " is " + currency.format(subTotal));
                }}
        });
    }}
