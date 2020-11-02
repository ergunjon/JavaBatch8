package com.syntax.class016;

public class Task1 {

        //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    public static void printLarger(double num1, double num2) {

        if(num1>num2){
            System.out.println(num1 + " is larger");
        }else if(num2>num1){
            System.out.println(num2+" is larger");
        }else{
            System.out.println("Numbers are equal");
        }
        //if we don't use methods
        double number1=10;
        double number2=20;
        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }
    }
}
