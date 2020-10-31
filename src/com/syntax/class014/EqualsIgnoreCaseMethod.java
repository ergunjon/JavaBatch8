package com.syntax.class014;

public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        String name1="Marta";
        String name2="MArtA";
        System.out.println(name1.equalsIgnoreCase(name1));
        System.out.println(name2.equalsIgnoreCase(name2));
    }
}
