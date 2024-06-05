package com.gvacharya.operators.main;

public class Ifelse {
  int num1;
  int num2;
  
  public Ifelse() {
  }
  
  public Ifelse(int num1,int num2){
	  this.num1=num1;
	  this.num2=num2;
  }
  
  public String Operation(){
	if (num1==num2) {
	return("Very nice");
	}
	else {
		return("Not so good");
	}
  }
  
  
  
  
  
  
  
}
