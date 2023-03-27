package main.models;

import main.utility.PurchaseType;

public class OnlinePurchase extends Purchase {
    private String deliveryAddress;

    OnlinePurchase(int purchaseID, int customerID, int deviceID, PurchaseType purchaseType, String date, String deliveryAddress) {
        super(purchaseID, customerID, deviceID, purchaseType, date);

        setDeliveryAddress(deliveryAddress);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
