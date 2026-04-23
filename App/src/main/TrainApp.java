package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates efficient searching of a bogie ID
 * using Binary Search on sorted data.
 *
 * At this stage, the application:
 * - Creates a sorted array of bogie IDs
 * - Initializes low and high indexes
 * - Finds middle index
 * - Compares key using compareTo()
 * - Halves search range
 * - Displays result
 *
 * This maps optimized searching using divide-and-conquer.
 *
 * Author: KANDURU-SUDHEER
 * Version: 19.0
 */

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 1: Create SORTED Array of Bogie IDs
        // ============================================================
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // ============================================================
        // STEP 2: Define Search Key
        // ============================================================
        String searchId = "BG309";

        // ============================================================
        // STEP 3: Initialize low and high indexes
        // ============================================================
        int low = 0;
        int high = bogieIds.length - 1;

        boolean found = false;

        // ============================================================
        // STEP 4: Binary Search Logic
        // ============================================================
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchId.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // ============================================================
        // STEP 5: Display Result
        // ============================================================
        if (found) {
            System.out.println("Bogie ID " + searchId + " found");
        } else {
            System.out.println("Bogie ID " + searchId + " not found");
        }

        // ============================================================
        // END OF UC19
        // ============================================================
    }
}