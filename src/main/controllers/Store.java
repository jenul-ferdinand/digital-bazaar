// Package: main.controllers
package main.controllers;

// Computer, Device, InStorePurchase, OnlinePurchase, Printer, and Purchase
// MenuManager
import main.models.devices.Computer;
import main.models.devices.Printer;
import main.models.purchase.InStorePurchase;
import main.models.purchase.OnlinePurchase;
import main.models.purchase.Purchase;
import main.utility.IMenuManager;
// PurchaseType
import main.utility.PurchaseType;
// Utils
import main.utility.Utils;
// ArrayList
import java.util.ArrayList;
// Scanner
import java.util.Scanner;

import static main.utility.Utils.getStringInput;

// === === === Class === === ===
public class Store implements IData {
    // Attributes
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;
    private IMenuManager menuManager;
    private PurchaseManager purchaseManager;

    /**
     * Constructs and initialises a Store with a menu manager and purchase manager
     * @param menuManager Instance of IMenuManager
     * @param purchaseManager Instance of Purchase Manager
     *
     * @author Jenul Ferdinand
     */
    public Store(IMenuManager menuManager, PurchaseManager purchaseManager) {
        // Define the MenuManager and PurchaseManager for this instance of Store
        this.menuManager = menuManager;
        this.purchaseManager = purchaseManager;

        // Initialise the ArrayLists
        computers = new ArrayList<>();
        printers = new ArrayList<>();
    }

    /**
     * Takes user input and creates a Computer, and adds to the computers list
     *
     * @author Jenul Ferdinand
     */
    public void createComputers() throws Exception {
        // Get input
        String name = Utils.getStringInput("Enter Device Name (3-5 chars): ");
        String description = Utils.getStringInput("Enter Device Description (5-20 chars): ");
        String manufacture = Utils.getStringInput("Enter Computer Manufacture (3-15 chars): ");

        // Create the computer and add to the ArrayList
        Computer aComputer = new Computer(name, description, manufacture);
        computers.add(aComputer);
    }

    /**
     * Takes user input and creates a Printer, and adds to the printers list
     *
     * @author Jenul Ferdinand
     */
    public void createPrinters() throws Exception {
        // Get input
        String name = Utils.getStringInput("Enter Device Name (3-15 chars): ");
        String description = Utils.getStringInput("Enter Device Description (5-20 chars): ");
        int ppm = Utils.getIntegerInput("Enter Printer PPM (1-50 range): ");

        // Create the printer and add the ArrayList
        Printer aPrinter = new Printer(name, description, ppm);
        printers.add(aPrinter);
    }

    /**
     * Takes user input and creates a Purchase
     * - It could be a InStorePurchase or OnlinePurchase depending on the user's input.
     * - Calls makePurchase() from our PurchaseManager, to add to the PurchaseManager purchases list.
     *
     * @author Jenul Ferdinand
     */
    public void createPurchase() throws Exception {
        // Get input
        int customerID = Utils.getIntegerInput("Enter Customer ID: ");
        int deviceID = Utils.getIntegerInput("Enter Device ID: ");
        String date = Utils.getStringInput("Enter Date (dd/mm/yy): ");
        int type = Utils.getIntegerInput("Enter Type (0 online) or (1 in-store): ");

        // Based on the input value, using the ternary operator to assign the corresponding enum
        PurchaseType purchaseType = type == 0 ? PurchaseType.ONLINE : PurchaseType.IN_STORE;

        // Depending on the purchase type, create an online or in-store purchase.
        if (purchaseType == PurchaseType.ONLINE) {
            // Get the delivery address
            String deliveryAddress = Utils.getStringInput("Enter Delivery Address (5-20 chars): ");

            // Create the online purchase
            Purchase aPurchase = new OnlinePurchase(Utils.nextID(100, 999), customerID, deviceID, date, purchaseType, deliveryAddress);

            // Make the purchase from PurchaseManager
            purchaseManager.makePurchase(this, aPurchase);
        } else {
            // Get the store location
            String storeLocation = Utils.getStringInput("Enter Store Location (3-10 chars): ");

            // Create the in store purchase
            Purchase aPurchase = new InStorePurchase(Utils.nextID(100, 999), customerID, deviceID, date, purchaseType, storeLocation);

            // Make the purchase from PurchaseManager
            purchaseManager.makePurchase(this, aPurchase);
        }
    }

    /**
     * Prints our list of computers
     *
     * @author Jenul Ferdinand
     */
    public void printComputers() {
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(computers.get(i).getClass().getSimpleName() + " (" + i + ") " + computers.get(i).toString());
        }
    }

    /**
     * Prints our list of printers
     *
     * @author Jenul Ferdinand
     */
    public void printPrinters() {
        for (int i = 0; i < printers.size(); i++) {
            System.out.println(printers.get(i).getClass().getSimpleName() + " (" + i + ") " + printers.get(i).toString());
        }
    }

    /**
     * Check if the device is available, (implemented from the IData interface).
     * @param id ID of the device
     * @return boolean Returns a boolean if the device is available in the list
     *
     * @author Jenul Ferdinand
     */
    public boolean isDeviceAvailable(int id) {
        // Loop through the computers
        for (int i = 0; i < computers.size(); i++) {
            // Check if the id parameter is the same as the current computer of the index
            if (id == computers.get(i).getId()) {
                // Return true
                return true;
            }
        }

        // Loop through the printers
        for (int j = 0; j < printers.size(); j++) {
            // Check if the id parameter is the same as the current computer of the index
            if (id == printers.get(j).getId()) {
                // Return true
                return true;
            }
        }

        // Otherwise, return false
        return false;
    }

    /**
     * Managers user input selection, to run our methods
     *
     * @author Jenul Ferdinand
     */
    public void runBazar() throws Exception {
        // Local variable selection
        int selection;

        // Do while
        do {
            // Assign selection to the return value of the menuItem method
            selection = menuManager.menuItem();

            // If the menuManager is an Admin
            if (menuManager.getClass().getSimpleName().equals("MenuManagerAdmin")) {
                // Based on the selection integer of the user, run the specified method
                switch (selection) {
                    // Create computer
                    case 1:
                        createComputers();
                        break;
                    // Create Printer
                    case 2:
                        createPrinters();
                        break;
                    // Create Purchase
                    case 3:
                        createPurchase();
                        break;
                    // List Computers
                    case 4:
                        printComputers();
                        break;
                    // List Printers
                    case 5:
                        printPrinters();
                        break;
                    // List Purchases
                    case 6:
                        purchaseManager.printPurchases();
                        break;
                    // Exit
                    case 7:
                        System.exit(0);
                        break;
                }
            }
            // Otherwise
            else {
                // Based on the selection integer of the user, run the specified method
                switch (selection) {
                    // Create computer
                    case 1:
                        createComputers();
                        break;
                    // Create Printer
                    case 2:
                        createPrinters();
                        break;
                    // Create Purchase
                    case 3:
                        createPurchase();
                        break;
                    // Exit
                    case 4:
                        System.exit(0);
                        break;
                }
            }
        }
        while (true);
    }
}
