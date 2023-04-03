// Package: main.models
package main.models;

// === === === Abstract Class: Device extended by Computer, Printer === === ===
abstract class Device {
    // Attributes
    private String name;
    private String description;
    private int id;

    /**
     * Constructs and Initialises attributes
     * @param name String the name of the device
     * @param description String the description of the device
     */
    Device(String name, String description) {
        setName(name);
        setDescription(description);
        setId(generateId());
    }

    /**
     * Abstract method to generate id for the extensions of this class
     * @return int Return the generated ID
     */
    public abstract int generateId();

    /**
     * Get the name of the device
     * @return String Return the name of the device
     */
    public String getName() {
        return name;
    }

    /**
     * Get the description of the device
     * @return String Return the description of the device
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the name of the device
     * @param name String The new name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the description of the device
     * @param description String The new description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the ID of the device
     * @return int Returns the ID of the device
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of the device
     * @param id int The new ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * toString Method
     * @return Returns the attributes as a String, nicely organised.
     */
    public String toString() {
        return "ID: " + getId() + " | Type: " + this.getClass().getSimpleName() + " | Name: " + getName() + " | Description: " + getDescription();
    }
}
