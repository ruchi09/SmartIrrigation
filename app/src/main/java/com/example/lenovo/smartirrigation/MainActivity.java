package com.example.lenovo.smartirrigation;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView profile,irrigation,crop,prices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        profile = (ImageView)findViewById(R.id.profile);
        irrigation = (ImageView)findViewById(R.id.irrigation);
        crop = (ImageView)findViewById(R.id.crop);
        prices = (ImageView)findViewById(R.id.selling);


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"profile",Toast.LENGTH_SHORT).show();
            }
        });



        irrigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Irrigation setting",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),IrrigationSettings.class);
                startActivity(intent);
            }
        });



        crop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"crop selection",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),CropCategory.class);
                startActivity(intent);


            }
        });


        prices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"view current prices",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
