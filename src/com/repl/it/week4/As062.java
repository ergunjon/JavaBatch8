package com.repl.it.week4;

public class As062 {

	public static void main(String[] args) {
		//Using for loop Print 1 to 10 Numbers except 5 and 6
		
		for(int a=1; a<=10; a++) {
			if(a!=5 && a!=6) {
				System.out.println(a);
			}
		}
		System.out.println("---------2nd way------------------");
		
		   for (int i = 1; i <= 10; i++) {
				if (i == 5 || i == 6) {
					continue;
				}
				System.out.println(i);
			}

	}

}
