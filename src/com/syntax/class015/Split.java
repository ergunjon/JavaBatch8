package com.syntax.class015;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String name = "Burju*Maria*Kazim";
        String [] array = name. split("[^A-Z a-z]");
        System.out.println(Arrays.toString(array));
        }
    }

