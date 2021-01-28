package skrylnik.sqe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class L2QuickSortTest {

    @Test
    public void testPositiveArray() {
        int[] input = {5, 9, 4, 6, 5, 3};
        int[] expectedResult = {3, 4, 5, 5, 6, 9};

        QuickSort.sort(input, 0, input.length - 1);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testNegativeArray() {
        int[] input = {-5, -9, -4, -6, -5, -3};
        int[] expectedResult = {-9, -6, -5, -5, -4, -3};

        QuickSort.sort(input, 0, input.length - 1);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testZerosArray() {
        int[] input = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0, 0, 0};

        QuickSort.sort(input, 0, input.length - 1);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testMixedArray() {
        int[] input = {0, -9, 4, -6, 5, -3};
        int[] expectedResult = {-9, -6, -3, 0, 4, 5};

        QuickSort.sort(input, 0, input.length - 1);

        Assertions.assertArrayEquals(input, expectedResult);
    }

}
