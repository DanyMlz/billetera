package com.example.Dayeza;

public class UserSchema{

    private String name;
    private String lastName;
    private String password;
    private String email;
    private String goal;
    private int money;
    private int objetivoDinero;


    public UserSchema(String name, String lastName, String password, String email, int money,int objetivoDinero,String goal){
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.money = money;
        this.objetivoDinero = objetivoDinero;
        this.goal = goal;
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

public String getEmail(){
        return this.email;
    }

    public String getGoal(){
        return this.goal;
    }

    public int getMoney(){
        return this.money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public int getObjetivoDinero(){
        return this.objetivoDinero;
    }

}
