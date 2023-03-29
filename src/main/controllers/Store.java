package main.controllers;

import main.models.*;
import main.utility.MenuManager;
import main.utility.PurchaseType;
import main.utility.Utils;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Store implements IData {
    // Attributes
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;
    private MenuManager menuManager;
    private PurchaseManager purchaseManager;

    public Store(MenuManager menuManager, PurchaseManager purchaseManager) {
        // Define the MenuManager and PurchaseManager for this instance of Store
        this.menuManager = menuManager;
        this.purchaseManager = purchaseManager;

        // Initialise the ArrayLists
        computers = new ArrayList<>();
        printers = new ArrayList<>();
    }

    // Adding to the lists of the devices
    public void createComputers() {
        // Local vars
        String name, description, manufacture;

        // Initialise scanner
        Scanner sel = new Scanner(System.in);

        // Questions and assignment
        System.out.print("Enter Device Name: ");
        name = sel.nextLine();
        System.out.print("Enter Device Description: ");
        description = sel.nextLine();
        System.out.print("Enter Computer Manufacture: ");
        manufacture = sel.next();

        // Create the computer and add to the ArrayList
        Computer aComputer = new Computer(name, description, manufacture);
        computers.add(aComputer);
    }
    public void createPrinters() {
        // Local variables
        String name, description;
        int ppm;

        // Initialise scanner
        Scanner sel = new Scanner(System.in);

        // Questions and assignment
        System.out.print("Enter Device Name: ");
        name = sel.nextLine();
        System.out.print("Enter Device Description: ");
        description = sel.nextLine();
        System.out.print("Enter Printer PPM: ");
        ppm = sel.nextInt();

        // Create the printer and add the ArrayList
        Printer aPrinter = new Printer(name, description, ppm);
        printers.add(aPrinter);
    }

    // Creating a purchase
    public void createPurchase() {
        // Initialise variables to store input values
        int customerID, deviceID, type;
        String date, deliveryAddress, storeLocation;

        // Initialise scanner
        Scanner sel = new Scanner(System.in);

        // Get the customer ID
        System.out.print("Enter Customer ID: ");
        customerID = sel.nextInt();

        // Get the device ID
        System.out.print("Enter Device ID: ");
        deviceID = sel.nextInt();

        // Get the date
        System.out.print("Enter Date: ");
        date = sel.nextLine();

        // Get the type of purchase
        System.out.print("Enter Type (0 online) or (1 in-store): ");
        type = sel.nextInt();

        // Based on the input value, using the ternary operator to assign the corresponding enum
        PurchaseType purchaseType = type == 0 ? PurchaseType.ONLINE : PurchaseType.IN_STORE;

        // Depending on the purchase type, create an online or in-store purchase.
        if (purchaseType == PurchaseType.ONLINE) {
            // Get the delivery address
            System.out.println("Enter Delivery Address: ");
            deliveryAddress = sel.nextLine();

            // Create the online purchase
            Purchase aPurchase = new OnlinePurchase(Utils.nextID(100, 999), customerID, deviceID, date, purchaseType, deliveryAddress);


            // Make the purchase from PurchaseManager
            purchaseManager.makePurchase(this, aPurchase);
        } else {
            // Get the store location
            System.out.println("Enter Store Location: ");
            storeLocation = sel.nextLine();

            // Create the in store purchase
            Purchase aPurchase = new InStorePurchase(Utils.nextID(100, 999), customerID, deviceID, date, purchaseType, storeLocation);

            // Make the purchase from PurchaseManager
            purchaseManager.makePurchase(this, aPurchase);
        }


    }

    // Printing the lists of the devices
    public void printComputers() {
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(computers.get(i).getClass().getSimpleName() + " (" + i + ") " + computers.get(i).toString());
        }
    }
    public void printPrinters() {
        for (int i = 0; i < printers.size(); i++) {
            System.out.println(printers.get(i).getClass().getSimpleName() + " (" + i + ") " + printers.get(i).toString());
        }
    }

    // Method to check if the device is available, (implemented from the IData interface).
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

    // Method to run all the other methods above
    public void runBazar() {
        // Local variable selection
        int selection;

        // Do while
        do {
            // Assign selection to the return value of the menuItem method
            selection = menuManager.menuItem();

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
