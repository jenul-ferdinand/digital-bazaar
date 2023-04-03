package main.utility;

import java.util.Scanner;

// === === === Class: MenuManagerEmployee === === ===
public class MenuManagerEmployee implements IMenuManager {
    /**
     * Prints and Manages the menu options
     * This method will print out the different options that the user can choose.
     * It also has functionality to take input from the user. Therefore, it will
     * return the integer choice of the user.
     * @return int The integer choice of the user
     */
    public int menuItem() {
        // Initialise scanner for input
        Scanner sel = new Scanner(System.in);

        // List out the options
        System.out.println("1) New Computer");
        System.out.println("2) New Printer");
        System.out.println("3) New Purchase");
        System.out.println("4) List Computers");
        System.out.println("5) List Printers");
        System.out.println("6) List Purchases");
        System.out.println("7) Exit");
        System.out.print("Select one:");

        // Get the choice integer
        int choice = Integer.parseInt(sel.nextLine());

        // Print the choice that the user made
        System.out.println("Your choice: " + choice);

        // Return the choice as an integer
        return choice;
    }
}
