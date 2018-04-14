package com.myalticeapp.myalticeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layout = getIntent().getIntExtra("LvKey", R.layout.no_found);
        setContentView(layout);
    }
}
