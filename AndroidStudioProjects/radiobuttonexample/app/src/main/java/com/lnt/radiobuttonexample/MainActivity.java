package com.lnt.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton one, two, three;
    Button submit;

    String selectedAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (RadioButton) findViewById(R.id.one);
        two = (RadioButton) findViewById(R.id.two);
        three = (RadioButton) findViewById(R.id.three);

        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {

                if (one.isChecked()) {

                    selectedAlbum = one.getText().toString();
                } else if (two.isChecked()) {

                    selectedAlbum = two.getText().toString();
                } else if (three.isChecked()) {

                    selectedAlbum = three.getText().toString();
                }

                Toast.makeText(getApplicationContext(), selectedAlbum, Toast.LENGTH_LONG).show();

            }
        });
    }

}