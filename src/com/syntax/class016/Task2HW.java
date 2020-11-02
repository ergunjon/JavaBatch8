package com.syntax.class016;

import java.util.Arrays;

public class Task2HW {
    public static void main(String[] args) {
        //2-How would you reverse a String word by word?
        String sentence="What did u use the most?";
        String[] stringArray = sentence.split(" ");

       // System.out.println(Arrays.toString(stringArray));

        for(int i = 0; i< stringArray.length; i++){

            StringBuilder stringBuilders = new StringBuilder(stringArray[i]);
            //System.out.println(stringBuilders);
            stringArray[i]=stringBuilders.reverse().toString();
           // System.out.println(stringArray[i]);
        }
        System.out.println(Arrays.toString(stringArray));

    }
}
