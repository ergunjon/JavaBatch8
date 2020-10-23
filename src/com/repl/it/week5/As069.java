package com.repl.it.week5;

public class As069 {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 
		//1 2 3 4 5 6 
		//1 2 3 4 5 
		//1 2 3 4 
		//1 2 3 
		//1 2 
		//1 
		
		for(int r=7; r>=1; r--) {
			for(int c=1; c<=r; c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	

	}

}
