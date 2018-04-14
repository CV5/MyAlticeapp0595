package com.myalticeapp.myalticeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonLinearV = findViewById(R.id.linearlayoutvertical);
        Button buttonLinearH = findViewById(R.id.linearlayouthorizontal);
        Button buttonRelative = findViewById(R.id.relativelayout);
        Button buttonTable = findViewById(R.id.tablelayout);
        Button buttonFrame = findViewById(R.id.framelayout);
        Button buttonList = findViewById(R.id.listview);
        Button buttonGrid = findViewById(R.id.gridview);
//        Button buttonLinear = findViewById(R.id.linearlayoutvertical);


        buttonLinearV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), Main2Activity.class);
                linear.putExtra("LvKey", R.layout.activity_main2);
                startActivity(linear);
            }
        });

        buttonLinearH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), Main2Activity.class);
                linear.putExtra("LvKey", R.layout.horizontal);
                startActivity(linear);
            }
        });
        buttonRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), Main2Activity.class);
                linear.putExtra("LvKey", R.layout.relative);
                startActivity(linear);
            }
        });

        buttonTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), Main2Activity.class);
                linear.putExtra("LvKey", R.layout.table);
                startActivity(linear);
            }
        });

        buttonFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), Main2Activity.class);
                linear.putExtra("LvKey", R.layout.framelayout);
                startActivity(linear);
            }
        });

        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(linear);
            }
        });
        buttonGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), GridViewActivity.class);
                startActivity(linear);
            }
        });
    }
}
