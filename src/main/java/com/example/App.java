package com.example;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.Brandon.Progress;
import com.example.Dany.Consume;
import com.example.Dany.Goal;
import com.example.Dayeza.UserSchema;
import com.example.Interfaces.Login;
import com.example.Interfaces.Register;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1. Iniciar Sesion\n2. Registrarse");
        int loginOrRegister = scanner.nextInt();
        scanner.nextLine();
        if(loginOrRegister == 1){
            UserSchema user = Request.getUser("dany");
            //System.out.println(user.getName());
            Progress.showProgress(user.getName());
            user = Consume.addIncome(300, user.getName(), user);
            Request.postUser(user);
            Request.getUser(user.getName());
            user = Consume.addExpense(20, user.getName(), user);
            Request.postUser(user);
        }else{
            UserSchema user = new UserSchema("dany", "ortega", "1234", "dnay@gmail.com", 200, 300, "comprar auto");
            Request.postUser(user);

        }
    }
}
