abstract class Device {
    // Attributes
    private String name;
    private String description;
    private int id;

    // Constructor
    Device(String name, String description) {
        setName(name);
        setDescription(description);
        setId(id);
    }

    public abstract int generateId();

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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // toString Method
    public String toString() {
        return "| Type: " + this.getClass().getSimpleName() + " | Name: " + getName() + " | Description: " + getDescription();
    }
}
