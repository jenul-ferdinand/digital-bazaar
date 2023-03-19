public class Printer extends Device {
    // Attributes
    private int ppm;

    // Constructor
    Printer(String name, String description, int ppm) {
        super(name, description);

        setPpm(ppm);
    }

    // ID Generator
    @Override
    public int generateId() {
        return Utils.nextID(100, 999);
    }

    // Getters and setters
    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    // toString
    public String toString() {
        return super.toString() + " | PPM: " + this.getPpm();
    }
}
