package com.repl.it.week5;

public class As070 {

	public static void main(String[] args) {
		//1 
		//2 2 
		//3 3 3 
		//4 4 4 4 
		//5 5 5 5 5 
		
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}

	}

}
