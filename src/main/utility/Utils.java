// Package: main.utility
package main.utility;

// Random
import java.util.Random;

// === === === Class: Utils === === ===
public class Utils {
    /**
     * Random value generator with minimum and maximum
     * @param low int The minimum value
     * @param high int The maximum value
     * @return int Returns the random value between the low and high
     */
    public static int nextID(int low, int high) {
        // Create a Random instance
        Random r = new Random();

        // Return a random value based on the maximum and minimum
        return (r.nextInt(high - low) + low);
    }

    public static boolean validateInputString(String input, int min, int max) {
        return input.length() >= min && input.length() <= max;
    }

    public static boolean validateInputInt(int input, int min, int max) {
        return input >= min && input <= max;
    }
}
