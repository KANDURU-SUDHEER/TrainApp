package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * Author: KANDURU-SUDHEER
 * Version: 16.0
 */

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 1: Create Array of Capacities
        // ============================================================
        int[] capacities = {72, 56, 24, 70, 60};

        // ============================================================
        // STEP 2: Display Original Array
        // ============================================================
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ============================================================
        // STEP 3: Bubble Sort Logic
        // ============================================================
        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - i - 1; j++) {

                // Compare adjacent values
                if (capacities[j] > capacities[j + 1]) {

                    // Swap values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // ============================================================
        // STEP 4: Display Sorted Array
        // ============================================================
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ============================================================
        // END OF UC16
        // ============================================================
    }
}