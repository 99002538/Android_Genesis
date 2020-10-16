package com.lnt.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;

import android.util.Log;

import android.view.View;

import android.view.Menu;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity{


private static final String HOME_ACTIVITY_TAG=MainActivity.class.getSimpleName();

private void showLog(String text){

Log.d(HOME_ACTIVITY_TAG,text);

}

@Override

protected void onCreate(Bundle savedInstanceState){

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

showLog("Activity created");
}
@Override

protected void onRestart(){

super.onRestart();

showLog("Activity restarted");

}
    @Override
    protected void onStart(){
        super.onStart();
        showLog( "Activity Started");
    }
    @Override
    protected void onResume(){
        super.onResume();
        showLog(  "Activity Resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();
        showLog( "Activity Paused");
    }
    @Override
    protected void onStop(){
        super.onStop();
        showLog("Activity Stoped");
    }
    @Override
    protected void onDestroy(){super.onDestroy();
       showLog("Activity Destroyed");
    }
}