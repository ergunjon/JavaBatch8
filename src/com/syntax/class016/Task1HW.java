package com.syntax.class016;

public class Task1HW {
    public static void main(String[] args) {
        //1-How would you reverse a String character by character?
        //2-How would you reverse a String word by word?
        //3-How would you check if String is palindrome or not?
        //4-How would you swap  2 strings without a temporary variable?

        System.out.println("----------Task1---------------");
        String str1 = "Anna";//0 1 2 3
        String reverse="";
        for(int i = str1.length()-1; i>=0; i--){//-1 because it starts from zero
            System.out.println(i);
            System.out.println(str1.charAt(i));
            reverse += str1.charAt(i);//reverse = reserve + str1.charAt(i);
            System.out.println(reverse);
        }
        System.out.println(reverse);
        System.out.println("Is "+str1+" palindrome? "+reverse.equalsIgnoreCase(str1));

        StringBuilder stringBuilder = new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());

        //second way
        String input="Hello World";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1=input1.reverse();
        System.out.println(input1);






    }
}
