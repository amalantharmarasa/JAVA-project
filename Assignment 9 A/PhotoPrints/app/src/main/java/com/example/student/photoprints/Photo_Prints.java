// by Amalan Tharmarasa
package com.example.student.photoprints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Photo_Prints extends AppCompatActivity {
    double four_x_six =0.19;
    double five_x_seven =0.49;
    double eight_x_ten =0.79;
    double photoEntered;
    double priceOfphoto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo__prints);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText photo = (EditText) findViewById(R.id.txtPhoto);
        final RadioButton fo_sx = (RadioButton) findViewById(R.id.rad4x9);
        final RadioButton fi_se = (RadioButton) findViewById(R.id.rad5x7);
        final RadioButton eg_tn = (RadioButton) findViewById(R.id.rad8x10);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button prints = (Button) findViewById(R.id.btnPrints);

            prints.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String photoStr =photo.getText().toString();
                    if (photoStr.equals("")) { Toast.makeText(Photo_Prints.this, "Enter Number of Prints", Toast.LENGTH_LONG).show();return;}
                    photoEntered=Double.parseDouble(photo.getText().toString());
                    DecimalFormat tenth = new DecimalFormat("$ 0.00");


                    if (fo_sx.isChecked()) {
                         if (photoEntered <=50){
                             priceOfphoto = photoEntered *four_x_six;}
                         else {Toast.makeText(Photo_Prints.this, "Please Enter less than 50", Toast.LENGTH_LONG).show();}
                         }

                    if (fi_se.isChecked()) {
                        if (photoEntered <=50){
                            priceOfphoto= photoEntered * five_x_seven;}
                        else {Toast.makeText(Photo_Prints.this, "Please Enter less than 50", Toast.LENGTH_LONG).show();}
                                            }

                    if (eg_tn.isChecked()){
                        if(photoEntered <=50){
                            priceOfphoto= photoEntered * eight_x_ten;}
                        else {Toast.makeText(Photo_Prints.this, "Please Enter less than 50", Toast.LENGTH_LONG).show();}
                                          }

                         result.setText("The order cost is "+ tenth.format(priceOfphoto));


                }
            }

            ));


    }
}
