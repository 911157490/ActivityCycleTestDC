package com.example.administrator.activitycycletestdc;

import android.content.Intent;
import android.nfc.Tag;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    Button buttonA;
    private String tag = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA = (Button) findViewById(R.id.buttonA);

        buttonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.v(tag,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(tag,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(tag,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(tag,"onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(tag,"onDestroy");
    }
}