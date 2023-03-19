public class BazarDriver {
    public static void main(String[] args) {
        // Create an instance of Store
        Store store = new Store();

        // Run the DigitalBazar
        store.runBazar();

        // Local variable selection
        int selection;

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
                // List Computers
                case 3:
                    store.printComputers();
                    break;
                // List Printers
                case 4:
                    store.printPrinters();
                    break;
                // Exit
                case 5:
                    System.exit(0);
            }
        }
        while (true);
    }
}