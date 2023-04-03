// Package: main.models
package main.models.purchase;

// PurchaseType
import main.utility.PurchaseType;

// === === === Class: InStorePurchase child of Purchase === === ===
public class InStorePurchase extends Purchase {
    private String storeLocation;

    /**
     * Constructs and Initialises attributes
     * @param purchaseID int Purchase ID
     * @param customerID int Customer ID
     * @param deviceID int Device ID
     * @param date String Date
     * @param purchaseType enum Purchase Type (Online or In-Store)
     * @param storeLocation String Store Location
     */
    public InStorePurchase(int purchaseID, int customerID, int deviceID, String date, PurchaseType purchaseType, String storeLocation) {
        super(purchaseID, customerID, deviceID, date, purchaseType);

        setStoreLocation(storeLocation);
    }

    /**
     * Get the storeLocation
     * @return String Returns the location of the store as a String
     */
    public String getStoreLocation() {
        return storeLocation;
    }

    /**
     * Sets the storeLocation
     * @param storeLocation String The name of the store location to set
     */
    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
}
