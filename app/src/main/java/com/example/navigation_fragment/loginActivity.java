package com.example.navigation_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {



    Button btn_dangki ,btn_dangnhap;
    private EditText user,pass;
    String kt_username= "Vy";
    String kt_password= "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

//
//        btn_dangnhap = (Button) findViewById(R.id.btn_dangnhap);
//        btn_dangnhap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                if(TextUtils.isEmpty(user.getText().toString()) || TextUtils.isEmpty(pass.getText().toString())){
////                    Toast.makeText(loginActivity.this, "Bạn chưa điền. Mời nhập lại",Toast.LENGTH_LONG).show();
////                } else if(user.getText().toString().equals(kt_username)){
////                    if(pass.getText().toString().equals(kt_password)){
////                        Toast.makeText(loginActivity.this, "Đăng nhập thành công",Toast.LENGTH_LONG).show();
////                        open(view);
////                    }else{
////                        Toast.makeText(loginActivity.this, "Sai tên đăng nhập hoặc mật khẩu. Nhập lại",Toast.LENGTH_LONG).show();
////                    }
////                }
////                else{
////                    Toast.makeText(loginActivity.this, "Sai tên đăng nhập hoặc mật khẩu. Nhập lại",Toast.LENGTH_LONG).show();
////                }
//                Intent intent = new Intent(, loginActivity.class);
//                startActivity(intent);
//
//            }
//        });
//        user=(EditText) findViewById(R.id.user);
//        pass=(EditText) findViewById(R.id.pass);
//
//        btn_dangki = (Button) findViewById(R.id.btn_dangki);
//        btn_dangki.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openSignUp(view);
//            }
//        });
//
//    }
//    void open(View v) {
//        Intent dsp = new Intent(this,MainActivity.class);
//        startActivity(dsp);
//    }
//
//    void openSignUp(View v) {
//        Intent intent = new Intent(this, loginActivity.class);
//        startActivity(intent);
//    }

        Button create1= (Button) findViewById(R.id.dkii);
        create1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),Signup.class);
                startActivity(intent);
            }
        });
}}