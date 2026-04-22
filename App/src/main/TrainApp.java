package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * This maps real-world cargo safety rules using Streams.
 *
 * Author: KANDURU-SUDHEER
 * Version: 12.0
 */

import java.util.*;

public class TrainApp {

    // ============================================================
    // Goods Bogie Model
    // ============================================================
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 1: Create Goods Bogie List
        // ============================================================
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        // ============================================================
        // STEP 2: Display Bogies
        // ============================================================
        System.out.println("Goods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g);
        }

        // ============================================================
        // STEP 3: Apply Safety Validation using Stream
        // Rule: Cylindrical -> only Petroleum allowed
        // ============================================================
        boolean isSafe = goodsBogies.stream()
                .allMatch(g ->
                        !g.type.equalsIgnoreCase("Cylindrical")
                                || g.cargo.equalsIgnoreCase("Petroleum")
                );

        // ============================================================
        // STEP 4: Display Safety Status
        // ============================================================
        System.out.println("\nTrain Safety Status: " + (isSafe ? "SAFE" : "UNSAFE"));

        // ============================================================
        // END OF UC12
        // ============================================================
    }
}