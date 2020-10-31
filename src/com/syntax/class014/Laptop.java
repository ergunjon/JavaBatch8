package com.syntax.class014;

public class Laptop {

    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    //void method=doesn't return any values
    void playMovies(){
        System.out.println("Playing movies");
    }
    void browseInternet(){
        System.out.println("browser Internet");
    }
    void makeVideoCall(String contact){

        System.out.println("Video calling to "+contact);
    }
    public String getModel(){
        return model;
    }
    int getRAMCapacity(){
        return RAMCapacity*2;
    }
    int upgradeRam(int newRamUnit){
        return newRamUnit*RAMCapacity;
    }
}
