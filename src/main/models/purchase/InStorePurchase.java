// Package: main.models
package main.models.purchase;

// PurchaseType
import main.utility.PurchaseType;
import main.utility.Utils;

// === === === Class: InStorePurchase child of Purchase === === ===
public class InStorePurchase extends Purchase {
    private String storeLocation;
    private static final int MIN_STORE_LOCATION_LENGTH = 3;
    private static final int MAX_STORE_LOCATION_LENGTH = 10;

    /**
     * Constructs and Initialises attributes
     * @param purchaseID int Purchase ID
     * @param customerID int Customer ID
     * @param deviceID int Device ID
     * @param date String Date
     * @param purchaseType enum Purchase Type (Online or In-Store)
     * @param storeLocation String Store Location
     */
    public InStorePurchase(int purchaseID, int customerID, int deviceID, String date, PurchaseType purchaseType, String storeLocation) throws Exception {
        super(purchaseID, customerID, deviceID, date, purchaseType);

        // Set the store location and handle exceptions
        if (!setStoreLocation(storeLocation)) {
            throw new Exception("Incorrect Store Location Details!");
        }
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
    public boolean setStoreLocation(String storeLocation) {
        // Input validation
        boolean valid = Utils.validateInputString(storeLocation, MIN_STORE_LOCATION_LENGTH, MAX_STORE_LOCATION_LENGTH);

        // Set the store location if valid
        if (valid) { this.storeLocation = storeLocation; }

        // Return the boolean result
        return valid;
    }
}
