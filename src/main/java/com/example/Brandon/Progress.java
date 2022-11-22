package com.example.Brandon;
import com.example.Request;
import com.example.Dayeza.UserSchema;

public class Progress{
    
    public static void showProgress(String name){
        UserSchema user = Request.getUser(name);
        int result =  user.getObjetivoDinero() - user.getMoney();
        System.out.println("La meta es: " + user.getGoal() +
            "\nPrecio: " + user.getObjetivoDinero() +
            "\nMoney: " + user.getMoney() +
            "\nDinero faltante: " + result);
    }
}

