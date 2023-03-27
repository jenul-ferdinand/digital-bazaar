package main.controllers;

import main.models.Purchase;
import main.utility.PurchaseType;
import main.utility.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class PurchaseManager {

    private ArrayList<Purchase> purchases = new ArrayList<>();

    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())) {
            createPurchase();
        }
    }

    public void createPurchase() {
        int customerID, deviceID, type;
        String date, deliveryAddress, storeLocation;

        // Initialise scanner
        Scanner sel = new Scanner(System.in);

        // Questions and assignment
        System.out.print("Enter Customer ID: ");
        customerID = sel.nextInt();
        System.out.print("Enter Device ID: ");
        deviceID = sel.nextInt();
        System.out.print("Enter Date: ");
        date = sel.nextLine();
        System.out.print("Enter Type (0 online) or (1 in-store): ");
        type = sel.nextInt();
        PurchaseType purchaseType = type == 0 ? PurchaseType.ONLINE : PurchaseType.IN_STORE;

        if (purchaseType == PurchaseType.ONLINE) {
            System.out.println("Enter Delivery Address: ");
            deliveryAddress = sel.nextLine();
        } else {
            System.out.println("Enter Store Location: ");
            storeLocation = sel.nextLine();
        }

        Purchase aPurchase = new Purchase(Utils.nextID(100, 999), customerID, deviceID, date, purchaseType);
        purchases.add(aPurchase);
    }
}
