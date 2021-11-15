package com.example.fridatestexample.lv.lv7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.fridatestexample.R;

public class Lv7Activity extends AppCompatActivity {

    private Lv7 lv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv7);
        Button lv7Button = findViewById(R.id.lv7_button);
        lv7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Lv7Activity.this, lv7.getPassword(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}