package com.groupZero.Project1;

public class Task9 {

	public static void main(String[] args) {
		// Create an array of countries: north america countries, south america
		// countries, europe countries, asian countries, african countries.
		// Then print all values from that array using 2 different loops
		// and calculate how many total countries been stored.

				int counter = 0;

				String[][] countries = { { "USA", "Canada" }, { "Brazil", "Argentina", "Chile" },
						{ "Italy", "Serbia", "Ukraine", "Poland" }, { "China", "India" }, { "Moroco", "Nigeria" } };

				for (int i = 0; i < countries.length; i++) {
					for (int j = 0; j < countries[i].length; j++) {
						System.out.print(countries[i][j] + " ");
						counter++;
					}
				}
				System.out.println("\ntotal " + counter + " countries in the array");

				System.out.println("--------Enchanced loop--------");
				
				int sum=0;

				for (String[] c : countries) {
					for (String name : c) {
						System.out.print(name + "- ");
						sum++;
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("Total countries in the array is "+sum);


	}

}
