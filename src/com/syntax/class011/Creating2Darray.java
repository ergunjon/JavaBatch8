package com.syntax.class011;

public class Creating2Darray {

	public static void main(String[] args) {
		
		//create 2D array of food:
		//american
		//italian
		//asian
		//afghani
		//indian
		System.out.println("----------Enchanced loop----------------------");
		String [][] food= {
				{"steak","hot-dogs","cheeseburger"},
				{"pizza","pasta","canoli"},
				{"sushi","ramen","fried-rice","dumplings"},
				{"kebab","manto"},
				{"beriyani","masal","curry","Chicken-tikka-masala"}
		};
		
		for(String[] dishes:food) {
			for(String dish:dishes) {
				System.out.print(dish+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------regular loop------------");

		for(int i=0; i<food.length; i++) {// output is 5
			for(int j=0; j<food[i].length; j++) {//now all
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}
	}

}
