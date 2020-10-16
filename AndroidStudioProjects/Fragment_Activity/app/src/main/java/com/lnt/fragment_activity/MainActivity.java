package com.lnt.fragment_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);

        button2=(Button)findViewById(R.id.button2);

        final Bundle bundle=new Bundle();

        bundle.putString("message","from activity to fragment");

       button.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v) {

                loadFragment(new Fragment1());

        }

        });

       button2.setOnClickListener(new View.OnClickListener(){

           @Override

        public void onClick(View v) {


               loadFragment(new Fragment2());

               Fragment1 fragobj = new Fragment1();

               fragobj.setArguments(bundle);

               Log.d("Main activity", bundle.toString());

           }
           });

    }

    private void loadFragment(Fragment fragment) {
        //create a fragment manager
        FragmentManager manager=getFragmentManager();
        //create the fragment transaction
        FragmentTransaction fd=manager.beginTransaction();
        fd.replace(R.id.frameLayout,fragment);
        fd.commit();

    }

    private int add(Fragment fragment)


}

