package com.syntax.class011;

public class RecapHW3 {

	public static void main(String[] args) {
		//Create an array of countries.
		//While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).

		String[] countries = { "USA", "Ukraine", "Canada", "Turkey" };
		String[] capitals = { "DC", "Ottawa" ,"Kyiv", "Ottawa","Ankara" };
		
		//first method depends on row
		for (int v = 0; v < countries.length; v++) {
			System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
		}
		System.out.println("-------------------------------------------------------------");
		
		String capital;
		
		for(String country:countries) {
			
			switch(country) {
			
			case "USA":
				capital="DC";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Canada":
				capital="Ottawa";
				break;
				default:
					capital="I dont know";
			}
			System.out.println("Capital of the "+country+" is "+capital);
		}
	}

}
