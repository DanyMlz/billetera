package com.example.Dany;

public class Time{
  private int time;
  private String typeTime;

  protected Time(int time, String typeTime){
    this.time = time;
    this.typeTime = typeTime;
  }

  public int getTime(){
    return this.time;
  }
  public String getTypeTime(){
    return this.typeTime;
  }
}
