package main.models;

import main.utility.PurchaseType;

public class InStorePurchase extends Purchase {
    private String storeLocation;

    public InStorePurchase(int purchaseID, int customerID, int deviceID, String date, PurchaseType purchaseType, String storeLocation) {
        super(purchaseID, customerID, deviceID, date, purchaseType);

        setStoreLocation(storeLocation);
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
}
