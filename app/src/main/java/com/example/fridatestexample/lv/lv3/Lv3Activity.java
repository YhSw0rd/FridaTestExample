package com.example.fridatestexample.lv.lv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fridatestexample.R;

public class Lv3Activity extends AppCompatActivity {
    static {
        System.loadLibrary("lv3");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv3);

        EditText lv3_edit_text1 = findViewById(R.id.lv3_edit_text1);
        EditText lv3_edit_text2 = findViewById(R.id.lv3_edit_text2);
        Button lv3_button1 = findViewById(R.id.lv3_button1);
        Button lv3_button2 = findViewById(R.id.lv3_button2);
        Button lv3_button3 = findViewById(R.id.lv3_button3);
        lv3_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv3_edit_text1.setText(getLv3String(1));
            }
        });
        lv3_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv3_edit_text2.setText(getLv3String(false));
            }
        });
        lv3_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( getLv3String(1).equals(getLv3String(false))   ){
                    Toast.makeText(Lv3Activity.this,"字符串相等",Toast.LENGTH_LONG).show();
                    finish();
                }else{
                    Toast.makeText(Lv3Activity.this,"字符串不相等",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private native String getLv3String(int i);

    private native String getLv3String(boolean i);
}