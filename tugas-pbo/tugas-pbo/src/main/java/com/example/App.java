package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // membuat produk 
        Pen pulpen = new Pen(12.500);
        Book novel = new Book(65.000);
        Nugget nuggetAyam = new Nugget(32.250);
        IceCream esKrim = new IceCream(5.000);

        // membuat toko baru
        Store myStore = new Store();
        
        // menambahkan produk ke dalam stock toko
        myStore.addProduct(pulpen);
        myStore.addProduct(novel);
        myStore.addProduct(nuggetAyam);
        myStore.addProduct(esKrim);

        // mendisplay seluruh penggunaan barang
        myStore.displayAllHowToUse();

        // mendapatkan cara save product
        myStore.getHowToSaveProduct(esKrim);
        myStore.getHowToSaveProduct(nuggetAyam);


    }
}
