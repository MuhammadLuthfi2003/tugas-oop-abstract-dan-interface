package com.example;

public class Nugget extends Product implements IDecayable {
    
    public Nugget(double price) {
        super(price);
    }

    public String howToUse() {
        return "Goreng Nugget terlebih dahulu dalam minyak yang panas, lalu dimakan";
    }

    public String howToSaveProduct() {
        return "Simpan Nugget dalam freezer yang memiliki suhu -10 derajat celcius";
    }

    @Override
    public String toString() {
        return "Nugget";
    }
}
