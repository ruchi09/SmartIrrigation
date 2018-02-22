package com.example.lenovo.smartirrigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CropCategory extends AppCompatActivity {

    ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_category);


        i1=(ImageView)findViewById(R.id.im1);
        i2=(ImageView)findViewById(R.id.im2);
        i3=(ImageView)findViewById(R.id.im3);
        i4=(ImageView)findViewById(R.id.im4);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Fruits",Toast.LENGTH_SHORT).show();
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vegetables",Toast.LENGTH_SHORT).show();
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Grains",Toast.LENGTH_SHORT).show();
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Others",Toast.LENGTH_SHORT).show();
            }
        });


    }






}
