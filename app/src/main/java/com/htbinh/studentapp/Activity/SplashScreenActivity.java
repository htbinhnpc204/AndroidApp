package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;


import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.htbinh.studentapp.MainActivity;
import com.htbinh.studentapp.R;

import javax.net.ssl.HandshakeCompletedEvent;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView main;
    TextView name;

    Animation topAnim, botAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        main = findViewById(R.id.imageView);
        name = findViewById(R.id.appName);

        main.setAnimation(topAnim);
        name.setAnimation(botAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(in);
                finish();
            }
        },3000);

    }
}