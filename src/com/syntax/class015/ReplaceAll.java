package com.syntax.class015;

public class ReplaceAll {
    public static void main(String[] args) {

        String mix = "3213Hello 89 World354545 *&***^&*^&*";

        System.out.println(mix);

        System.out.println(mix.replaceAll("[0-9]", ""));//0-9 dont print any number

        System.out.println(mix.replaceAll("[a-z]", ""));//dont print anything lower case

        System.out.println(mix.replaceAll("[a-z A-Z]", ""));//dont print any alphabet

        System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));//^print only numbers and alphabet
    }
}



