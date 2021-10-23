package com.htbinh.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.htbinh.studentapp.Activity.HomePageActivity;

public class MainActivity extends AppCompatActivity {

    customDialog cdlg;
    EditText tk, mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();
    }

    private void Mapping(){
        tk = findViewById(R.id.txtUser);
        mk = findViewById(R.id.txtPass);
    }

    public void doForgot(View v){
        cdlg = new customDialog(MainActivity.this);
        cdlg.show();
    }

    public void Close(View v) {
        cdlg.dismiss();
    }

    public void doLogin(View v){
        String msv = tk.getText().toString().trim();
        String pass = mk.getText().toString().trim();
        if(msv.equals("admin") && pass.equals("admin")){
            Intent in = new Intent(MainActivity.this, HomePageActivity.class);
            startActivity(in);
        }
        else{
            Toast.makeText(getApplicationContext(), "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
        }
    }
}