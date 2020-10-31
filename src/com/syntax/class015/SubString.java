package com.syntax.class015;

public class SubString {
    public static void main(String[] args) {
        String name = "Can u write the second m too ?";
        System.out.println(name.substring(5));//it starts after 5th character
        System.out.println(name.substring(8));

        System.out.println(name.substring(5,10));// it prints from 5 to 10
    }
}
