package com.example.student.medicalcalculatorbyamalan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Objects;

public class Med_Calculator extends AppCompatActivity {
    double conversionRate = 2.2;
    double weightEntered;
    double convertedWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med__calculator);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText weight = (EditText) findViewById(R.id.txtWeight);
        final RadioButton lbToKilo = (RadioButton) findViewById(R.id.radLbToKilo);
        final RadioButton kiloTolb = (RadioButton) findViewById(R.id.radKiloToLb);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button convert = (Button) findViewById(R.id.btnConver);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String weightStr = weight.getText(). toString();
                if (weightStr.equals(""))  { Toast.makeText( Med_Calculator.this, "Must enter a weight", Toast.LENGTH_LONG).show(); return;}
                weightEntered =Double.parseDouble(weight.getText().toString());
                DecimalFormat tenth = new DecimalFormat("#.#");

                if(lbToKilo.isChecked( )){
                    if (weightEntered <=500 ){
                        convertedWeight = weightEntered / conversionRate;
                        result.setText(tenth.format(convertedWeight) + " kilograms");   }
                    else { Toast.makeText(Med_Calculator.this, "Pounds must to be less than 500", Toast.LENGTH_LONG).show();                    }
                    }
                if (kiloTolb.isChecked( )) {
                    if (weightEntered <=225) {
                        convertedWeight = weightEntered * conversionRate;
                        result.setText(tenth.format(convertedWeight) + " pounds");                                             }

                       else { Toast.makeText(Med_Calculator.this, "Kilos must to be less than 255", Toast.LENGTH_LONG).show();                             }
                 }

            }
        });

    }
}
