package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception.
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity <= 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * Author: KANDURU-SUDHEER
 * Version: 14.0
 */

import java.util.*;

public class TrainApp {

    // ============================================================
    // CUSTOM EXCEPTION
    // ============================================================
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ============================================================
    // Passenger Bogie Model with Validation
    // ============================================================
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {

            // Validate capacity
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("========================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogie
            bogies.add(new PassengerBogie("Sleeper", 72));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("AC Chair", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        // ============================================================
        // END OF UC14
        // ============================================================
    }
}