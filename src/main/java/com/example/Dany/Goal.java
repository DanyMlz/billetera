package com.example.Dany;

public class Goal{

  public String createGoal(String goal) throws Exception{
    if(goal.equals("")){
      throw new Exception("La meta es requerida");
    }
    return goal;

  }

  public int addAmount(int amount) throws Exception{
    if(amount <= 0){
      throw new Exception("El monto debe ser mayo a 0");
    }
    return amount;
  }


  public Time addTime(int time, String typeTime)throws Exception{
    if(time <= 0 || typeTime.equals("")){
      throw new Exception("El tiempo para la meta es requerida");
    }
    Time timeGoal = new Time(time, typeTime);
    return timeGoal;
  }

}


/*
public class Goal{

  public String createGoal(String goal) throws Exception{
    if(goal.equals("")){
      throw new Exception("The goal shouldn't be empty");
    }
    return goal;

  }

  public int addAmount(int amount) throws Exception{
    if(amount <= 0){
      throw new Exception("The amount should be greater than 0");
    }
    return amount;
  }

  public Time addTime(int time, String typeTime)throws Exception{
    if(time <= 0 || typeTime.equals("")){
      throw new Exception("The time shouldn't be empty");
    }
    Time timeGoal = new Time(time, typeTime);
    return timeGoal;
  }

}
*/

