package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 20: Prevent Search on Empty Train
 *
 * Description:
 * This class prevents search operations when no bogies
 * are present using defensive programming.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates collection state
 * - Throws IllegalStateException if empty
 * - Stops execution immediately
 * - Displays meaningful error
 *
 * This maps fail-fast validation using runtime exceptions.
 *
 * Author: KANDURU-SUDHEER
 * Version: 20.0
 */

import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC20 - Prevent Search on Empty Train ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 1: Create Bogie Collection (Empty List)
        // ============================================================
        List<String> bogies = new ArrayList<>();

        // ============================================================
        // STEP 2: Validate State Before Search
        // ============================================================
        if (bogies.isEmpty()) {
            throw new IllegalStateException("No bogies available for search operation");
        }

        // ============================================================
        // STEP 3: Perform Search (will not execute if empty)
        // ============================================================
        String searchId = "BG101";

        boolean found = false;
        for (String id : bogies) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // ============================================================
        // STEP 4: Display Result
        // ============================================================
        if (found) {
            System.out.println("Bogie found");
        } else {
            System.out.println("Bogie not found");
        }

        // ============================================================
        // END OF UC20
        // ============================================================
    }
}