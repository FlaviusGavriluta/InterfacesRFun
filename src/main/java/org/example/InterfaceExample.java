package org.example;

public class InterfaceExample implements WaterBottle {
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It's filled");
    }

    @Override
    public void pourOut() {

    }
}