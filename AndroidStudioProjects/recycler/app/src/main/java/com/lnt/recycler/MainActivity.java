package com.lnt.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> personNames=new ArrayList<>(Arrays.asList("Person 1","Person 2","Person 3","Person4","Person 5","Person 6","Person 7"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerview.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter =  new CustomAdapter(MainActivity.this,personNames);

        recyclerview.setAdapter(customAdapter);
    }
}