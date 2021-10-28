package com.example.fridatestexample.lv.lv5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fridatestexample.R;
import com.example.fridatestexample.lv.LvActivity;
import com.example.fridatestexample.lv.lv3.Lv3Activity;

public class Lv5Activity extends LvActivity {
    static{
        System.loadLibrary("lv5");
    }
    private String checkString = "checkStringCheckString";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv5);
        TextView lv5TextView = findViewById(R.id.lv5_text_view);
        lv5TextView.setText(this.checkString);
        Button lv5Button = findViewById(R.id.lv5_button);
        lv5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( !isSameString(Lv5Activity.this.checkString)){
                    Toast.makeText(Lv5Activity.this,"字符串发生修改",Toast.LENGTH_LONG).show();
                    finish();
                }else{
                    Toast.makeText(Lv5Activity.this,"字符串未发生修改",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private native boolean isSameString(String str);
}