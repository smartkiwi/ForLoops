package com.example.vvlad.forloops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "MyData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i <= 100; i++) {
            Log.i(TAG, "Loop " + Integer.toString(i));
        }
        setContentView(R.layout.activity_main);
    }
}
