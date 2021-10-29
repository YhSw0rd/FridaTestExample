package com.example.fridatestexample.lv.lv6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fridatestexample.R;

public class Lv6Activity extends AppCompatActivity {

    static{
        System.loadLibrary("lv6");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv6);

        TextView lv6TextView = findViewById(R.id.lv6_text_view);
        Button lv6Button = findViewById(R.id.lv6_button);
        lv6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pid = android.os.Process.myPid();
                lv6TextView.setText("进程ID:"+pid);
                if(isDebuging(pid)){
                    Toast.makeText(Lv6Activity.this,"检测到调试",Toast.LENGTH_LONG).show();
                    return;
                }else{
                    Toast.makeText(Lv6Activity.this,"未检测到调试",Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }

    private native boolean isDebuging(int pid);
}