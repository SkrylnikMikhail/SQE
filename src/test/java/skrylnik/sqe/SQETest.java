package skrylnik.sqe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQETest {



    @Test
    public void testPositiveArray() {
        int[] input = {5, 9, 4, 6, 5, 3};
        int[] expectedResult = {3, 4, 5, 5, 6, 9};

        BubbleSort.bubbleSort(input);

        Assertions.assertArrayEquals(input, expectedResult);
    }


    @Test
    public void testNegativeArray() {
        int[] input = {-5, -9, -4, -6, -5, -3};
        int[] expectedResult = {-9, -6, -5, -5, -4, -3};

        BubbleSort.bubbleSort(input);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testZerosArray() {
        int[] input = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0, 0, 0};

        BubbleSort.bubbleSort(input);

        Assertions.assertArrayEquals(input, expectedResult);
    }

    @Test
    public void testMixedArray() {
        int[] input = {0, -9, 4, -6, 5, -3};
        int[] expectedResult = {-9, -6, -3, 0, 4, 5};

        BubbleSort.bubbleSort(input);

        Assertions.assertArrayEquals(input, expectedResult);
    }


    @Test
    public void testMinMaxValues() {
        int[] input = {Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] expectedResult = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};

        BubbleSort.bubbleSort(input);

        Assertions.assertArrayEquals(input, expectedResult);
    }

}
