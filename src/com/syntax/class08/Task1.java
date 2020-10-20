package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		//Print numbers from 1 to 100 in 1 line with space
        //Print numbers from 100 to 1
        //Print even numbers from 20 to 1 (2 ways)
        //Print odd numbers between 20 and 50 (2 ways)
		
		System.out.println("-----------------  ------------------------------------");
		System.out.println("Print even numbers from 20 to 1 (1st way)");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 2nd way
		System.out.println("Print even numbers from 20 to 1 (2nd way)");
		for (int i = 2; i <= 20; i=i+2) {
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------odd numbers 20 to 50----------------------------");
		
		for (int a=20; a<=50; a++) {
			if(a%2!=0) {
				System.out.print(a+" ");
			}
		}
		System.out.println();
		System.out.println("---------------2nd way-----------------------------------------");
		
		for (int d=21; d<=50; d+=2) {
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println("---------------- EXAMPLE --------------------------");
		
		int sum = 0;
		
		for(int i=1; i<6; i++) { //i++ //1+1=2+1=3+1=4+1=5
			sum=sum+i;//0+1=1 // 1+2=3 // 3+3=6 // 6+4=10
		}
		System.out.println(sum);
		System.out.println("-----------------------------------------------------");
		
		int a;
		for (a=1; a<6; a++) {
			System.out.println("Value for a inside of for loop is = "+a);
		}
		System.out.println("Value for a outside of for loop is = "+a);
		System.out.println("----------------------  --------------------  ---------------------");
		
		int result=1;
		
		for (int i=10; i>=1; i-=2) { //i-=2 10-2=8-2=6-2=4-2=2-2=0
			
			result*=i; //1*10=10//10*8=80//80*6=480*4=1920*2=3840
		
		System.out.println("Result = "+result);
		}

	}

}
