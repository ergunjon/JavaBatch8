package com.syntax.reviewclass003;

public class LogicalOperators {

	public static void main(String[] args) {
		
		String day="Sunday";
		if (day.equalsIgnoreCase("Sunday")) {
			System.out.println("Relax its weekend just dont blink or it will be over");
		}else if(day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its weekend just dont blink or it will be over");
		}else {
			System.out.println("Go to work");
		}
		
		if(day.equals("Sunday") || day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its weekend just dont blink or it will be over");
		}else {
			System.out.println("Go to work");
		}

	}

}
