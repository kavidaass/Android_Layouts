package com.example.app.androidlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }

    public  void goNextScreen(View v){
        startActivity(new Intent(FrameActivity.this, GridActivity.class));
    }
}
