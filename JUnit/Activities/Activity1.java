import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
    // Test fixtures
    static ArrayList<String> list;

    // Initialize test fixtures before each test method
    @BeforeEach
    void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("ganga"); // at index 0
        list.add("yamuna"); // at index 1
    }

    // Test method to test the insert operation
    @Test
    public void insertTest() {
        // Assertion for size
        assertEquals(2, list.size(), "Wrong size");
        // Add new element
        list.add(2, "suresh");
        // Assert with new elements
        assertEquals(3, list.size(), "Wrong size");

        // Assert individual elements
        assertEquals("ganga", list.get(0), "Wrong element");
        assertEquals("yamuna", list.get(1), "Wrong element");
        assertEquals("suresh", list.get(2), "Wrong element");
    }

    // Test method to test the replace operation
    @Test
    public void replaceTest() {
        // Replace new element
        list.set(1, "suresh");

        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("ganga", list.get(0), "Wrong element");
        assertEquals("suresh", list.get(1), "Wrong element");
    }
}