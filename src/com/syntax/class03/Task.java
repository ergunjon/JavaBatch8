package com.syntax.class03;

public class Task {

	public static void main(String[] args) {
		
		//1. Declare variable and increase by 100 using shorthand operator
		//2. Declare variable and decrease by 67 using shorthand operator
		//3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
	    //4. Declare variable cakePiece=25 and divide cakePiece between 7 people .
		//   Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		
		int var=150;
		var+=100;
		var-=67;
		System.out.println(var);
		
		int cakePiece;
		cakePiece=11;
		cakePiece/=4;
		
		cakePiece=25;
		cakePiece/=7;
		System.out.println(cakePiece);

	}

}
