/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList to maintain order.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays the updated train structure
 *
 * This demonstrates ordered operations using LinkedList.
 *
 * Author: KANDURU-SUDHEER
 * Version: 4.0
 */

import java.util.LinkedList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // ============================================================
        // STEP 1: Display Header
        // ============================================================
        System.out.println("========================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 2: Create LinkedList for Train Consist
        // ============================================================
        List<String> trainConsist = new LinkedList<>();

        // ============================================================
        // STEP 3: Add Bogies in Sequence
        // ============================================================
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ============================================================
        // STEP 4: Insert Pantry Car at position 2
        // ============================================================
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(trainConsist);

        // ============================================================
        // STEP 5: Remove First and Last Bogies
        // ============================================================
        trainConsist.remove(0); // remove Engine
        trainConsist.remove(trainConsist.size() - 1); // remove Guard

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(trainConsist);

        // ============================================================
        // STEP 6: Final Train Consist
        // ============================================================
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        // ============================================================
        // END OF UC4
        // ============================================================
    }
}