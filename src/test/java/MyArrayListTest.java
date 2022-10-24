import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    MyArrayList<Integer> testNumbersList = new MyArrayList<>();

    MyArrayList<String> testStringList = new MyArrayList<>();

    @Test
    void testCreateListWithCapacity() {
        MyArrayList<Integer> list = new MyArrayList<>(20);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        assertNotNull(list);

        assertEquals(0, list.get(0));

        assertEquals(5, list.size());

    }

    @ParameterizedTest(name = "add() work on {0} and {1}")
    @CsvSource(value = {"hello, 42", "world, -42"})
    void add(String string, Integer number) {
        testNumbersList.add(number);
        testStringList.add(string);

        assertNotNull(testNumbersList);
        assertNotNull(testStringList);

        assertEquals(1, testNumbersList.size());
        assertEquals(1, testStringList.size());
    }

    @Test
    @DisplayName("add() is working if list is full")
    void add() {
        for (int i = 0; i < 10; i++) {
            testNumbersList.add(i);
        }

        testNumbersList.add(11);

        assertEquals(11, testNumbersList.size());
    }

    @Test
    void get() {
        testNumbersList.add(42);

        assertEquals(42, testNumbersList.get(0));

        assertThrows(IndexOutOfBoundsException.class, () -> testNumbersList.get(10));
    }

    @Test
    void indexOf() {
        testNumbersList.add(1);
        testNumbersList.add(2);

        assertEquals(0, testNumbersList.indexOf(1));
        assertEquals(1, testNumbersList.indexOf(2));
        assertEquals(-1, testNumbersList.indexOf(3));
    }

    @Test
    void set() {
        testNumbersList.add(1);
        testNumbersList.add(2);

        assertThrows(IndexOutOfBoundsException.class, () -> testNumbersList.set(11, 0));

        testNumbersList.set(0, 10);

        assertEquals(10, testNumbersList.get(0));

    }

    @Test
    void remove() {
        testNumbersList.add(42);
        testNumbersList.add(0);

        testNumbersList.remove(0);

        assertEquals(1, testNumbersList.size());
        assertEquals(0, testNumbersList.get(0));

        assertThrows(IndexOutOfBoundsException.class, () -> testNumbersList.remove(10));
    }

    @Test
    void clear() {
        testNumbersList.add(42);
        testNumbersList.add(0);

        testNumbersList.clear();

        assertEquals(0, testNumbersList.size());

        assertTrue(testNumbersList.isEmpty());
    }

    @Test
    void testNumbersSort() {
        for (int i = 10; i >= 0; i--) {
            testNumbersList.add(i);
        }

        assertEquals(11, testNumbersList.size());

        MyArrayList.sort(testNumbersList);

        for (int i = 0; i <= 10; i++) {
            assertEquals(i, testNumbersList.get(i));
        }
    }

    @Test
    void testStringSort() {
        testStringList.add("e");
        testStringList.add("d");
        testStringList.add("c");
        testStringList.add("a");
        testStringList.add("b");

        MyArrayList.sort(testStringList);

        assertEquals("a", testStringList.get(0));
        assertEquals("e", testStringList.get(4));
    }
}
