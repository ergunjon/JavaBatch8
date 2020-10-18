package com.syntax.class07;

public class Practice {

	public static void main(String[] args) {
		
		int age=15;
		age=age+1;//16
		age+=2;
		System.out.println(age);//18
		age ++;
		System.out.println(age);//19
		age--;
		System.out.println(age);//18
		System.out.println("---------------");
		while(age>15) {
			System.out.println(age);
			age--;
		}
		while(age>15) {
			System.out.println(age);
			age++;
		}
		System.out.println("-----------------");
		while(age>10) {
			System.out.println(age);//15
			age--;
		}
		System.out.println(age);//10
		System.out.println("--------print numbers from 100 to 1(odd numbers only)");
		
		int num=100;
							
		while(num>1) {
			if(!(num%2==0)){
				System.out.print(num+" ");
			}
			num--;		
			}
		System.out.println("-------------------------------------");
		int cats=56;
		while(cats<100) {
			if(!(cats%2==0)) {
				System.out.println(cats);
			}
			cats++;
		}
		}
	}


