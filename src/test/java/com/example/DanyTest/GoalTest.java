package com.example.DanyTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import com.example.Dany.Goal;
import com.example.Dany.Time;

public class GoalTest
{
  Goal goal;

    @Test
    public void returningAnyGoal(){
      try{
        goal = new Goal();
        assertEquals("comprar auto", goal.createGoal("comprar auto"));
      }catch(Exception e){
      }
    }

    @Test
    public void returningAnyAmountOfGoal(){
      try{
      goal = new Goal();
      assertEquals(5, goal.addAmount(5));
      }catch(Exception e){
      }
    }

    @Test
    public void returningTimeOfGoal(){
      try{
      goal = new Goal();
      Time timeGoal = goal.addTime(10, "dias");
      assertEquals(10, timeGoal.getTime());
      assertEquals("dias", timeGoal.getTypeTime());
      }catch(Exception e){
      }
    }

    @Test
    public void verifyEmptyGoal(){
      try{
        goal = new Goal();
        goal.createGoal("");
        fail("The goal shouldn't be empty");
      }catch(Exception e){
      }
    }

    @Test
    public void verifyEmptyAmountOfGoal(){
      try{
        goal = new Goal();
        goal.addAmount(0);
        fail("The amount should be greater than 0");

      }catch(Exception e){
      }
    }

    @Test
    public void verifyEmptyTimeOfGoal(){
      try{
        goal = new Goal();
        Time timeGoal = goal.addTime(0, "");
        fail("The time of goal shouldn't be empty");
      }catch(Exception e){
      }
    }

    @Test
    public void verifyWithNegativeAmount(){
      try{
        goal = new Goal();
        goal.addAmount(-3000);
        fail("The amount shouldn't be smaller than 0");
      }catch(Exception e){
      }
    }

    @Test
    public void verifyWithNegativeTime(){
      try{
        goal = new Goal();
        Time timeGoal = goal.addTime(-20, "meses");
        fail("The time shouldn't be smaller than 0");
      }catch(Exception e){
      }
    }

}

