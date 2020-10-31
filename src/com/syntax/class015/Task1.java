package com.syntax.class015;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program that reads two people's firstnames and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL

        Scanner scanner = new Scanner(System.in);
        String momsName,dadsname,gender,babyName;
        System.out.println("Please enter moms name");
        momsName=scanner.nextLine();
        System.out.println("Please enter dads name");
        dadsname=scanner.nextLine();
        System.out.println("Is it a boy or girl?");
        gender=scanner.nextLine();
        if(gender.toLowerCase().startsWith("b")){
            String firstPart=(dadsname.substring(0,dadsname.length() / 2));
            String lastPart=(momsName.substring(momsName.length() / 2));
            babyName= firstPart + lastPart;
        }else if(gender.toLowerCase().startsWith("g")){
            String firstPart=(momsName.substring(0,dadsname.length() / 2));
            String lastPart=(dadsname.substring(momsName.length() / 2));
            babyName= firstPart + lastPart;

        }else{
            babyName = "No suggestions";
        }

        System.out.println(babyName.toUpperCase());


    }
}
