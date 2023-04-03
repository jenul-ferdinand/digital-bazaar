// Package: main.models
package main.models.purchase;

// PurchaseType
import main.utility.PurchaseType;

// === === === Class: OnlinePurchase child of Purchase === === ===
public class OnlinePurchase extends Purchase {
    private String deliveryAddress;

    /**
     * Constructs and initialises attributes
     * @param purchaseID int Purchase ID
     * @param customerID int Customer ID
     * @param deviceID int Device ID
     * @param date String Date
     * @param purchaseType enum Purchase Type (Online or In-Store)
     * @param deliveryAddress String Delivery Address
     */
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
