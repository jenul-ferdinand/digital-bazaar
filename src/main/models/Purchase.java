// Package: main.models
package main.models;

// PurchaseType
import main.utility.PurchaseType;

// === === === Abstract Class: Purchase extended by InStorePurchase, OnlinePurchase === === ===
public abstract class Purchase {
    private int purchaseID;
    private int customerID;
    private int deviceID;
    private String date;
    private PurchaseType purchaseType;

    /**
     * Constructs and initialises our attributes using the setters
     * @param purchaseID int Purchase ID
     * @param customerID int Customer ID
     * @param deviceID int Device ID
     * @param date String Date
     * @param purchaseType enum (Online or In-Store)
     */
    public Purchase(int purchaseID, int customerID, int deviceID, String date, PurchaseType purchaseType) {
        setPurchaseID(purchaseID);
        setCustomerID(customerID);
        setDeviceID(deviceID);
        setDate(date);
        setPurchaseType(purchaseType);
    }

    /**
     * Gets our purchaseID
     * @return int Returns our purchase ID
     */
    public int getPurchaseID() {
        return purchaseID;
    }

    /**
     * Sets our purchaseID
     * @param purchaseID int the integer to set
     */
    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    /**
     * Gets our customerID
     * @return int Returns our customer ID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets our customerID
     * @param customerID int The new integer to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * Gets our deviceID
     * @return int Returns our device ID
     */
    public int getDeviceID() {
        return deviceID;
    }

    /**
     * Sets our deviceID
     * @param deviceID int The new integer to set
     */
    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    /**
     * Gets our date
     * @return String Returns our date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets our date
     * @param date String the new String to set as date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets our PurchaseType
     * @return PurchaseType Returns our PurchaseType
     */
    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    /**
     * Sets our purchaseType
     * @param purchaseType PurchaseType The new PurchaseType to set (Online or In-Store)
     */
    public void setPurchaseType(PurchaseType purchaseType) {
        this.purchaseType = purchaseType;
    }

    /**
     * Returns our attributes in a String format, nicely organised.
     * @return String
     */
    public String toString() {
        return "Purchase ID: " + getPurchaseID() + " Customer ID: " + getCustomerID() + " Date: " + getDate() + " Type: " + getPurchaseType();
    }
}
