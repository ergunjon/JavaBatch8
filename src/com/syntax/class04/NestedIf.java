package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		/*
		 * variable for allergy - yes or -no
		 * 
		 * if allergy is yes -->
		 *                     we will check if pet allergy 
		 *                                   if peanut allergy
		 *                                   if pollen allergy
		 * if no allergy you are lucky !!!                                  
		 */

		boolean allergy=true;
		
		boolean petAllergy=false;
		boolean peanutAllergy=true;
		boolean pollenAllergy=false;
		
		if(allergy) {
			System.out.println("Lets do further check");
			if(petAllergy) {
				System.out.println("please no cats or dogs on the house");
			}else {
				System.out.println("That is good you dont have pet allergy");
			}
		}else {
			System.out.println("you are lucky");
		}
		System.out.println("----------------------------------EXAMPLE 2----------------------");
		
		/*If today is Friday we will watch movie but would like to check the date
		 * 
		 *                    if date is 13-->watching scary movie
		 *                    and if it is not -->I will watch comedy,action
		 *If no Friday --> I am studying
		 */
		
		boolean isFriday=true;
		int date=4;
		boolean monday=true;
		
		if (isFriday) {
			
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch PK movie with Amir Khan");
			}
	    }else {
		       if(monday) {
		    	   System.out.println("I am not studying, I am working");
		       }else {
		    	   System.out.println("I have class at Syntax");
		       }
	
	    }
		 System.out.println("---------------------------EXAMPLE 3--------------------");
		 
		 /*check if assignment is completed
		  * if assignment is completed;
		  *              if score >90-->great job
		  *              if score >80-->good job
		  *              if score >70-->please study more
		  */
	
		 //debug your code late and analyze what is the issue!!!
		 //do not make that mistake!!!!!!!!!!!!!!!!!!!
		 int score=62;
		 boolean assignment=true;
		 
		 if(assignment) {
			 if(score>90) {
				 System.out.println("great job");
			 }else if(score>80) {
				 System.out.println("good job");
			 }else if(score>70) {
				 System.out.println("please study more");
			 }else {
				 System.out.println("You suck !!!");
			 }
			 
		 }else {
			 System.out.println("You should always complete all assignments");
		 }
		 //sequence-dizilim
}
}