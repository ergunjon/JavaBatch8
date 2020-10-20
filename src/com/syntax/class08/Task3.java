package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//3- Write a program that reads a range of integers (start and end point),
		//   provided by a user and then from that range prints the sum of the even and odd integers.
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" please enter start point number");
		int startPoint = scan.nextInt();

		System.out.println(" Please enter end point number ");
		int endPoint = scan.nextInt();

		int sumE = 0, sumO = 0;

		for (int i = startPoint; i <= endPoint; i++) {
			if (i % 2 == 0) {
				sumE += i;
			}
			if (i % 2 != 0) {
				sumO += i;
			}
		
		System.out.println("sumE is " + sumE);
		System.out.println("sumO is " + sumO);
		
		}
	}

}
