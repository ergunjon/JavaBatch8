package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//while==>first checks condition & then perform action
		//do while==>first performs action & then checks condition
		//
		//if condition is false==> do while will execute code ONCE compare to while loop
		//==>no execution
		
		//first While Loop
		System.out.println("-----------WHILE LOOP--------------");
		int a=200;
		//first we check condition
		while(a<15) {
			System.out.println("Hello");
			a++;
		}
		System.out.println("--------------DO WHILE LOOP-----------");
		int b=20;
		
		do {   //first do something
			System.out.println("Hi");
			b++;
		}while(b<15);//then check condition

	}

}
