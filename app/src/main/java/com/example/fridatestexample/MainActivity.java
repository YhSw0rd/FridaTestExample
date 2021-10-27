package com.example.fridatestexample;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fridatestexample.lv.Lv;
import com.example.fridatestexample.lv.lv1.Lv1;
import com.example.fridatestexample.lv.lv2.Lv2;
import com.example.fridatestexample.lv.lv3.Lv3;
import com.example.fridatestexample.lv.lv4.Lv4;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private ArrayList<Lv> lvArrayList = new ArrayList<Lv>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLvArrayList();
        LvAdapter lvAdapter = new LvAdapter(this,R.layout.lv_item,this.lvArrayList);
        GridView gridView = findViewById(R.id.lv_grid);
        gridView.setAdapter(lvAdapter);

    }


    private void initLvArrayList(){
        lvArrayList.add(new Lv1());
        lvArrayList.add(new Lv2());
        lvArrayList.add(new Lv3());
        lvArrayList.add(new Lv4());
    }
}