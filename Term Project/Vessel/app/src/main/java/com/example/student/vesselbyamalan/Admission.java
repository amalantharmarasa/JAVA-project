//By Amalan Tharmarasa
package com.example.student.vesselbyamalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Admission extends AppCompatActivity {
    final double initial_price = 50,p1=2, p2=3, p3=4, d1=0.02,d2=0.03, d3= 0.04, Tax_Rate=0.08875;
    int numberOfTicket;
    double TotalCost, subTotal;
    String TimeChoice, DayChoice, PlaceChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        final EditText tickets = (EditText) findViewById(R.id.txtTickets);


        final Spinner Place = (Spinner) findViewById(R.id.txtPlace);
        final Spinner Day = (Spinner) findViewById(R.id.txtDay);
        final Spinner Time = (Spinner) findViewById(R.id.txtTime);

        ImageButton button_ADRep =(ImageButton)findViewById(R.id.btnADReceipt);
        button_ADRep.setOnClickListener(new View.OnClickListener() {
        final TextView result = ((TextView) findViewById(R.id.txtResult));
            @Override
            public void onClick(View view) {
                String weightStr = tickets.getText(). toString();
                if (weightStr.equals(""))  { Toast.makeText( Admission.this, "Enter Number of Tickets", Toast.LENGTH_LONG).show(); return;}
                numberOfTicket = (int) Double.parseDouble(tickets.getText().toString());

                numberOfTicket = Integer.parseInt(tickets.getText().toString());


                PlaceChoice = Place.getSelectedItem().toString();
                DayChoice = Day.getSelectedItem().toString();
                TimeChoice = Time.getSelectedItem().toString();

                DecimalFormat currency = new DecimalFormat( "$###,###.00");

                long selPlace = Place.getSelectedItemId();
                long selDay = Day.getSelectedItemId();
                long selTime = Time.getSelectedItemId();{

                        if (selPlace == 0)
                              {
                                  if (selDay == 0){
                                              if (selTime ==0) TotalCost = p1 + ( d1* initial_price) + numberOfTicket * initial_price ;
                                         else if (selTime ==1) TotalCost = p1 + 2 + (d1 * initial_price) +  numberOfTicket * initial_price;
                                                  }
                             else if (selDay == 1) {
                                              if (selTime ==0) TotalCost = p1  + (d2 * initial_price) +  numberOfTicket * initial_price;
                                         else if (selTime ==1) TotalCost = p1 + 2 + (d2 * initial_price) +  numberOfTicket * initial_price ;
                                                        }
                             else if (selDay == 2) {
                                               if (selTime ==0) TotalCost = p1 +  (d3 * initial_price) +  numberOfTicket * initial_price;
                                          else if (selTime ==1) TotalCost = p1 + 2 + (d3 * initial_price) +  numberOfTicket * initial_price;
                                  }
                                                       }
                        else if (selPlace == 1) {
                            if (selDay == 0){
                                if (selTime ==0) TotalCost = p2 + ( d1* initial_price) + numberOfTicket * initial_price;
                                else if (selTime ==1) TotalCost = p2 + 2 + (d1 * initial_price) +  numberOfTicket * initial_price;
                            }
                            else if (selDay == 1) {
                                if (selTime ==0) TotalCost = p2  + (d2 * initial_price) +  numberOfTicket * initial_price;
                                else if (selTime ==1) TotalCost = p2 + 2 + (d2 * initial_price) +  numberOfTicket * initial_price ;
                            }
                            else if (selDay == 2) {
                                if (selTime ==0) TotalCost = p2 +  (d3 * initial_price) +  numberOfTicket * initial_price;
                                else if (selTime ==1) TotalCost = p2 + 2 + (d3 * initial_price) +  numberOfTicket * initial_price;
                            }

                        }
                        else if (selPlace == 2) {
                            if (selDay == 0){
                                if (selTime ==0) TotalCost = p3 + ( d1* initial_price) + numberOfTicket * initial_price;
                                else if (selTime ==1) TotalCost = p3 + 2 + (d1 * initial_price) +  numberOfTicket * initial_price;
                            }
                            else if (selDay == 1) {
                                if (selTime ==0) TotalCost = p3  + (d2 * initial_price) +  numberOfTicket * initial_price;
                                else if (selTime ==1) TotalCost = p3 + 2 + (d2 * initial_price) +  numberOfTicket * initial_price ;
                            }
                            else if (selDay == 2) {
                                if (selTime ==0) TotalCost = p3 +  (d3 * initial_price) +  numberOfTicket * initial_price;
                                else if (selTime ==1) TotalCost = p3 + 2 + (d3 * initial_price) +  numberOfTicket * initial_price;
                            }

                        }

                        subTotal= TotalCost + (TotalCost * Tax_Rate);

                    result.setText("Cost for " + tickets.getText().toString()+ "  Tickets is   " + currency.format(subTotal));
                              }

                }
        });


        ImageButton button_home =(ImageButton)findViewById(R.id.btnHome);
        button_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admission.this, VesselList.class));
            }
        });
        }}
