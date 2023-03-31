// Package: main
package main;

// PurchaseManager
import main.controllers.PurchaseManager;
// Store
import main.controllers.Store;
// MenuManager
import main.utility.MenuManager;

// === === === Driver Class: BazarDriver === === ===
public class BazarDriver {
    /**
     * The main method of the project, the driver.
     * @param args
     */
    public static void main(String[] args) {
        // Create instance of the MenuManager
        MenuManager menuManager = new MenuManager();

        // Create instance of PurchaseManager
        PurchaseManager purchaseManager = new PurchaseManager();

        // Create an instance of Store
        Store store = new Store(menuManager, purchaseManager);

        // Run the DigitalBazar
        store.runBazar();
    }
}