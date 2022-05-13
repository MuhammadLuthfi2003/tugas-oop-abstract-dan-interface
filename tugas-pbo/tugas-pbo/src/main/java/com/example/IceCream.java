package com.example;

public class IceCream extends Product implements IDecayable{
    public IceCream(double price) {
        super(price);
    }

    @Override
    public String howToUse() {
        return "Memakan/Menjilat Es Krim sebelum ia meleleh";
    }

    @Override
    public String howToSaveProduct() {
        return "Memasukkan Es Krim pada freezer dengan suhu -10 derajat celcius atau lebih rendah";
    }

    @Override
    public String toString() {
        return "Es Krim";
    }
}
