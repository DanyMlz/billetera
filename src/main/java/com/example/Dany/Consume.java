package com.example.Dany;

import com.example.Request;
import com.example.Dayeza.UserSchema;

public class Consume{

  public static UserSchema addExpense(int expense, String name, UserSchema user) throws Exception{
    if(expense == 0){
      throw new Exception("El gasto debe ser mayor a 0");
    }
    user = Request.getUser(name);
    int result = user.getMoney() - expense;
    user.setMoney(result);

    System.out.println("Gasto realizado: " + expense + "\nMoney actual: " + result);
    return user;
  }

  public static UserSchema  addIncome(int income ,String name, UserSchema user) throws Exception{
    if(income == 0){
      throw new Exception("El ingreso debe ser mayor a 0");
    }
    user = Request.getUser(name);
    int result = user.getMoney() + income;
    user.setMoney(result);

    System.out.println("Ingresos: " + income + "\nMoney actual: "+ result);
    return user;
  }





}

