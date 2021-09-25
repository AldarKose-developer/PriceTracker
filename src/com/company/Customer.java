package com.company;

public class Customer implements Observer{
    private String login;
    private String trackingCloth;

    public Customer(String login, String trackingCloth) {
        this.login = login;
        this.trackingCloth = trackingCloth;
    }

    @Override
    public void notifyAboutPriceUpdate(String cloth, int oldPrice, int newPrice) {
        if(cloth.equals(trackingCloth)) {
            System.out.println("Hello " + login + " \nproduct: " + trackingCloth + " with old price " +
                    oldPrice + " changed to: " + newPrice + "\nSale: " + (float)newPrice/oldPrice*100 + " %\n");
        }
    }
}
