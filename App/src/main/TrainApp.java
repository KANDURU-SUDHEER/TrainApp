package main;

/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * This class compares execution time of loop-based filtering
 * versus stream-based filtering using System.nanoTime().
 *
 * At this stage, the application:
 * - Creates bogie test dataset
 * - Measures loop execution time
 * - Measures stream execution time
 * - Calculates elapsed duration
 * - Displays performance results
 *
 * This maps performance benchmarking using high-resolution timing.
 *
 * Author: KANDURU-SUDHEER
 * Version: 13.0
 */

import java.util.*;
import java.util.stream.Collectors;

public class TrainApp {

    // ============================================================
    // Bogie Model
    // ============================================================
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC13 - Performance Comparison ");
        System.out.println("========================================\n");

        // ============================================================
        // STEP 1: Create Large Test Dataset
        // ============================================================
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("General", 90));
        }

        // ============================================================
        // STEP 2: Loop-Based Filtering
        // ============================================================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ============================================================
        // STEP 3: Stream-Based Filtering
        // ============================================================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ============================================================
        // STEP 4: Display Results
        // ============================================================
        System.out.println("Loop Filtering Time (ns): " + loopTime);
        System.out.println("Stream Filtering Time (ns): " + streamTime);

        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        // ============================================================
        // END OF UC13
        // ============================================================
    }
}