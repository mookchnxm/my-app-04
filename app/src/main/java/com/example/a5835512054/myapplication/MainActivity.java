package com.example.a5835512054.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText h,w;
    private TextView output;
    private ConstraintLayout layout;
    public Button btm ;
    public Switch sw ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h = findViewById(R.id.height);
        w = findViewById(R.id.weight);
        output = findViewById(R.id.bmi);
        btm = findViewById(R.id.cal);
        sw = findViewById(R.id.switch1);
        sw.setChecked(true);
        layout = findViewById(R.id.main);



        btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double height = Double.parseDouble(h.getText().toString());
                double weight = Double.parseDouble(w.getText().toString());

                double height_to_mater = (height/100);
                double result = weight / (height_to_mater * height_to_mater);
                String result_string = Double.toString(result);

                output.setText(result_string);
            }
        });
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw.isChecked() ){

                    layout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else{
                    layout.setBackgroundColor(Color.parseColor("#f9cdcd"));
                }
            }
        });
    }

}
