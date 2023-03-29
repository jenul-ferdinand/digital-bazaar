package main.controllers;

import main.models.Purchase;

import java.util.ArrayList;

public class PurchaseManager {
    private ArrayList<Purchase> purchases = new ArrayList<>();

    // This method is called in the CreatePurchase method inside Store
    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())) {
            purchases.add(data);
        }
    }

    // Implement print purchase method here

}
