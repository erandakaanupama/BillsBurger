package com.eab;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(double price) {
        super("Deluxe", "white", "sausage and bacon", price);
        super.addition1("chips", 2.75);
        super.addition2("Drinks", 1.81);
    }

    @Override
    public void addition1(String name, double price) {
        System.out.println("sorry, can't add additional items!");
    }

    @Override
    public void addition2(String name, double price) {
        System.out.println("sorry, can't add additional items!");
    }

    @Override
    public void addition3(String name, double price) {
        System.out.println("sorry, can't add additional items!");
    }

    @Override
    public void addition4(String name, double price) {
        System.out.println("sorry, can't add additional items!");
    }
}
