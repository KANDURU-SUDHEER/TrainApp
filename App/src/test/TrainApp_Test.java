package test;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainApp_Test {

    private boolean safeSearch(List<String> list, String key) {

        // Defensive check
        if (list.isEmpty()) {
            throw new IllegalStateException("No bogies available");
        }

        for (String id : list) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Test
    void testSearch_EmptyListThrowsException() {
        List<String> list = new ArrayList<>();

        assertThrows(IllegalStateException.class, () -> {
            safeSearch(list, "BG101");
        });
    }

    @Test
    void testSearch_NonEmptyListWorks() {
        List<String> list = Arrays.asList("BG101", "BG205");

        assertTrue(safeSearch(list, "BG101"));
    }

    @Test
    void testSearch_KeyNotFound() {
        List<String> list = Arrays.asList("BG101", "BG205");

        assertFalse(safeSearch(list, "BG999"));
    }

    @Test
    void testSearch_ExceptionMessage() {
        List<String> list = new ArrayList<>();

        Exception e = assertThrows(IllegalStateException.class, () -> {
            safeSearch(list, "BG101");
        });

        assertEquals("No bogies available", e.getMessage());
    }

    @Test
    void testSearch_ListIntegrity() {
        List<String> list = Arrays.asList("BG101", "BG205");

        safeSearch(list, "BG101");

        assertEquals(2, list.size());
    }
}