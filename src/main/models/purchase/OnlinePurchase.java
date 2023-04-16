// Package: main.models
package main.models.purchase;

// PurchaseType
import main.utility.PurchaseType;
import main.utility.Utils;

// === === === Class: OnlinePurchase child of Purchase === === ===
public class OnlinePurchase extends Purchase {
    private String deliveryAddress;
    private static final int MIN_DELIVERY_ADDRESS_LENGTH = 5;
    private static final int MAX_DELIVERY_ADDRESS_LENGTH = 20;

    /**
     * Constructs and initialises attributes
     * @param purchaseID int Purchase ID
     * @param customerID int Customer ID
     * @param deviceID int Device ID
     * @param date String Date
     * @param purchaseType enum Purchase Type (Online or In-Store)
     * @param deliveryAddress String Delivery Address
     *
     * @author Jenul Ferdinand
     */
    public OnlinePurchase(int purchaseID, int customerID, int deviceID, String date, PurchaseType purchaseType, String deliveryAddress) throws Exception {
        super(purchaseID, customerID, deviceID, date, purchaseType);

        if (!setDeliveryAddress(deliveryAddress)) {
            throw new Exception("Incorrect delivery address details!");
        }
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean setDeliveryAddress(String deliveryAddress) {
        // Input validation
        boolean valid = Utils.validateInputString(deliveryAddress, MIN_DELIVERY_ADDRESS_LENGTH, MAX_DELIVERY_ADDRESS_LENGTH);

        // Set the delivery address if valid
        if (valid) { this.deliveryAddress = deliveryAddress; }

        // Return the boolean value of valid
        return valid;
    }
}
