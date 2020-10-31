package com.syntax.class014;

public class StartsWithMethod {
    public static void main(String[] args) {
        String var="maybe you can give a real life example where the trim method is useful to use";
        System.out.println(var.startsWith("maybe"));//true
        System.out.println(var.startsWith("sgdsakdh"));//false
        System.out.println(var.startsWith("MAYBE"));//false
    }
}
