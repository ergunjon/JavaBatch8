package com.syntax.class03;

public class CompoudOperators {

	public static void main(String[] args) {
	
		//Operators in Java
		//Assignment Operator
		//+, -, /, *, %

		int num=100;
		num=num+10;
		System.out.println(num);
		
		num=num+200;
		System.out.println(num);
		
		//CompoundOperators-bilesik
		
		int myNumber=100;
		myNumber+=10;
		System.out.println(myNumber);//110
		
		myNumber+=200;
		System.out.println(myNumber);//310
		
		myNumber-=100;
		System.out.println(myNumber);//210
		
		myNumber/=10;
		System.out.println(myNumber);//21
		
		myNumber*=1000;
		System.out.println(myNumber);//21000
		
		myNumber%=100;
		System.out.println(myNumber);//0
		
	 
	}

}
