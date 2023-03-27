package main.utility;

import java.util.Random;

public class Utils {
    // Random value generator with high and low capping
    public static int nextID(int low, int high) {
        // Create a Random instance
        Random r = new Random();

        // Return a random value based on the maximum and minimum
        return (r.nextInt(high - low) + low);
    }
}
