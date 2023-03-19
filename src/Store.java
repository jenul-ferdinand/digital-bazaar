public class Store {
    // Attributes
    private Computer[] computers;
    private Printer[] printers;

    // Initialise a specified amount of objects in computers and printers
    public void initStore(int numComputers, int numPrinters) {
        computers = new Computer[numComputers];
        printers = new Printer[numPrinters];
    }

    // Adding to the lists of the devices
    public void createComputers() {
        computers[0] = new Computer("XPS", "Laptop 16 inch", "Dell");
        computers[1] = new Computer("iMac", "Desktop 27 inch", "Apple");
        computers[2] = new Computer("Thinkpad", "Laptop 14 inch", "Lenovo");
    }
    public void createPrinters() {
        printers[0] = new Printer("Brother", "MFC-L2750DW Wireless Mono Laser", 34);
        printers[1] = new Printer("HP", "M282nw Color LaserJet Pro MFP", 21);
    }

    // Printing the lists of the devices
    public void printComputers() {
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getClass().getSimpleName() + " (" + i + ") " + computers[i].toString());
        }
    }
    public void printPrinters() {
        for (int i = 0; i < printers.length; i++) {
            System.out.println(printers[i].getClass().getSimpleName() + " (" + i + ") " + printers[i].toString());
        }
    }

    // Method to run all the other methods above
    public void runBazar() {
        initStore(3, 2);
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }
}
