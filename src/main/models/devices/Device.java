// Package: main.models
package main.models.devices;

import main.utility.Utils;

// === === === Abstract Class: Device extended by Computer, Printer === === ===
abstract class Device {
    // Attributes
    private String name;
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MAX_NAME_LENGTH = 15;

    private String description;
    private static final int MIN_DESC_LENGTH = 5;
    private static final int MAX_DESC_LENGTH = 20;

    private int id;

    /**
     * Constructs and Initialises attributes
     * @param name String the name of the device
     * @param description String the description of the device
     *
     * @author Jenul Ferdinand
     */
    Device(String name, String description) throws Exception {
        // Set the name and handle exception
        if (!setName(name)) {
            throw new Exception("Incorrect name details!");
        }

        // Set the description and handle exception
        if (!setDescription(description)) {
            throw new Exception("Incorrect description details!");
        }

        // Generate a random device id
        setId(generateId());
    }

    /**
     * Abstract method to generate id for the extensions of this class
     * @return int Return the generated ID
     *
     * @author Jenul Ferdinand
     */
    public abstract int generateId();

    /**
     * Get the name of the device
     * @return String Return the name of the device
     *
     * @author Jenul Ferdinand
     */
    public String getName() {
        return name;
    }

    /**
     * Get the description of the device
     * @return String Return the description of the device
     *
     * @author Jenul Ferdinand
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the name of the device
     * @param name String The new name to set
     * @return boolean True or false based on user input validity
     *
     * @author Jenul Ferdinand
     */
    public boolean setName(String name) {
        // Input validation
        boolean valid = Utils.validateInputString(name, MIN_NAME_LENGTH, MAX_NAME_LENGTH);

        // Set new name if valid
        if (valid) { this.name = name; }

        // Return the boolean result
        return valid;
    }

    /**
     * Sets the description of the device
     * @param description String The new description to set
     *
     * @author Jenul Ferdinand
     */
    public boolean setDescription(String description) {
        // Input validation
        boolean valid = Utils.validateInputString(description, MIN_DESC_LENGTH, MAX_DESC_LENGTH);

        // Set new description
        if (valid) { this.description = description; }

        // Return the boolean result
        return valid;
    }

    /**
     * Get the ID of the device
     * @return int Returns the ID of the device
     *
     * @author Jenul Ferdinand
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of the device
     * @param id int The new ID to set
     *
     * @author Jenul Ferdinand
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * toString Method
     * @return Returns the attributes as a String, nicely organised.
     *
     * @author Jenul Ferdinand
     */
    public String toString() {
        return "ID: " + getId() + " | Type: " + this.getClass().getSimpleName() + " | Name: " + getName() + " | Description: " + getDescription();
    }
}
