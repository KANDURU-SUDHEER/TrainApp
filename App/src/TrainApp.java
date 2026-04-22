/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key value mapping structure.
 *
 * At this stage, the application:
 * - Creates a mapping between bogie and capacity
 * - Inserts capacity values using put()
 * - Iterates through map entries
 * - Displays bogie and capacity details
 *
 * This demonstrates key value mapping using HashMap.
 *
 * Author: KANDURU-SUDHEER
 * Version: 6.0
 */

import java.util.HashMap;
import java.util.Map;

public class TrainApp {

    public static void main(String[] args) {

        // ============================================================
        // STEP 1: Display Header
        // ============================================================
        System.out.println("========================================");
        System.out.println("   UC6 - Map Bogie to Capacity          ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 2: Create HashMap
        // Stores bogie as key and capacity as value
        // ============================================================
        Map<String, Integer> capacityMap = new HashMap<>();

        // ============================================================
        // STEP 3: Insert Bogie Capacities
        // ============================================================
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 54);
        capacityMap.put("First Class", 24);

        // ============================================================
        // STEP 4: Display Bogie Capacity Details
        // ============================================================
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ============================================================
        // END OF UC6
        // ============================================================
    }
}