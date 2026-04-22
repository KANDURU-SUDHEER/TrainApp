/**
 * ================================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application performs the following:
 * - Displays a welcome banner to the user
 * - Creates an empty train consist using a dynamic list
 * - Initializes the system without any bogies attached
 * - Displays the initial bogie count (which will be zero)
 * - Prints the current state of the train consist
 *
 * This use case introduces the basic program startup flow,
 * usage of main() method, and dynamic collection initialization
 * using ArrayList.
 *
 * Author: Developer
 * Version: 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainApp {




    public static void main(String[] args) {

        // ============================================================
        // STEP 1: Display Welcome Banner
        // ============================================================
        System.out.println("========================================");
        System.out.println("   === Train Consist Management App === ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 2: Create Dynamic List for Train Consist
        // Using List interface and ArrayList implementation
        // This allows flexible addition/removal of bogies later
        // ============================================================
        List<String> trainConsist = new ArrayList<>();

        // ============================================================
        // STEP 3: Confirm Initialization
        // ============================================================
        System.out.println("Train initialized successfully...\n");

        // ============================================================
        // STEP 4: Display Initial Bogie Count
        // Since no bogies are added, size will be 0
        // ============================================================
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // ============================================================
        // STEP 5: Display Current Train State
        // ============================================================
        System.out.println("Current Train Consist: " + trainConsist);

        // ============================================================
        // END OF UC1
        // Program will continue in next use cases
        // ============================================================
    }
}