package com.syntax.class013;

public class MainDog {
    public static void main(String[] args){

        Dog d1=new Dog();
        d1.age=3;
        d1.isFriendly=true;
        d1.name="Lessie";
        d1.type="Bulldog";
        d1.gender='F';
        d1.isHealthy=true;
        d1.bark();
        d1.fetch();
        d1.play();
        d1.sit();
        d1.sleep();
    }
}
