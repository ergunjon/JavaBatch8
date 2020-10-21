package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// when to use while vs for
		//if we don't know how many time ==> do while and while,
		//
		//for is if we know how many times in advance
		
        //do while vs while  
		//do while does action then check condition while checks first
		
		//break; break/exist loop
		System.out.println("-----------break example----------------");
		boolean weekend=false;
		int day=1;
		
		while(!weekend) {
			System.out.println("I am working");
			
			if(day>=6) {
				System.out.println("I am not working");
				break;
			}
			day++;
		}
		
		//continue; skips current iteration
		System.out.println("-----------continue example---------------");
		
		for(int i=1; i<=5; i++) {
			if(i==3 || i==4) { // instead of|| if you put && it will print those
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------Nested loop example-----------------");
		
		for(int i=0; i<3; i++) {//outer loop
			System.out.println("Hello");//prints hello 3 times
			for (int y=0; y<3; y++) {//inner loop
				System.out.println("Bye");
			}
			System.out.println("-------------------------------");
		}
		System.out.println("----------more examples--------------");
		
		for (int i=10; i<=14; i++) {
			
			for(int j=1; j<=4; j++) {
				System.out.println(i+" "+j);
			}
			System.out.println("---------------");
		}
		System.out.println("--------print numbers from 10 to 99 using nested loop---------");
		
		
		for (int i=1; i<=9; i++) {	
			for(int j=0; j<=9; j++) {
				System.out.println(i+" "+j);
			}
		}
		
}
}

	
	

