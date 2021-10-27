package com.example.fridatestexample.lv.lv4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fridatestexample.R;

public class Lv4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv4);
    }

    private void callFinish(){
        finish();
    }
}