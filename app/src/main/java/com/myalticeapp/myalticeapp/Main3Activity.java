package com.myalticeapp.myalticeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);


        ArrayList<User> list = new ArrayList<>();
        UserAdapter userAdapter = new UserAdapter(this,list);


        for (int i =0; i < 5; i++){
            userAdapter.add(new User("Cristian ","Veras "+i));


        }
        ListView listView = findViewById(R.id.listview1);
        listView.setAdapter(userAdapter);
    }
}
