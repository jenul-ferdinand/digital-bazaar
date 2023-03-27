package main.models;

import main.utility.Utils;

public class Computer extends Device {
    // Attributes
    private String manufacture;

    // Constructor
    public Computer(String name, String description, String manufacture) {
        super(name, description);

        setManufacture(manufacture);
    }

    // ID Generator
    @Override
    public int generateId() {
        return Utils.nextID(100000, 9999999);
    }

    // Getters and Setters
    public String getManufacture() {
        return manufacture;
    }
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    // toString
    public String toString() {
        return super.toString() + " | Manufacture: " + this.getManufacture();
    }
}
