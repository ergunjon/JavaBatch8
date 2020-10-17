package com.syntax.class03;

import java.util.Scanner;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Bisey yaz");
		int age=input.nextInt();
		System.out.println("What age");
		String gender=input.next();
		
		if(age>25) {
			if(gender=="y") {
				System.out.println("daosddad");
			}else {
				System.out.println("n");
				
			}
		}
	}

}
