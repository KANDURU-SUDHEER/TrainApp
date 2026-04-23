package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using a simple Linear Search algorithm.
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses array sequentially
 * - Stops when match is found
 * - Displays search result
 *
 * This maps basic searching logic using sequential traversal.
 *
 * Author: KANDURU-SUDHEER
 * Version: 18.0
 */

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 1: Create Array of Bogie IDs
        // ============================================================
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // ============================================================
        // STEP 2: Define Search Key
        // ============================================================
        String searchId = "BG309";

        // ============================================================
        // STEP 3: Display Available IDs
        // ============================================================
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ============================================================
        // STEP 4: Linear Search Logic
        // ============================================================
        boolean found = false;

        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                found = true;
                break; // early termination
            }
        }

        // ============================================================
        // STEP 5: Display Result
        // ============================================================
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " found");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " not found");
        }

        // ============================================================
        // END OF UC18
        // ============================================================
    }
}