// Package: main.controllers
package main.controllers;

// Purchase
import main.models.Purchase;
// ArrayList
import java.util.ArrayList;

// === === === Class: PurchaseManager === === ===
public class PurchaseManager {
    // ArrayList to store our purchases
    private ArrayList<Purchase> purchases = new ArrayList<>();

    /**
     * Checks if the Purchase is available and adds the purchase to the purchases list.
     * This method is called in the CreatePurchase method inside Store
     * @param devices Instance of IData, which is passed in through Store, createPurchase()
     * @param data Instance of purchase, which is passed in through Store, createPurchase()
     */
    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())) {
            // Add to the purchases ArrayList
            purchases.add(data);
        }
    }

    // Implement print purchase method here

}
