package com.example.fridatestexample.lv;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LvActivity extends AppCompatActivity {
    protected Lv lvState ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String className = this.getClass().getName();
        try {
            Class clazz = Class.forName(className.replace("Activity","State"));
            lvState = (Lv) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
