/**
 * ================================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * ================================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new passenger bogies to the train
 * - Displays the list of bogies
 * - Removes an existing bogie
 * - Checks whether a bogie exists
 * - Displays the final consist
 *
 * This use case introduces CRUD operations using ArrayList.
 *
 * Author: KANDURU-SUDHEER
 * Version: 2.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // ============================================================
        // STEP 1: Display Use Case Header
        // ============================================================
        System.out.println("========================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train  ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 2: Create ArrayList for Passenger Bogies
        // ============================================================
        List<String> passengerBogies = new ArrayList<>();

        // ============================================================
        // STEP 3: Add Passenger Bogies (CREATE operation)
        // ============================================================
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after addition:");
        System.out.println(passengerBogies);

        // ============================================================
        // STEP 4: Remove a Bogie (DELETE operation)
        // Removing "AC Chair"
        // ============================================================
        passengerBogies.remove("AC Chair");

        System.out.println("\nBogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // ============================================================
        // STEP 5: Check if a Bogie Exists (READ operation)
        // ============================================================
        boolean isSleeperPresent = passengerBogies.contains("Sleeper");

        System.out.println("\nIs Sleeper bogie present? " + isSleeperPresent);

        // ============================================================
        // STEP 6: Display Final Train Consist
        // ============================================================
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        // ============================================================
        // END OF UC2
        // ============================================================
    }
}