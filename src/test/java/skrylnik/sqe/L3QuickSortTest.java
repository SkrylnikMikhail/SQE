package skrylnik.sqe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class L3QuickSortTest {

    @Test
    public void testMinMaxValues() {
        int[] input = {Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] expectedResult = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};

        QuickSort.sort(input, 0, input.length - 1);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testStartIndex() {
        int[] input = {5, 9, 4, 6, 5, 3};
        int[] expectedResult = {5, 3, 4, 5, 6, 9};

        QuickSort.sort(input, 1, input.length - 1);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testEndIndex() {
        int[] input = {5, 9, 4, 6, 5, 3};
        int[] expectedResult = {4, 5, 6, 9, 5, 3};

        QuickSort.sort(input, 0, 3);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testInvertedIndex() {
        int[] input = {5, 9, 4, 6, 5, 3};
        int[] expectedResult = {5, 9, 4, 6, 5, 3};

        QuickSort.sort(input, 3, 0);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testOOBIndex() {
        int[] input = {5, 9, 4, 6, 5, 3};
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> QuickSort.sort(input, -1, 3));
    }
}
