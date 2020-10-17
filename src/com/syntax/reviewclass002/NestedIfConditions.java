package com.syntax.reviewclass002;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		String name="Mrs. Alexandria";
		String pass="pass123";
		double accountBalance=10.25;
	    double transferAmount=8;
	    boolean transAllowed=true;
	    if(pass=="pass123") {
	    	System.out.println("Welcome to Kyo Bank "+name);
	       if (transAllowed){
	    	   System.out.println("Initiating transfer "+name);
	    	   if (transferAmount > accountBalance) {
	    		   System.out.println("Insufficient balance "+name);
	       }else {
	    	   System.out.println("Transfer completed "+name);
	    	   
	       }
	       }else {
	    	   System.out.println("You are not allowed to transfer funds "+name);
	       }
	    }else {
	    	System.out.println("Invalid credentials please try again "+name);
	    }


	}

}
