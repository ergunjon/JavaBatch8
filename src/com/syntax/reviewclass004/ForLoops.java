package com.syntax.reviewclass004;

public class ForLoops {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=0; i<11; i++){
			System.out.println("sum till "+i+" "+(sum=sum+i));
		}
		System.out.println("---------------------------------");
		for (int i=10; i>=0; i--){
			System.out.println("sum till "+i+" "+(sum=sum+i));

	}

}
}
