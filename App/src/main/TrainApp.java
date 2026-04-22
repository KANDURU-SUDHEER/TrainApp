package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using structured
 * exception handling blocks.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 *
 * This maps runtime safety handling using try-catch-finally.
 *
 * Author: KANDURU-SUDHEER
 * Version: 15.0
 */

import java.util.*;

public class TrainApp {

    // ============================================================
    // CUSTOM RUNTIME EXCEPTION
    // ============================================================
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ============================================================
    // Goods Bogie Model
    // ============================================================
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {

            try {
                // Rule: Rectangular bogie cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe cargo: Rectangular bogie cannot carry Petroleum");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed\n");
            }
        }

        @Override
        public String toString() {
            return shape + " -> " + (cargo != null ? cargo : "No Cargo");
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("========================================\n");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // Continue execution
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        // ============================================================
        // END OF UC15
        // ============================================================
    }
}