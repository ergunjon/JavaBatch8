package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		// Casting in Java; converting 1 type to another
		
		//2 type of casting;
		//widening genisletme-implicit/dolayli (automatic)
		//byte-->short-->int-->long-->float-->double
		
		//narrowing daraltma-explicit/acik belirtik (manual)
		//double-->float-->long-->int-->short-->byte
		//double 4.2 --> will be int 4
	
		double d=12/7;//1.71 //widening
		System.out.println(d);
		int z=12/7;//narrowing
		System.out.println(z);
		
		
		double e=9;//widening
		System.out.println(e);
		
		//int i=9.999; gives error because we need to use double
		int i=(int)9.999;//narrowing
		System.out.println(i);
		
		byte b=(byte)130;//narrowing(whatever value......)
		System.out.println(b);
		//you need to learn binary numbers to understand it
		
		
		
		
		
		
		

	}

}
