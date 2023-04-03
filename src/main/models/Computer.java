// Package: main.models
package main.models;

// Utils
import main.utility.Utils;

// === === === Class: Computer child of Device === === ===
public class Computer extends Device {
    // Attributes
    private String manufacture;

    /**
     * Constructs and Initialises attributes
     * @param name The name of the Computer (String)
     * @param description The description of the Computer (String)
     * @param manufacture The manufacturer of the Computer (String)
     */
    public Computer(String name, String description, String manufacture) {
        // Set the name and description
        super(name, description);

        // Set the manufacturer
        setManufacture(manufacture);
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
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    /**
     * Returns the attributes of the class as a String
     * @return String returns the attributes as a String
     */
    public String toString() {
        return super.toString() + " | Manufacture: " + this.getManufacture();
    }
}
