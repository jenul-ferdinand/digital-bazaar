// Package: main.models
package main.models.devices;

// Utils
import main.utility.Utils;

// === === === Class: Printer child of Device === === ===
public class Printer extends Device {
    // Attributes
    private int ppm;
    private static final int MIN_PPM = 1;
    private static final int MAX_PPM = 50;

    /**
     * Constructs and Initialises attributes
     * @param name The name of the Printer (String)
     * @param description The description of the Printer (String)
     * @param ppm The parts per million of the Printer (int)
     *
     * @author Jenul Ferdinand
     */
    public Printer(String name, String description, int ppm) throws Exception {
        // Set the name and description
        super(name, description);

        // Set the ppm and handle exception
        if (!setPpm(ppm)) {
            throw new Exception("Invalid PPM");
        }
    }

    /**
     * ID Generator (abstract extension from Device)
     * @return int Returns a random value between the low and high
     *
     * @author Jenul Ferdinand
     */
    @Override
    public int generateId() {
        return Utils.nextID(100, 999);
    }

    /**
     * Gets the parts per million of the printer
     * @return int Returns the ppm value
     *
     * @author Jenul Ferdinand
     */
    public int getPpm() {
        return ppm;
    }

    /**
     * Sets the ppm value
     * @param ppm The int value to set
     *
     * @author Jenul Ferdinand
     */
    public boolean setPpm(int ppm) {
        // Input validation
        boolean valid = Utils.validateInputInt(ppm, MIN_PPM, MAX_PPM);

        // Set the new ppm if valid
        if (valid) { this.ppm = ppm; }

        // Return the boolean result
        return valid;
    }

    /**
     * Returns the attributes of the class as a String
     * @return String returns the attributes as a String
     *
     * @author Jenul Ferdinand
     */
    public String toString() {
        return super.toString() + " | PPM: " + this.getPpm();
    }
}
