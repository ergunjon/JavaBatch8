package com.syntax.class07;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		String month="January";
		
		//if months is dec feb--> winter
		//if month is march apr or may -->spring
		
		switch(month) {
		
		case"December":
		case"January":
		case"February":
			System.out.println("Winter");
			break;
		case"March":
		case"April":
		case"May":
			System.out.println("Spring");
			break;
		case"June":
		case"July":
		case"August":
			System.out.println("Summer");
			break;
		}

	}

}
