package com.syntax.class013;

public class PracticeHeadphones {

    String charge="Micro usb";
    String[] controls={"power", "volume", "skip", "play/skip"};
    String color="Red/black";

    static boolean power=false;
    static int volume;

    public static void powerOn() {
        power = true;
    }
    public static void powerOff() {
        power = false;
    }
    public static void volumeUp(){
        volume++;
    }
    public static void volumeDown(){
        volume--;
    }
}
