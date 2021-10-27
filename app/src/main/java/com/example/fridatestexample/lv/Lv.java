package com.example.fridatestexample.lv;

import android.content.Intent;
import android.view.View;




public abstract class Lv {
    protected Class lvClass;

    protected View.OnClickListener clickListener;

    public Lv(){
        this.lvClass = this.getClass();
    }
    public abstract String getName();



    public String getLv(){
        Class clazz = getClass();
        String packageName = clazz.getPackage().getName();
        String[] packageNames = packageName.split("\\.");
        char[] chars = packageNames[packageNames.length - 1].toCharArray();
        chars[0] = (char)(chars[0]^32);
        return String.valueOf(chars);
    }

    public  View.OnClickListener getClickListener(){
        return this.clickListener = this.clickListener == null ?new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String className = Lv.this.lvClass.getName();
                    Class clazz = Class.forName(String.format("%sActivity", className));
                    Intent intent = new Intent();
                    intent.setClass(view.getContext(),clazz);
                    view.getContext().startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }:this.clickListener;
    }
}
