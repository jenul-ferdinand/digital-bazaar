package main.models;

import main.utility.PurchaseType;

abstract class Purchase {
    private int purchaseID;
    private int customerID;
    private int deviceID;
    private String date;
    PurchaseType purchaseType;

    Purchase(int purchaseID, int customerID, int deviceID, PurchaseType purchaseType, String date) {
        setPurchaseID(purchaseID);
        setCustomerID(customerID);
        setDeviceID(deviceID);
        setDate(date);
        setPurchaseType(purchaseType);
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String toString() {
        return "Purchase ID: " + getPurchaseID() + " Customer ID: " + getCustomerID() + " Date: " + getDate() + " Type: " + getType();
    }
}
