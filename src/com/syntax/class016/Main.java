package com.syntax.class016;

public class Main {

    public static void main(String[] args) {


        System.out.println("-----VoidMethods----------");
        VoidMethods.print();
        VoidMethods.print(" Aladdin");

        System.out.println("-----Task1--------");
        Task1.printLarger(10,20);
        Task1.printLarger(100.5,20.5);
        Task1.printLarger(10,10);

        System.out.println("-----Task2---------");
        Task2 task2 = new Task2();
        task2.printNumberEvenOrOdd(5);
        task2.printNumberEvenOrOdd(2);
        task2.printNumberEvenOrOdd(10);
        task2.printNumberEvenOrOdd(1000);

        System.out.println("------Task3-----------");
        Task3 task3 = new Task3();
        task3.isStringpalindrome("Syntax");
        task3.isStringpalindrome("aba");
        task3.isStringpalindrome("a");
        task3.isStringpalindrome("eabae");
        task3.isStringpalindrome("eabaf");


    }
}
