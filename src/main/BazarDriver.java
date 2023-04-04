// Package: main
package main;

// PurchaseManager
import main.controllers.PurchaseManager;
// Store
import main.controllers.Store;
// MenuManager
import main.utility.IMenuManager;
import main.utility.MenuManagerAdmin;
import main.utility.MenuManagerEmployee;

// === === === Driver Class: BazarDriver === === ===
public class BazarDriver {
    /**
     * The main method of the project, the driver.
     * @param args
     */
    public static void main(String[] args) {
        try {
            // Create instance of the MenuManager
            IMenuManager menuManagerAdmin = new MenuManagerAdmin();

            // Create instance of PurchaseManager
            PurchaseManager purchaseManager = new PurchaseManager();

            // Create an instance of Store
            Store store = new Store(menuManagerAdmin, purchaseManager);

            // Run the DigitalBazar
            store.runBazar();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}