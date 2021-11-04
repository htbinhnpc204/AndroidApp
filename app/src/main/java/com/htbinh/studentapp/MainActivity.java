package com.htbinh.studentapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.htbinh.studentapp.Activity.HomePageActivity;

public class MainActivity extends AppCompatActivity {
    Dialog dialog;
    EditText tk, mk;
    CheckBox rememberMeCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();

        SharedPreferences sharedPreferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String rememberMeText = sharedPreferences.getString("remember","");

        if(rememberMeText.equals("true")){
            goToHome();
        }

        rememberMeCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(compoundButton.isChecked()){
                    SharedPreferences sharedPreferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("remember", "true");
                    editor.apply();
                }else{
                    SharedPreferences sharedPreferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("remember", "false");
                    editor.apply();
                }

            }
        });

    }

    private void Mapping(){
        tk = findViewById(R.id.edUser);
        mk = findViewById(R.id.edPass);
        rememberMeCheck = findViewById(R.id.cbSave);
    }

    public void doForgot(View v){
        openDialog();
    }

    private void openDialog(){
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dia_forgot);

        Window window = dialog.getWindow();

        if(window == null){
            return;
        }

        window.setWindowAnimations(R.style.AnimationForCustomDialog);
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams params = window.getAttributes();
        params.gravity = Gravity.CENTER;

        window.setAttributes(params);

        dialog.show();
    }


    public void Close(View v) {
        dialog.dismiss();
    }

    private void goToHome(){
        Intent in = new Intent(MainActivity.this, HomePageActivity.class);
        startActivity(in);
    }

    public void doLogin(View v){
        goToHome();
    }
}