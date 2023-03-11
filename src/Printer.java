public class Printer extends Device {
    private int ppm = 1;

    Printer(String name, String description, int ppm) {
        super(name, description);

        setPpm(ppm);
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }
}
