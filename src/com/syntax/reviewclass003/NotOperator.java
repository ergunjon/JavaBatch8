package com.syntax.reviewclass003;

public class NotOperator {

	public static void main(String[] args) {
		
      boolean isRaining = false;
		     if (isRaining) {
		         System.out.println("I will stay home");
		   } else {
		         System.out.println("I will go outside");
		          }
		    int num1=10;
		    int num2=5;
		      if(num2!=0) {
		        System.out.println(num1/num2);
		         }
		      
		      
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = true;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		System.out.println(isEligible);
	}

}
