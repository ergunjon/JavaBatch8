package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true//a not equal to b// !=not
		
		int x=100;
		int y=90;
		
		boolean result = x>y;//true
		System.out.println(result);
		
		result=x==y;//== means compare//equal
		System.out.println(result);
		System.out.println("-----------------------------------");
		System.out.println(x==y);//compare
		System.out.println(x=y);//assigning value of y to variable x
		System.out.println(x);//100 became 90
		
		boolean result1=x==y;
		System.out.println(result1);
		
		byte num=10;
		byte num1=11;
		
		boolean boo=num>=num1;//false >= greater or equal
		System.out.println("Result of boo is "+boo);
		
	}

}
