package com.syntax.class013;

public class SmartPhone {
    String brand;
    String color;
    String model;
    void text(String text) {
        System.out.println(brand + " can text");
    }
    void pics(String camera) {
        System.out.println(brand + " can take a picture very "+camera);
    }
    void call(String phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    public static void main(String[] args) {
        SmartPhone phone=new SmartPhone();
        phone.brand="iPhone";
        phone.color="Black";
        phone.model="11 Pro";
        phone.text("Hi");
        phone.pics("Clear");
        phone.call("123456789");
    }
}


