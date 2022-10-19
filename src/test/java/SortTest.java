import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    Integer[] integers = {5, 4, 3, 2, 1, 0, -1, -2, -3};
    String[] strings = {"b", "d", "e", "f", "a", "c"};

    @Test
    void testIntegerSort() {
        Integer[] sortedIntegers = {-3, -2, -1, 0, 1, 2, 3, 4, 5};

        Sort.sort(integers);

        for (int i = 0; i < integers.length; i++) {
            assertEquals(sortedIntegers[i], integers[i]);
        }
    }

    @Test
    void testStringSort() {
        String[] sortedStrings = {"a", "b", "c", "d", "e", "f"};

        Sort.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            assertEquals(strings[i], sortedStrings[i]);
        }
    }
}
