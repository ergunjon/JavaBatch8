package com.syntax.class07;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int monday=1;
		int tuesday=2;
		int wednesday=3;
		int thursday=4;
		int friday=5;
		int saturday=6;
		int sunday=7;
		int invalidday=0;
		int day;
		
		do {
			System.out.println("Guess my favorite day put any number 1-7");
			day=input.nextInt();
		}while(wednesday!=day);
		System.out.println("Wednesday");
		
		 int i=0; 
		 while(i<5) { 
			 System.out.println(i);
			 i++; 
			 }
		
	}
	}


