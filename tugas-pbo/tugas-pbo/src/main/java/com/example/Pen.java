package com.example;

public class Pen extends Product {

    public Pen(double price) {
        super(price);
    }

    public String howToUse() {
        return "Buka tutupnya dan tuliskan sesuatu di atas kertas menggunakan pulpen tersebut";
    }

    @Override
    public String toString() {
        return "Pulpen";
    }
}