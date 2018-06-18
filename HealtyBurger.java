package com.eab;

public class HealtyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealtyBurger(String meat, double price) {
        super("Healthy Burger", "Brown rye bread", meat, price);
    }

    public void addHealthyAddion1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddion2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice=super.itemizeHamburger();
        double healthyBurgerPrice=hamburgerPrice;
        if (this.healthyExtra1Name!=null){
            healthyBurgerPrice+=this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name!=null){
            healthyBurgerPrice+=this.healthyExtra2Price;
        }
        return healthyBurgerPrice;
    }
}

