package com.example.fridatestexample.util;


import android.content.Context;
import android.content.SharedPreferences;

public class LvSharePreferenceUtil {

    private static final String FILE_NAME = "Lv";

    public static SharedPreferences getSharePreferences(Context context){
        return context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }

    public static void putParam(Context context , String key , boolean value){
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(key,value);
        editor.commit();
    }
    // 如果没有对应值就是返回false
    public static boolean getParam(Context context , String key ){
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key,false);
    }
}
