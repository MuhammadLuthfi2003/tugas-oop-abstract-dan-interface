package com.example;

public abstract class Product {
    private double price;

    public abstract String howToUse();

    public Product( double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }

}
