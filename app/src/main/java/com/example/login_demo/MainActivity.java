package com.example.login_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText_username;
    private EditText mEditText_password;
    private Button mButton_login;
    private Button mButton_enroll;
    private String str_username;
    private String str_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText_username = findViewById(R.id.Edit_username);
        mEditText_password = findViewById(R.id.Edit_password);
        mButton_enroll = findViewById(R.id.btn_enroll);
        mButton_login = findViewById(R.id.btn_login);

        mButton_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_username = mEditText_username.getText().toString();
                str_password = mEditText_password.getText().toString();
                if(str_username.length()<3){
                    Toast.makeText(MainActivity.this,"用户名不能少于3个字符",Toast.LENGTH_LONG).show();
                }else if(str_password.length()<4){
                    Toast.makeText(MainActivity.this,"密码不能少于4位",Toast.LENGTH_LONG).show();
                }else if(str_username.equals("mandy")&&str_password.equals("12345")){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,welcome.class);
                    MainActivity.this.startActivity(intent);
                }
            }
        });
    }
}