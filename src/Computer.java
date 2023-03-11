public class Computer extends Device {
    // Attributes
    private String manufacture = "";

    // Constructor
    Computer(String name, String description, String manufacture) {
        super(name, description);

        setManufacture(manufacture);
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
