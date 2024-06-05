package com.gvacharya.operators.main;
import com.gvacharya.operators.main.ArithmeticOperators;
import com.gvacharya.operators.main.BitwiseOperator;
import com.gvacharya.operators.main.Ternery;


public class Operators {
	public static void main(String[] args) {
		ArithmeticOperators arithmeticOperators =
			new ArithmeticOperators(20,30);
		
		float additionResult=arithmeticOperators.addTwoOperands();
		float substractionResult=arithmeticOperators.subTwoOperands();
		///int booleanOperandsResult=arithmeticOperators.booleanOperands();
		
		
	    System.out.print(additionResult);
	    System.out.print(substractionResult);
	    ///System.out.print(booleanOperandsResult);
				
	}
	public static void main1(String[] args) {

	Ternery Ternery= new Ternery();
	  Ternery.setTernery1(1);
	  Ternery.setTernery1(4);	
	  
	System.out.print("Greater No:"+ Ternery);
  
}
}

