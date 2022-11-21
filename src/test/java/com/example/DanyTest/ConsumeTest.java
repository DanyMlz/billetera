package com.example.DanyTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import com.example.Dany.Consume;

public class ConsumeTest{
   Consume consumo;
   @Test
   public void returningAnyTypeConsume(){
     try{
      consumo = new Consume();
      assertEquals("comida", consumo.createTypeConsume("comida"));
     }catch(Exception e){
     }
   }

   @Test
   public void returningAnyExpenseWithTypeConsume(){
     try{
      consumo = new Consume();
      assertEquals(232, consumo.addExpense(232, "comida"));
     }catch(Exception e){
     }
   }

   @Test
   public void returningAnyIncome(){
     try{
      consumo = new Consume();
      assertEquals(300, consumo.addIncome(300));
     }catch(Exception e){
     }
   }

   @Test
   public void verifyEmptyConsume(){
     try{
      consumo = new Consume();
      consumo.createTypeConsume("");
      fail("The type consume is required");
     }catch(Exception e){
     }
   }

   @Test
   public void verifyEmptyExpense(){
     try{
       consumo = new Consume();
       consumo.addExpense(0, "");
       fail("The expense is required");
     }catch(Exception e){
     }
   }

   @Test
   public void verifyEmptyIncome(){
     try{
       consumo = new Consume();
       consumo.addIncome(0);
       fail("The income is required");
     }catch(Exception e){
     }
   }
}
