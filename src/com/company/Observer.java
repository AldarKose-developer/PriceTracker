package com.company;

import java.util.HashMap;

public interface Observer {
    void notifyAboutPriceUpdate(String cloth, int oldPrice, int newPrice);
}
