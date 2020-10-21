package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//normally 1 variable can hold only 1 value
		//with that method we can hold more than one
		//int[] num
		
		
		int a=10;
		a=20;
		
		//int student1=90;
		//int student2=97;
		//int student3=85;
		
		int[] num = new int [5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		// to access element from an array?
		System.out.println("Accessing 3rd element "+num[2]);
		
		System.out.println(num[1]+num[4]);
		
		//I would like to change to 100;
		num[4]=100;
		System.out.println(num[4]);
		
		double[] array1 = new double[2];
		//array[0]=10.99; type of value must be in not double
		
		String[] array=new String[4];
		array[0]="Hello";
		
		
		

	}

}
