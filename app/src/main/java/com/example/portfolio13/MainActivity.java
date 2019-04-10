package com.example.portfolio13;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout layout = findViewById(R.id.frameLayout);

        //Create bounce surface view
        BounceSurfaceView bounceSurfaceView = new BounceSurfaceView(this, null);

        //Add surface view to frame layout
        layout.addView(bounceSurfaceView);

    }



}
