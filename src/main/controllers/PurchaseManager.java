// Package: main.controllers
package main.controllers;

// Purchase
import main.models.purchase.Purchase;
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
    public void printPurchases() {
        // Set up the header format
        String leftAlignFormat = "| %-5d | %-5d | %-10s | %-8s |%n";
        String leftAlignFormatHeader = "| %-5s | %-5s | %-10s | %-8s |%n";

        String header = String.format(leftAlignFormatHeader, "C-I","D-ID","Date","Type");
        int headerLen = header.length() - 1; // -1 to ignore the return key
        String border = String.format("%" + headerLen + "s", " ").replace(' ', '-');
        System.out.format("%s\n", border);

        // Print the headers
        System.out.format(leftAlignFormatHeader, "C-I","D-ID","Date","Type");
        System.out.format("%s\n", border);

        // Elements of the table
        for (int i = 0; i < purchases.size(); i++) {
            System.out.format(leftAlignFormat,
                    purchases.get(i).getPurchaseID(),
                    purchases.get(i).getCustomerID(),
                    purchases.get(i).getDate(),
                    purchases.get(i).getPurchaseType()
            );
        }
        System.out.format("%s\n", border);
    }
}
