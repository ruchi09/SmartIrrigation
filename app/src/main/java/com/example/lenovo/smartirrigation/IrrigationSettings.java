package com.example.lenovo.smartirrigation;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class IrrigationSettings extends AppCompatActivity {

    ToggleButton tb;
    Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irrigation_settings);


        tb = (ToggleButton)findViewById(R.id.toggleButton);
        sw = (Switch)findViewById(R.id.switch1);




        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(getApplicationContext(),"Automatic mode on",Toast.LENGTH_SHORT).show();
                    tb.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.Enabled));

                }

                else
                    Toast.makeText(getApplicationContext(),"Automatic mode off",Toast.LENGTH_SHORT).show();
                tb.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.Disabled));
            }
        });
    }
}
