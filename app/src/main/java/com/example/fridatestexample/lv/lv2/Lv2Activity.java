package com.example.fridatestexample.lv.lv2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fridatestexample.R;
import com.example.fridatestexample.lv.LvActivity;

public class Lv2Activity extends LvActivity {
    static {
        System.loadLibrary("lv2");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv2);
        EditText usernameEditText = findViewById(R.id.login_username2);
        EditText loginpasswordEditText = findViewById(R.id.login_password2);
        Button loginButton = findViewById(R.id.login_button2);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = loginpasswordEditText.getText().toString();
                if( getUsername().equals(username)  && getPassword().equals(password)){
                    Toast.makeText(Lv2Activity.this,"密码正确",Toast.LENGTH_LONG).show();
                    finish();
                }else{
                    Toast.makeText(Lv2Activity.this,"密码不对",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private String getUsername(){
        return getNativeUsername();
    }

    private native String getNativeUsername();

    private String getPassword(){
        return getNativePassword();
    }

    private native String getNativePassword();


}