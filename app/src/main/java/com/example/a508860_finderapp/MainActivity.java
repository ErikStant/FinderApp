package com.example.a508860_finderapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    String msg = "LOG:";
    @Override
    protected void onCreate(Bundle savedInstance){
        Log.d(msg,"On create called");
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);
    }

}