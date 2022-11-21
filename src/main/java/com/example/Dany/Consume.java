package com.example.Dany;
public class Consume{

 public String createTypeConsume(String consumo) throws Exception{
   if(consumo.equals("")){
     throw new Exception("The type consume is required");
   }
   return consumo;
 }

 public int addExpense(int expense, String consume) throws Exception{
   if(expense == 0){
     throw new Exception("The expense is required");
   }
   createTypeConsume(consume);
   return expense;
 }

 public int  addIncome(int income) throws Exception{
   if(income == 0){
     throw new Exception("The income is required");
   }
   return income;
 }

}

