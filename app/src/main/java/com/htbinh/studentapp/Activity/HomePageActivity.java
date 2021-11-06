package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.htbinh.studentapp.MainActivity;
import com.htbinh.studentapp.R;

import java.util.Map;

public class HomePageActivity extends AppCompatActivity {

    TextView name, msv, khoa, nganh, ngaySinh, lop;
    ConstraintLayout infoView, functionView;
    Animation topAnim, fade_inAnim;

    Dialog dialog;

    private void Mapping(){
        infoView = findViewById(R.id.infoArea);
        functionView = findViewById(R.id.functionArea);
        name = findViewById(R.id.name);
        msv = findViewById(R.id.name);
        khoa = findViewById(R.id.khoa);
        nganh = findViewById(R.id.nganh);
        ngaySinh = findViewById(R.id.dob);
        lop = findViewById(R.id.lop);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        fade_inAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Mapping();

        fade_inAnim.setStartOffset(topAnim.getDuration());

        infoView.startAnimation(topAnim);
        functionView.startAnimation(fade_inAnim);

    }

    public void doPersonalInfo(View v){
        openDialog();
    }

    private void openDialog(){
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dia_personal_infor);

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

    public void doUpdate(View v) {
        Toast toast = Toast.makeText(HomePageActivity.this, "Cập nhật thành công", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 20, 30);
        toast.show();
        dialog.dismiss();
    }

    public void tkb_Click(View v){
        Intent in = new Intent(HomePageActivity.this, ScheduleActivity.class);
        startActivity(in);
    }

    public void lichThi_Click(View v){
        Intent in = new Intent(HomePageActivity.this, LichThiActivity.class);
        startActivity(in);
    }

    public void ketQua_Click(View v){
        Intent in = new Intent(HomePageActivity.this, KetQuaActivity.class);
        startActivity(in);
    }

    public void thongBao_Click(View v){
        Intent in = new Intent(HomePageActivity.this, ThongBaoActivity.class);
        startActivity(in);
    }

    public void logout_Click(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("remember", "false");
        editor.apply();
        Intent in = new Intent(HomePageActivity.this, MainActivity.class);
        startActivity(in);
        finish();
    }
}