public class Device {
    // Attributes
    private String name = "";
    private String description = "";

    // Constructor
    Device(String name, String description) {
        setName(name);
        setDescription(description);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // toString Method
    public String toString() {
        return "| Type: " + this.getClass().getSimpleName() + " | Name: " + getName() + " | Description: " + getDescription();
    }
}
