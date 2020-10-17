package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// increment=artis
		//decrement=azaltma --

		int num=90;
		num=num+1;
		num+=1;
		
		System.out.println(num);
		
		num++; //adding 1
		System.out.println(num);
		
		int num1=100;
		
		num1-=1;
		num1--;//subtract 1
		System.out.println(num1);
		//100--; CE
		//increment & decrement operators can be used ONLY with variables
	
		
		System.out.println("-------------------------- -----------------------------");
		
		//for type same thing i can do copy&paste but what about i need 100 times?
		//Loops in Java-dongu/loop, cycle, looping
		//executes same block of code multiple times help to avoid repetitive code
		/*while loop
		 * do while loop
		 * for loop
		 * Enhanced loop
		 */
		
		//while loop
		
		int time=15;
		if(time>12) { //condition is true
			System.out.println("Good day"); // code executes 1 time
		}
		System.out.println("------------------------------------------------------");
	
		//while (time>12) {
			//System.out.println("Good day"); INFINITE LOOP it goes crazy doesn't stop
		
		while (time>12) {//condition is True
				System.out.println("Good day");
			time--; //15-12=3 it will print 3 times on console
		}
		while (time>12) {//condition is True
			System.out.println("Good day"); // how many times? INFINITE LOOP
		    time++; //
	}
		System.out.println("-----------PRINTING NUMBERS FROM 1 TO 50--------------");
		//I want to print numbers from 1 to 50
		
		int number=1;
		
		while(number<=50) {
			System.out.println(number);
			number++;
		}
		System.out.println("-----------PRINTING NUMBERS FROM 10 TO 60--------------");
		
		int number1=10;
		while (number1<=60) {
			System.out.print(number1+" ");
			number1++;
		}
		
		System.out.println();
		//-----------PRINTING NUMBERS 100 TO 60---------------------
		System.out.println("-----------PRINTING NUMBERS 100 TO 60---------------------");
		int b=100;
		
		while(b>=60) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		System.out.println("------------PRINTING NUMBERS 10 TO 30 ONLY EVEN---------------");
		int c=10;
		
		while(c<31) {
			
			if(c%2==0) {
			System.out.println(c+" ");
			}
		    c++;
		}
		System.out.println("Better way");
		int d=10;
		while(d<=30) {
			System.out.println(d+" ");
			d+=2;
		}
		System.out.println("End of the code");
		System.out.println("--------print numbers from 100 to 1(odd numbers only)");
		int e=100;
		
		while(e>=1) {
			
			if(!(e%2==0)) {
			System.out.print(e+" ");
			}
			e--;
		}
		System.out.println();
		System.out.println("easier way");
		int f=99;
		while (f>0) {
		System.out.print(f+" ");
		f-=2;
		}
}
}
