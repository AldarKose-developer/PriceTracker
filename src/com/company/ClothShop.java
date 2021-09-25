package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClothShop implements Observable {
    private HashMap<String, Integer> clothesAndPrice = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCloth(String cloth, int price) {
        clothesAndPrice.put(cloth, price);
    }

    public void deleteCloth(String cloth) {
        clothesAndPrice.remove(cloth);
    }

    public void changePrice(String cloth, int newPrice) {
        int oldPrice = clothesAndPrice.get(cloth);
        clothesAndPrice.replace(cloth, newPrice);
        if (oldPrice > newPrice) {
            notifyAboutPrice(cloth, oldPrice, newPrice);
        }
    }

    @Override
    public void registerCustomer(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterCustomer(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAboutPrice(String cloth, int oldPrice, int newPrice) {
        for (Observer observer : observers) {
            observer.notifyAboutPriceUpdate(cloth, oldPrice, newPrice);
        }
    }
}
