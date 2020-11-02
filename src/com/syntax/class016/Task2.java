package com.syntax.class016;

public class Task2 {
    //Create a method that will take a number and prints whether the number is even or odd.

    //Even numbers 2.4.6.8.10......if a number is completely divisible by 2 it is an Even number//0 is even
    //If numbers are not divisible by 2 they are treated as Odd numbers 1.3.5.7.......
    void printNumberEvenOrOdd(int number){
        if(number%2==0){
            System.out.println("Number is an even number");
        }else{
            System.out.println("Number is an odd number");
        }

    }
}
