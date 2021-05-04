//By Amalan Tharmarasa
package com.example.student.vesselbyamalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Fare extends AppCompatActivity {

    double initial_busTicket = 40, Tax_Rate=0.08875, Ex =5, Lu=7, Pe=3, Ve =0.02;
    int numberOfBusTicket;
    double TotalCost, subTotal;
    int numberOfBusTicketint;
    String ServiceChoice, TimeChoice, RouteChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText TicketOfBus = (EditText) findViewById(R.id.BusTickets);
        final RadioButton Express = (RadioButton) findViewById(R.id.RExpress);
        final RadioButton Regular = (RadioButton) findViewById(R.id.Rregular);
        final RadioButton Peak = (RadioButton) findViewById(R.id.Rpeak);
        final RadioButton NonPeak = (RadioButton) findViewById(R.id.Rnonpeak);
        final RadioButton Luxury = (RadioButton) findViewById(R.id.Rluxury);
        final RadioButton Ordinary = (RadioButton) findViewById(R.id.Rordinary);
        final CheckBox Veteran = (CheckBox) findViewById(R.id.Rveteran);

        final TextView result = ((TextView) findViewById(R.id.txtResultBus));

        ImageButton button_Bus =(ImageButton)findViewById(R.id.btnBusCost);
        button_Bus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String ticketStr = TicketOfBus.getText(). toString();
                if (ticketStr.equals(""))  { Toast.makeText( Fare.this, "Enter Number of Bus Tickets", Toast.LENGTH_LONG).show(); return;}
                numberOfBusTicketint = (int) Double.parseDouble(TicketOfBus.getText().toString());

                DecimalFormat currency = new DecimalFormat( "$###,###.00");

                numberOfBusTicketint = Integer.parseInt(TicketOfBus.getText().toString());

                if (Veteran.isChecked()) {
                     if (Express.isChecked()){
                         if (Peak.isChecked()){
                             if (Luxury.isChecked()){ TotalCost = (initial_busTicket- (initial_busTicket * Ve)) +Ex+ Pe + Lu;}
                             else if (Ordinary.isChecked()) {TotalCost = (initial_busTicket- (initial_busTicket * Ve)) + Pe + Ex;}}


                         else if (NonPeak.isChecked()) {
                             if (Luxury.isChecked()){ TotalCost = (initial_busTicket- (initial_busTicket * Ve))+Ex + Lu;}
                             else if (Ordinary.isChecked()) {TotalCost = (initial_busTicket- (initial_busTicket * Ve)) + Ex;}}
                     }

                  else if (Regular.isChecked()){
                         if (Peak.isChecked()){
                             if (Luxury.isChecked()){ TotalCost = (initial_busTicket- (initial_busTicket * Ve)) + Pe+ Lu;}
                             else if (Ordinary.isChecked()) {TotalCost = (initial_busTicket- (initial_busTicket * Ve)) + Pe;}}


                         else if (NonPeak.isChecked()) {
                             if (Luxury.isChecked()){ TotalCost = (initial_busTicket- (initial_busTicket * Ve)) + Lu ;}
                             else if (Ordinary.isChecked()) {TotalCost = (initial_busTicket- (initial_busTicket * Ve));}}
                     }

             }

    else {
                    if (Express.isChecked()){
                        if (Peak.isChecked()){
                            if (Luxury.isChecked()){ TotalCost =  + initial_busTicket +Ex + Pe+ Lu;}
                            else if (Ordinary.isChecked()) {TotalCost =  initial_busTicket + Pe+ Ex;}}


                        else if (NonPeak.isChecked()) {
                            if (Luxury.isChecked()){ TotalCost = + initial_busTicket +Ex + Lu;}
                            else if (Ordinary.isChecked()) {TotalCost =  initial_busTicket +Ex ;}}
                    }

                    else if (Regular.isChecked()){
                        if (Peak.isChecked()){
                            if (Luxury.isChecked()){ TotalCost =  initial_busTicket + Pe + Lu ;}
                            else if (Ordinary.isChecked()) {TotalCost =  initial_busTicket + Pe;}}


                        else if (NonPeak.isChecked()) {
                            if (Luxury.isChecked()){ TotalCost =  initial_busTicket +Lu ;}
                            else if (Ordinary.isChecked()) {TotalCost =  initial_busTicket;}}
                    }
                }
                subTotal= TotalCost + (TotalCost * Tax_Rate);
                result.setText("Cost for " + TicketOfBus.getText().toString()+ "  Tickets is   " + currency.format(subTotal));

            }


    });


        ImageButton button_home =(ImageButton)findViewById(R.id.btnFHome);
        button_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Fare.this, VesselList.class));
            }
        });
}}
