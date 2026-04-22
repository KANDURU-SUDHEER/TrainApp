import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainApp_Test {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    private List<Bogie> getBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("General", 90)
        );
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = getBogies().stream()
                .filter(b -> b.capacity > 70)
                .toList();

        assertTrue(result.stream().allMatch(b -> b.capacity > 70));
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = getBogies().stream()
                .filter(b -> b.capacity > 72)
                .toList();

        assertTrue(result.stream().noneMatch(b -> b.capacity == 72));
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result = getBogies().stream()
                .filter(b -> b.capacity > 60)
                .toList();

        assertFalse(result.stream().anyMatch(b -> b.capacity < 60));
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> result = getBogies().stream()
                .filter(b -> b.capacity > 50)
                .toList();

        assertTrue(result.size() > 1);
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> result = getBogies().stream()
                .filter(b -> b.capacity > 200)
                .toList();

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> result = getBogies().stream()
                .filter(b -> b.capacity > 10)
                .toList();

        assertEquals(4, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> result = new ArrayList<Bogie>().stream()
                .filter(b -> b.capacity > 50)
                .toList();

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getBogies());

        original.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        assertEquals(4, original.size());
    }
}