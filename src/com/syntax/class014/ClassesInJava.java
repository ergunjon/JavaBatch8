package com.syntax.class014;

public class ClassesInJava {
    public static void main(String[] args){
        Laptop laptop=new Laptop();
        laptop.make="Mac";
        laptop.model="pro 16";
        laptop.storage=1;
        laptop.RAMCapacity=16;
        laptop.color="pink";
        laptop.processor="Core i7";
        laptop.GPU="Nvidia RTX 3090 12GB DDR6X";

        laptop.playMovies();
        laptop.browseInternet();
        laptop.makeVideoCall("Trump");
        String model= laptop.getModel();
        System.out.println(laptop.getModel());
        System.out.println(laptop.getRAMCapacity());
        System.out.println(laptop.upgradeRam(2));


    }
}
