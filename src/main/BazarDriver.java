package main;

// Import the Store from the controllers package
import main.controllers.PurchaseManager;
import main.controllers.Store;
// Import the MenuInput from the utility package
import main.utility.MenuManager;

import java.awt.*;

public class BazarDriver {
    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();

        // Create instance of PurchaseManager
        PurchaseManager purchaseManager = new PurchaseManager();

        // Create an instance of Store
        Store store = new Store(menuManager, purchaseManager);

        // Run the DigitalBazar
        store.runBazar();
    }
}