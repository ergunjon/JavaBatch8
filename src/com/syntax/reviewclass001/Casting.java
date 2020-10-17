package com.syntax.reviewclass001;

public class Casting {

	public static void main(String[] args) {
		
		byte byteVar=10;
		short shortVar=100;
		char charVar='A';
		long intVar=1000;
		float floatVar=10000;
		double doubleVar=100000;
		shortVar=byteVar;
		System.out.println(shortVar);
		intVar=charVar;
		System.out.println(intVar);
		System.out.println(doubleVar);
		
		floatVar=(float)doubleVar;
		System.out.println(floatVar);
		byteVar=(byte) shortVar;
		System.out.println(byteVar);
		
		byte newVar=100;
		short newshortVar= (short)(newVar+10);
		System.out.println(newshortVar);
		
		int newIntVar=100;
		long newLongVar=2147563185L;
		float floatVar1=145.25F;
		
		
		

	}

}
