package com.example;
import java.util.ArrayList;

public class Store {
    private ArrayList<Product> stock = new ArrayList<>(); 
    private ArrayList<IDecayable> stockDecayable = new ArrayList<>();

    public void addProduct(Product thing) {
        if (thing instanceof IDecayable) {
            stockDecayable.add((IDecayable) thing);
        }
        stock.add((Product) thing);
    }

    public boolean searchDecayableProduct(IDecayable thing) {
        for (int i = 0; i < stockDecayable.size(); i++) {
            if (stockDecayable.get(i) == thing) {
                return true;
            }
        }
        return false;
    }

    public void displayAllHowToUse() {
        for (int i = 0; i < stock.size(); i++) {
            System.out.println("Cara Penggunaan " + stock.get(i) + " : " + stock.get(i).howToUse() );
        }
    }

    public void getHowToSaveProduct(IDecayable thing) {
        if (searchDecayableProduct(thing)) {
            System.out.println("Cara penyimpanan " + thing +" adalah : " + thing.howToSaveProduct());
        } else {
            System.out.println("Barang tidak terdapat di dalam stock!");
        }
    }

}
