package main.models;

import main.utility.PurchaseType;

public class OnlinePurchase extends Purchase {
    private String deliveryAddress;

    public OnlinePurchase(int purchaseID, int customerID, int deviceID, String date, PurchaseType purchaseType, String deliveryAddress) {
        super(purchaseID, customerID, deviceID, date, purchaseType);

        setDeliveryAddress(deliveryAddress);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
