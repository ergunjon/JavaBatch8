package com.groupZero.Project1;

public class Task5secondSolution {

	public static void main(String[] args) {
		
		
		int[] array = { 5, 5, -3, 0, -3 ,8,3};
        int max = array[0];
        int max2 = 0;
        for (int d = 1; d < array.length; d++) {
            if (array[d] > max) {
                max = array[d];
            } else if (max != array[d]){
                max2 =array[d];
            }
        }
        for (int q = 0; q < array.length; q++) {
            if (array[q] >= max) {
                continue;
            } else if (array[q] > max2) {
                max2 = array[q];
            }
        }
        System.out.println("second largest number is " + max2);

	}

}
