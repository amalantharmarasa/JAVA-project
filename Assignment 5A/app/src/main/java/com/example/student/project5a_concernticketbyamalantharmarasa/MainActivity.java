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
    double costPerTickets=80.00;
    double Tax;
    double Total_Amound;
    int numberOfTickets;
    double total;
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
                total = costPerTickets * numberOfTickets;
                Tax = total * 0.08875;
                Total_Amound = costPerTickets * numberOfTickets + Tax;
                DecimalFormat currency = new DecimalFormat("$###,###.00");
                groupChoice = group.getSelectedItem().toString();
                //result.setText("Cost for " + groupChoice + " is " + currency.format(total));
               // result.setText("Tax for " + groupChoice + " is " + currency.format(Tax));
                result.setText("Total Cost for " + groupChoice + " is " + currency.format(Total_Amound));




            }
        });
    }
}
