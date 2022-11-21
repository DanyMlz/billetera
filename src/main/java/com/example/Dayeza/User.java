package com.example.Dayeza;

public class User {

    private String name;
    private String lastName;
    private String password;

    public User(String name, String lastName, String password){
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }



    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getPassword(){
        return this.password;
    }

}
