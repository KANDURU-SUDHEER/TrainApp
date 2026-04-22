/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Adds bogies in order
 * - Preserves insertion sequence
 * - Prevents duplicate bogies
 * - Displays final train formation
 *
 * This demonstrates ordered uniqueness using LinkedHashSet.
 *
 * Author: KANDURU-SUDHEER
 * Version: 5.0
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // ============================================================
        // STEP 1: Display Header
        // ============================================================
        System.out.println("========================================");
        System.out.println("   UC5 - Preserve Insertion Order       ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 2: Create LinkedHashSet
        // Maintains order + prevents duplicates
        // ============================================================
        Set<String> formation = new LinkedHashSet<>();

        // ============================================================
        // STEP 3: Add Bogies
        // ============================================================
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate entry (will be ignored)
        formation.add("Sleeper");

        // ============================================================
        // STEP 4: Display Final Formation
        // ============================================================
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        // ============================================================
        // END OF UC5
        // ============================================================
    }
}