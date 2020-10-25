package com.syntax.class011;

public class FirstTaskArray2D {

	public static void main(String[] args) {
		//Create an array of cars : american, german, korean, italian.
		//And print all values from a 2D array
		
		String[][] $array=new String [4][2];
		
		$array[0][0]="Chevy";
		$array[0][1]="Jeep";
		$array[1][0]="BMW";
		$array[1][1]="Mercedes";
		$array[2][0]="Kia";
		$array[2][1]="Hyundai";
		$array[3][0]="Alfa-Romeo";
		$array[3][1]="Ferrari";
		
		for(int row=0; row<$array.length; row++) {
			
			for(int column=0; column<$array[row].length; column++) {
				
				System.out.print($array[row][column]+" ");
			}
			System.out.println();

	}
		System.out.println("--------------Another way to create a 2D Array--------------------");
		
		String [][] cars = {
				{"Chevy","Jeep"},
				{"BMW","Mercedes"},
				{"Kia","Hyundai"},
				{"Alfa-Romeo","Ferrari"}
		};
		
		for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++){
				
				String car=cars[i][j];
				System.out.print(car+" ");
				//System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------- Enchanced loop  -------------------");
		
		for(String[] carArray:cars) {
			for(String car:carArray) {
				System.out.println(car+" ");
			}
			System.out.println();
		}

}
}
