// Package: main.models
package main.models.devices;

// Utils
import main.utility.Utils;

// === === === Class: Computer child of Device === === ===
public class Computer extends Device {
    // Attributes
    private String manufacture;
    private static final int MIN_MANUFACTURE_LENGTH = 3;
    private static final int MAX_MANUFACTURE_LENGTH = 15;

    /**
     * Constructs and Initialises attributes
     * @param name The name of the Computer (String)
     * @param description The description of the Computer (String)
     * @param manufacture The manufacturer of the Computer (String)
     */
    public Computer(String name, String description, String manufacture) throws Exception {
        // Set the name and description
        super(name, description);

        // Set the manufacturer and handle exception
        if (!setManufacture(manufacture)) {
            throw new Exception("Incorrect manufacturer details");
        }
    }

    /**
     * ID Generator (abstract extension from Device)
     * @return int Returns a random value between the low and high
     */
    @Override
    public int generateId() {
        return Utils.nextID(100000, 9999999);
    }

    /**
     * Get the manufacturer
     * @return String returns the manufacturer
     */
    public String getManufacture() {
        return manufacture;
    }

    /**
     * Set the manufacturer
     * @param manufacture The String to set
     */
    public boolean setManufacture(String manufacture) {
        // Guardian
        if (manufacture.length() < MIN_MANUFACTURE_LENGTH || manufacture.length() > MAX_MANUFACTURE_LENGTH) {
            // Unsuccessful
            return false;
        }

        // Set the name
        this.manufacture = manufacture;

        // Done
        return true;
    }

    /**
     * Returns the attributes of the class as a String
     * @return String returns the attributes as a String
     */
    public String toString() {
        return super.toString() + " | Manufacture: " + this.getManufacture();
    }
}
