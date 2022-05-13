package com.example;

public class Book extends Product {
    
    public Book(double price) {
        super(price);
    }

    @Override
    public String howToUse() {
        return "Buka halamannya pada buku dan baca isinya";
    }

    @Override
    public String toString() {
        return "Buku";
    }
}
