package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a day number");
		int day=input.nextInt();
		
		
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}else if(day==2){
			System.out.println("Today is Tuesday we have Manual class");
		}else if (day==3) {
			System.out.println("Today is Wednesday we have Maual Class again");
		}else if (day==4) {
			System.out.println("Today is Thursday we have review Class");
		}else if (day==5) {
			System.out.println("Today is Friday but i have class tomorrow and I will prepare");
		}else if (day==6) {
			System.out.println("Today is Saturday, I miss Java classes");
		}else if(day==7) {
			System.out.println("Today is Sunday, I did a lot of coding");
		}else {
			System.out.println("This is invalid day of a week");
		}
System.out.println("----------SAME EXAMPLE USING SWITCH CASE-----------------");

        String today;
        switch(day) {//data type of variable must match with data type of cases
        
        case 1:
        	today="Monday";
        	break;
        case 2:
        	today="Tuesday";
        	break;
        case 3:
        	today="Wednesday";
        	break;
        case 4:
        	today="Thursday";
        	break;
        case 5:
        	today="Friday";
        	break;
        case 6:
        	today="Saturday";
        	break;
        case 7:
        	today="Sunday";
        	break;
        default:
        	today="Invalid day";
        	break;
        	// break-->is optional since it is a last statement in the switch block
        	
        }
        System.out.println("Today is "+today);


















	}

}
