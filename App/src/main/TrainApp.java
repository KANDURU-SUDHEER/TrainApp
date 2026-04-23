package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted results
 *
 * This maps optimized sorting using Java library utilities.
 *
 * Author: KANDURU-SUDHEER
 * Version: 17.0
 */

import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 1: Create Array of Bogie Names
        // ============================================================
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // ============================================================
        // STEP 2: Display Original Array
        // ============================================================
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        // ============================================================
        // STEP 3: Sort Using Arrays.sort()
        // ============================================================
        Arrays.sort(bogies);

        // ============================================================
        // STEP 4: Display Sorted Array
        // ============================================================
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogies));

        // ============================================================
        // END OF UC17
        // ============================================================
    }
}