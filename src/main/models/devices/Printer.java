// Package: main.models
package main.models.devices;

// Utils
import main.utility.Utils;

// === === === Class: Printer child of Device === === ===
public class Printer extends Device {
    // Attributes
    private int ppm;

    /**
     * Constructs and Initialises attributes
     * @param name The name of the Printer (String)
     * @param description The description of the Printer (String)
     * @param ppm The parts per million of the Printer (int)
     */
    public Printer(String name, String description, int ppm) {
        super(name, description);

        setPpm(ppm);
    }

    /**
     * ID Generator (abstract extension from Device)
     * @return int Returns a random value between the low and high
     */
    @Override
    public int generateId() {
        return Utils.nextID(100, 999);
    }

    /**
     * Gets the parts per million of the printer
     * @return int Returns the ppm value
     */
    public int getPpm() {
        return ppm;
    }

    /**
     * Sets the ppm value
     * @param ppm The int value to set
     */
    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    /**
     * Returns the attributes of the class as a String
     * @return String returns the attributes as a String
     */
    public String toString() {
        return super.toString() + " | PPM: " + this.getPpm();
    }
}
