package com.lnt.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TimePicker simpleTimePicker;
    TextView time;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = (TextView) findViewById(R.id.time);
        simpleTimePicker = (TimePicker) findViewById(R.id.TimePicker);
    button=(Button)findViewById(R.id.button);
        simpleTimePicker.setIs24HourView(false);

        simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {

            @Override

            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {

                Toast.makeText(getApplicationContext(), hourOfDay + " " + minute, Toast.LENGTH_SHORT).show();

                time.setText("It's:" + hourOfDay + ":" + minute);
            }
        });



    button.setOnClickListener(new View.OnClickListener()

    {

    @Override

            public void onClick(View v){

       Intent intent=new Intent(MainActivity.this, MainActivity2.class);
       startActivity(intent);

    }
});

}


}


