package com.syntax.class014;
public class LengthMethod {
    public static void main(String[] args){
        String name="Qasim";
        System.out.println(name.length());//5 alfabe
        name="";
        System.out.println(name.length());//0
        name="Ahmad Qasim";
        System.out.println(name.length());//11 harf

        if(name.length()>10){
            System.out.println("You are great");
        }
    }
}
