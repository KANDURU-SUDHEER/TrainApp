/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not added
 * into the train using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicate entries automatically
 * - Displays only unique bogie IDs
 *
 * This demonstrates uniqueness using Set (HashSet).
 *
 * Author: KANDURU-SUDHEER
 * Version: 3.0
 */

import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // ============================================================
        // STEP 1: Display Header
        // ============================================================
        System.out.println("========================================");
        System.out.println("   UC3 - Track Unique Bogie IDs         ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 2: Create HashSet for Bogie IDs
        // HashSet stores only unique values
        // ============================================================
        Set<String> bogies = new HashSet<>();

        // ============================================================
        // STEP 3: Add Bogie IDs (including duplicates)
        // ============================================================
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("BG101");
        bogies.add("BG102");

        // ============================================================
        // STEP 4: Display Unique Bogie IDs
        // ============================================================
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);

        // ============================================================
        // END OF UC3
        // ============================================================
    }
}