package com.lnt.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    DatePicker simpleDatePicker;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    simpleDatePicker=(DatePicker)findViewById(R.id.DatePicker);

    submit=(Button)findViewById(R.id.submit);

    submit.setOnClickListener(new View.OnClickListener()

    {

        @Override
        public void onClick (View v){


        String day = "Day=" + simpleDatePicker.getDayOfMonth();
        String month = "Mth=" + (simpleDatePicker.getMonth()+1);

        String year = "Year" + simpleDatePicker.getYear();

        Toast.makeText(getApplicationContext(), day + "\n" + year, Toast.LENGTH_LONG).show();

    }
    });



}

    }


