package com.example.fridatestexample.lv.lv7;

import com.example.fridatestexample.lv.Lv;

public class Lv7 extends Lv {
    static {
        System.loadLibrary("lv7");
    }
    @Override
    public String getName() {
        return "动态注册";
    }

    public native String getPassword();
}
