import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @org.junit.jupiter.api.Test
    void add() {
        Container<Integer> testContainer = new Container<>();
        testContainer.add(5);
        testContainer.add(1);
        testContainer.add(5);
        testContainer.add(95);
        assertEquals(3, testContainer.getSize());
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Container<String> testContainer = new Container<>();
        testContainer.add("3");
        testContainer.add("Bob");
        testContainer.add("Bib");
        testContainer.add("Bab");
        assertTrue(testContainer.remove("Bob"));
        assertTrue(testContainer.remove("3"));
        assertTrue(testContainer.remove("Bab"));
        assertFalse(testContainer.remove("Bub"));
    }

    @org.junit.jupiter.api.Test
    void get() {
        Container<Integer> testContainer = new Container<>();
        testContainer.add(5);
        testContainer.add(1);
        testContainer.add(5);
        testContainer.add(95);
        assertEquals(5, testContainer.get(0));
        assertEquals(1, testContainer.get(1));
        assertEquals(5, testContainer.get(2));
        assertEquals(95, testContainer.get(3));
        assertNull(testContainer.get(5));
    }
}
