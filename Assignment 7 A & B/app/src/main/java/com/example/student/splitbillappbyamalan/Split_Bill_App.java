//by Amalan Tharmarasa
package com.example.student.splitbillappbyamalan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Split_Bill_App extends AppCompatActivity {
    final double Excellent = 0.20;
    final double Average = 0.15;
    final double Poor = 0.1;

    double amount;
    int numPeople;
    double otherTipAmt;
    double totalCost;
    double costPerPerson;
    String payPerPersonStr;
    String billamount;
    String numofPeople;
    String otherTipamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split__bill__app);

        final EditText billAmount = (EditText)findViewById(R.id.txtAmount);
        final Spinner tip = (Spinner)findViewById(R.id.txtTip);
        final EditText people = (EditText)findViewById(R.id.txtPeople);
        final EditText otherTip = (EditText)findViewById(R.id.txtOtherTip);
        final TextView result = (TextView)findViewById(R.id.txtResult);

        Button cost = (Button)findViewById(R.id.btnSplitBill);
        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                billamount = billAmount.getText().toString();
                if (billamount.equals("")) billamount ="0";
                amount = Double.parseDouble(billamount);

                numofPeople = people.getText().toString();
                if (numofPeople.equals("")) numofPeople ="0";
                numPeople = Integer.parseInt(numofPeople);

                otherTipamount=otherTip.getText().toString();
                if (otherTipamount.equals("")) otherTipamount ="0";
                otherTipAmt = Double.parseDouble(otherTipamount);

                long tipSel = tip.getSelectedItemId();

                double tipPercent;

                if (tipSel == 0) {
                    tipPercent = Excellent;}

                else if (tipSel == 1){
                    tipPercent = Average;}

                else if (tipSel==2){
                    tipPercent = Poor;}

                else{
                    tipPercent = otherTipAmt / 100.0;}

                if (tipSel!=3) {otherTip.setText("");}

                totalCost = amount + amount * tipPercent;

                costPerPerson =  totalCost / numPeople;

                DecimalFormat currency = new DecimalFormat("$###,##0.00");
                payPerPersonStr = currency.format(costPerPerson);

                result.setText("Each person should pay " +payPerPersonStr+".");

            }

        });
    }
}


