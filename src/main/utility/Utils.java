// Package: main.utility
package main.utility;

// Random
import java.util.Random;
import java.util.Scanner;

// === === === Class: Utils === === ===
public class Utils {
    /**
     * Random value generator with minimum and maximum
     * @param low int The minimum value
     * @param high int The maximum value
     * @return int Returns the random value between the low and high
     *
     * @author Jenul Ferdinand
     */
    public static int nextID(int low, int high) {
        // Create a Random instance
        Random r = new Random();

        // Return a random value based on the maximum and minimum
        return (r.nextInt(high - low) + low);
    }

    /**
     * Validates a string input based on the min and max
     * @param input String The input string
     * @param min int The minimum value
     * @param max int the maximum value
     * @return boolean Returns true or false based on the input string
     *
     * @author Jenul Ferdinand
     * @see main.controllers.Store
     */
    public static boolean validateInputString(String input, int min, int max) {
        return input.length() >= min && input.length() <= max;
    }

    /**
     * Validates an input integer based on the min and max
     * @param input int The input integer
     * @param min int The minimum value
     * @param max int The maximum value
     * @return boolean Returns a boolean based on if the input integer is in the range
     *
     * @author Jenul Ferdinand
     * @see main.controllers.Store
     */
    public static boolean validateInputInt(int input, int min, int max) {
        return input >= min && input <= max;
    }

    /**
     * This method is used to get input from the user and make sure they entered the correct type
     * @param statement String The message that is printed out for the user
     * @return int Returns the integer value that the user entered
     *
     * @author Jenul Ferdinand
     * @see main.controllers.Store
     */
    public static int getIntegerInput(String statement) {
        Scanner scanner = new Scanner(System.in);

        int num;

        while (true) {
            try {
                System.out.print(statement);
                num = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        return num;
    }

    /**
     * This method is used to get input from the user and make sure they entered the correct type
     * @param statement String The message that will be printed out for the user
     * @return String Returns the String value that the user entered
     *
     * @author Jenul Ferdinand
     * @see main.controllers.Store
     */
    public static String getStringInput(String statement) {
        Scanner scanner = new Scanner(System.in);

        String str;

        while (true) {
            try {
                System.out.print(statement);
                str = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        return str;
    }
}
