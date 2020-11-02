package com.syntax.class016;

import com.syntax.class013.Dog;

public class Methods {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        //dog1.bark();--its giving me error because its not public its void bark () {
        System.out.println(addnumbers(10,20));
        System.out.println(addnumbers(10,40));
        System.out.println(addnumbers(20,20));
        System.out.println(addnumbers(25,30));
        System.out.println(addnumbers(40,56));
    }
    public static int addnumbers(int num1, int num2) {

        return num1+num2;
    }
}
