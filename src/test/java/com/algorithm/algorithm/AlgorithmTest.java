/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algorithm.algorithm;
import static com.algorithm.algorithm.Algorithm.bubbleSort;
import static com.algorithm.algorithm.Algorithm.fibonacciCalculate;
import static com.algorithm.algorithm.Algorithm.isPrime;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author phanp
 */
public class AlgorithmTest {
    // Test Bubble Sort
    @Test
    void testBubbleSortWithUnsortedArray() {
        int[] array = {5, 2, 9, 1, 6};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 5, 6, 9}, array);
    }

    @Test
    void testBubbleSortWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testBubbleSortWithDuplicateValues() {
        int[] array = {5, 3, 5, 1, 2};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5}, array);
    }

    @Test
    void testBubbleSortWithEmptyArray() {
        int[] array = {};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    void testBubbleSortWithSingleElement() {
        int[] array = {10};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{10}, array);
    }

    @Test
    void testBubbleSortWithNegativeNumbers() {
        int[] array = {-5, -1, -3, -2, -4};
        int[] expected = {-5, -4, -3, -2, -1};
        Algorithm.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testBubbleSortWithLargeInput() {
        int[] array = new int[1000];
        Arrays.setAll(array, i -> (int) (Math.random() * 1000));
        int[] expected = array.clone();
        Arrays.sort(expected);
        Algorithm.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    // Test Fibonacci Calculation
    @Test
    void testFibonacciWithPositiveNumber() {
        assertEquals(8, Algorithm.fibonacciCalculate(6));
    }

    @Test
    void testFibonacciWithZero() {
        assertEquals(0, Algorithm.fibonacciCalculate(0));
    }

    @Test
    void testFibonacciWithOne() {
        assertEquals(1, Algorithm.fibonacciCalculate(1));
    }

    @Test
    void testFibonacciWithLargeNumber() {
        assertEquals(832040, Algorithm.fibonacciCalculate(30));
    }

    @Test
    void testFibonacciWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.fibonacciCalculate(-1));
    }

    // Test Prime Check
    @Test
    void testIsPrimeWithPrimeNumber() {
        assertTrue(Algorithm.isPrime(7));
    }

    @Test
    void testIsPrimeWithSmallestPrime() {
        assertTrue(Algorithm.isPrime(2));
    }

    @Test
    void testIsPrimeWithNonPrimeNumber() {
        assertFalse(Algorithm.isPrime(4));
    }

    @Test
    void testIsPrimeWithNegativeNumber() {
        assertFalse(Algorithm.isPrime(-1));
    }

    @Test
    void testIsPrimeWithZero() {
        assertFalse(Algorithm.isPrime(0));
    }

    @Test
    void testIsPrimeWithLargePrimeNumber() {
        assertTrue(Algorithm.isPrime(9999991));
    }
}