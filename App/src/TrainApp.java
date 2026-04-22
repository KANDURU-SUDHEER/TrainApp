/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating capacity
 * using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a list
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This demonstrates custom sorting using Comparator.
 *
 * Author: KANDURU-SUDHEER
 * Version: 7.0
 */

import java.util.*;

public class TrainApp {

    // ============================================================
    // Inner Bogie class
    // ============================================================
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        // ============================================================
        // STEP 1: Display Header
        // ============================================================
        System.out.println("========================================");
        System.out.println("   UC7 - Sort Bogies by Capacity        ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 2: Create List of Bogies
        // ============================================================
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // ============================================================
        // STEP 3: Display Unsorted Data
        // ============================================================
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ============================================================
        // STEP 4: Sort using Comparator (by capacity)
        // ============================================================
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ============================================================
        // STEP 5: Display Sorted Data
        // ============================================================
        System.out.println("\nAfter Sorting (by capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ============================================================
        // END OF UC7
        // ============================================================
    }
}