package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {


System.out.println("-------how an i print clock-------------");
		
		for (int a=0; a<24; a++) {
			for(int b=0; b<=59; b++) {
				if(a<10) {
				    if(b<10) {
					System.out.println("0"+a+":"+"0"+b);//its doesn't add 0 to minute after 10am
				}else {
				System.out.println("0"+a+":"+b);
			}
		}else {
			System.out.println(a+":"+b);
		}
	}
	}
		System.out.println("-------------2nd way------------------");
		
		for(int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				if(h<10 && m<10) {
					System.out.println("0"+h+":"+"0"+m);
				}else if (h<10 && m>10) {
					System.out.println("0"+h+":"+m);
				}
			}
		}

	}

}
