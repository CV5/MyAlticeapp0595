package com.myalticeapp.myalticeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Christian on 2018-04-14.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, ArrayList<User> User) {

        super(context, 0, User);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_users, parent, false);
        }

        TextView textName = convertView.findViewById(R.id.textName);
        TextView textLastName = convertView.findViewById(R.id.textLastname);
        textLastName.setText(user.getLastName());
        textName.setText(user.getName());


        return convertView;
    }
}
