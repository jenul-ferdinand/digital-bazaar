package main.utility;

import java.util.Scanner;

public class MenuInput {
    public static int menuItem() {
        // Initialise scanner for input
        Scanner sel = new Scanner(System.in);

        // List out the options
        System.out.println("1) New Computer");
        System.out.println("2) New Printer");
        System.out.println("3) List Computers");
        System.out.println("4) List Printers");
        System.out.println("5) Exit");
        System.out.print("Select one:");

        // Get the choice integer
        int choice = Integer.parseInt(sel.nextLine());

        // Print the choice that the user made
        System.out.println("Your choice: " + choice);

        // Return the choice as an integer
        return choice;
    }
}
