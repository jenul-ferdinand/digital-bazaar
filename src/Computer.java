public class Computer extends Device {
    // Attributes
    private String manufacture = "";

    // Constructor
    Computer(String name, String description, String manufacture) {
        super(name, description);

        setManufacture(manufacture);
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
