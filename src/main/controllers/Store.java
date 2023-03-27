package main.controllers;

import main.models.Computer;
import main.models.Printer;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    // Attributes
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;

    // Initialise a specified amount of objects in computers and printers
    public void initStore(int numComputers, int numPrinters) {
        computers = new ArrayList<Computer>(numComputers);
        printers = new ArrayList<Printer>(numPrinters);
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

    // Method to run all the other methods above
    public void runBazar() {
        initStore(3, 2);
        printComputers();
        printPrinters();
    }
}
