package main;

// Import the Store from the controllers package
import main.controllers.PurchaseManager;
import main.controllers.Store;
// Import the MenuInput from the utility package
import main.utility.MenuInput;

public class BazarDriver {
    public static void main(String[] args) {
        // Create an instance of Store
        Store store = new Store();

        // Run the DigitalBazar
        store.runBazar();

        // Local variable selection
        int selection;


        PurchaseManager manager = new PurchaseManager();

        // Do while
        do {
            // Assign selection to the return value of the menuItem method
            selection = MenuInput.menuItem();

            switch (selection) {
                // Create computer
                case 1:
                    store.createComputers();
                    break;
                // Create Printer
                case 2:
                    store.createPrinters();
                    break;
                // Create Purchase
                case 3:

                    break;
                // List Computers
                case 4:
                    store.printComputers();
                    break;
                // List Printers
                case 5:
                    store.printPrinters();
                    break;
                // List Purchases
                case 6:

                    break;
                // Exit
                case 7:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}