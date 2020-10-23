package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		
		for(int r=1; r<=4; r++) { // outer loop control rows
			for (int c=1; c<=6; c++) { // inner loop control columns
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
