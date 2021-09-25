package com.company;
/// Hello! This is my implementation of Observer pattern
// This is application that will notify customer if the price of their chosen product decreases
public class Main {
    public static void main(String[] args) {
        ClothShop clothShop = new ClothShop();
        // I used HashMap in order to save products and their price
        // This is kinda assortment of clothes
        clothShop.addCloth("Mango cardigan", 25000);
        clothShop.addCloth("HM trousers",12990);
        clothShop.addCloth("Zara sweater", 9900);


        // This is customer that tracking 'Mango cardigan'
        Customer Nurtileu = new Customer("AldarKose","Mango cardigan");
        clothShop.registerCustomer(Nurtileu);

        // This is customer that also tracking 'Mango cardigan'
        Customer Magzhan = new Customer("make","Mango cardigan");
        clothShop.registerCustomer(Magzhan);

        // Here price of 'Mango cardigan' decreased and both Nurtileu and Magzhan gets notification about it
        clothShop.changePrice("Mango cardigan", 19900);

        // This is Alibi he is tracking 'HM trousers'
        Customer Alibi = new Customer("alibi.k","HM trousers");
        clothShop.registerCustomer(Alibi);

        // But to his regret, the price of his product has risen on the contrary ;( And he did not receive a notification
        clothShop.changePrice("HM trousers", 15900);

        // Nurtileu used a sale for 'Mango cardigan' and bought it, so he unregistered from notifications
        clothShop.unregisterCustomer(Nurtileu);

        // But the price of the cardigan also fell, and only Magzhan,
        // who decided to wait for the price drop, received a notification about this.
        clothShop.changePrice("Mango cardigan", 9900);
    }
}
