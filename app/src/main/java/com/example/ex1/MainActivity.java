package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Created", Toast.LENGTH_LONG).show();
        Log.e(TAG, "exceptionCreate");
        Log.w(TAG, "warningCreate");
        Log.i(TAG, "infoCreate");
        Log.d(TAG, "degubCreate");
        Log.v(TAG, "verboseCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Destroyed", Toast.LENGTH_LONG).show();
        Log.e(TAG, "exceptionDestroy");
        Log.w(TAG, "warningDestroy");
        Log.i(TAG, "infoDestroy");
        Log.d(TAG, "degubDestroy");
        Log.v(TAG, "verboseDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Resumed", Toast.LENGTH_LONG).show();
        Log.e(TAG, "exceptionResume");
        Log.w(TAG, "warningResume");
        Log.i(TAG, "infoResume");
        Log.d(TAG, "degubResume");
        Log.v(TAG, "verboseResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Stopped", Toast.LENGTH_LONG).show();
        Log.e(TAG, "exceptionStop");
        Log.w(TAG, "warningStop");
        Log.i(TAG, "infoStop");
        Log.d(TAG, "degubStop");
        Log.v(TAG, "verboseStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Restarted", Toast.LENGTH_LONG).show();
        Log.e(TAG, "exceptionRestart");
        Log.w(TAG, "warningRestart");
        Log.i(TAG, "infoRestart");
        Log.d(TAG, "degubRestart");
        Log.v(TAG, "verboseRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_LONG).show();
        Log.e(TAG, "exceptionPause");
        Log.w(TAG, "warningPause");
        Log.i(TAG, "infoPause");
        Log.d(TAG, "degubPause");
        Log.v(TAG, "verbosePause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Started", Toast.LENGTH_LONG).show();
        Log.e(TAG, "exceptionStart");
        Log.w(TAG, "warningStart");
        Log.i(TAG, "infoStart");
        Log.d(TAG, "degubStart");
        Log.v(TAG, "verboseStart");
    }
}