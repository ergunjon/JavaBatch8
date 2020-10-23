package com.syntax.reviewclass004;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String name=null;
		if("Emine".equalsIgnoreCase(name)) {
			System.out.println("Hi Emine");
		}
		System.out.println("-----------------");
		
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=4; j++) {
				if (i==1 || i==4 || j==1 || j==4) {
				System.out.print("$");
				}else {
					System.out.print(" ");
			}
			}
			System.out.println();
		

	}

}
}
