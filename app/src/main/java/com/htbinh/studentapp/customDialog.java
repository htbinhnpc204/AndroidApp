package com.htbinh.studentapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ImageButton;

public class customDialog extends Dialog{

    public Activity c;
    public ImageButton btnClose;

    public customDialog(Activity a) {
        super(a);
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_forgot);
        btnClose = findViewById(R.id.btnClose);
    }
}
