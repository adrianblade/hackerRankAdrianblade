package arrays;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeftRotateTest {

    private static LeftRotate lr = new LeftRotate();

    @Test
    public void testRotateBy2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {7, 8, 1, 2, 3, 4, 5, 6};
        lr.rotate(arr, 6);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateBy3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {6, 7, 8, 1, 2, 3, 4, 5};
        lr.rotate(arr, 5);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateByLength() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = arr.clone();
        lr.rotate(arr, arr.length);
        assertArrayEquals(expected, arr);
        lr.rotate(arr, arr.length * 6);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateByZero() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = arr.clone();
        lr.rotate(arr, 0);
        assertArrayEquals(expected, arr);
    }
}
