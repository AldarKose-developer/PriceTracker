package com.company;

public interface Observable{
    void registerCustomer(Observer observer);
    void unregisterCustomer(Observer observer);
    void notifyAboutPrice(String cloth, int oldPrice, int newPrice);


}
