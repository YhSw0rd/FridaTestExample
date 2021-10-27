package com.example.fridatestexample.lv.lv1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fridatestexample.lv.LvActivity;
import com.example.fridatestexample.R;

public class Lv1Activity extends LvActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv1);
        EditText usernameEditText = findViewById(R.id.login_username);
        EditText loginpasswordEditText = findViewById(R.id.login_password);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = loginpasswordEditText.getText().toString();
                if( "admin".equals(username)  && "beinicaiduile".equals(password)){
                    Toast.makeText(Lv1Activity.this,"密码正确",Toast.LENGTH_LONG).show();
                    finish();
                }else{
                    Toast.makeText(Lv1Activity.this,"密码不对",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}