package com.lnt.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import android.util.Log;

public class displaymessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymessage);

        Intent intent=getIntent();

        String msg=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView tv=findViewById(R.id.textView);

        tv.setText(msg);

    }


}