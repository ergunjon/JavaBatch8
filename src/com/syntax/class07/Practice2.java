package com.syntax.class07;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter any number lower than 100 so I can show you all double numbers up to 100");
		int numberfromuser=input.nextInt();
		
		
		while(numberfromuser<=100) {
			if(numberfromuser%2==0) {
			System.out.print(numberfromuser+" ");
		}
		numberfromuser++;
		}
		System.out.println();
		System.out.println("Now please enter another number lower than 100 this time i can show you odds numbers");
		int num=input.nextInt();
		
		while(num<=100) {
			if(!(num%2==0)) {
			System.out.print(num+" ");
			}
		num++;
	}
		
	}
	

}

