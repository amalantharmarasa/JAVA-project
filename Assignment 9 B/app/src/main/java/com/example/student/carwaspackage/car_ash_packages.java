//By: Amalan Tharmarasa

package com.example.student.carwaspackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class car_ash_packages extends AppCompatActivity {
    double Extrior = 10.99;
    double Exterior_12plus = 8.99;
    double Exterio_with_Vacuum = 15.99;
    double Exterio_with_Vacuum_12plus = 12.99;
    double NumbEntrd;
    double priceOfPckage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_ash_packages);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText wash = (EditText) findViewById(R.id.txtNumber);
        final RadioButton Extrio_only =(RadioButton) findViewById(R.id.radEx);
        final RadioButton Extrior_withVac = (RadioButton)findViewById(R.id.radExwVac);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button packag = (Button) findViewById(R.id.btnCalculate);
            packag.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String washStr =wash.getText().toString();
                    if (washStr.equals("")){
                        Toast.makeText(car_ash_packages.this, "Must Enter Number of Wash!", Toast.LENGTH_LONG).show(); return;}
                        NumbEntrd=Double.parseDouble(wash.getText().toString());
                    DecimalFormat tenth = new DecimalFormat("$ 0.00");


                    if (Extrio_only.isChecked()){
                         if (NumbEntrd <=12){
                             priceOfPckage = NumbEntrd * Extrior;
                                                Toast.makeText(car_ash_packages.this, "Buy 12+ to receive discount!", Toast.LENGTH_LONG).show();}
                             else { priceOfPckage = NumbEntrd * Exterior_12plus;}

                    }

                    if (Extrior_withVac.isChecked()){
                        if (NumbEntrd <=12) {
                            priceOfPckage = NumbEntrd * Exterio_with_Vacuum;
                                                 Toast.makeText(car_ash_packages.this, "Buy 12+ to receive discount!", Toast.LENGTH_LONG).show();}
                             else  { priceOfPckage = NumbEntrd * Exterio_with_Vacuum_12plus;}
                    }







                    result.setText(tenth.format(priceOfPckage) + " for "+ wash.getText().toString() +" washes");

                }
            }));
    }
}
