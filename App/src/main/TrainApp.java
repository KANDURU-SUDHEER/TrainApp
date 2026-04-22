/**
 * ================================================================
 * MAIN CLASS - TrainApp
 * ================================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * Author: KANDURU-SUDHEER
 * Version: 8.0
 */

import java.util.*;
import java.util.stream.Collectors;

public class TrainApp {

    // Bogie class
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

        System.out.println("========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("========================================\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Stream filtering
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);

        System.out.println("\nUC8 filtering completed...");
    }
}