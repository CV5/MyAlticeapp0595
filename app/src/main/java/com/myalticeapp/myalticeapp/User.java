package com.myalticeapp.myalticeapp;

/**
 * Created by Christian on 2018-04-14.
 */

public class User {
    private String Name;
    private String LastName;

    public User(String name, String lastName) {
        Name = name;
        LastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
