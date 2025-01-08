/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algorithm.algorithm;
import static com.algorithm.algorithm.Algorithm.Bubblesort;
import static com.algorithm.algorithm.Algorithm.Fibonaccicalculate;
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
    // Test BubbleSort
    @Test
    void testBubbleSort() {
        int[] array = {5, 2, 9, 1, 6};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{1, 2, 5, 6, 9}, array);
    }

    @Test
    void testBubbleSortSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array); 
    }
    
    @Test
    void testBubbleSortArrayWithDuplicates() {
        int[] array = {5, 3, 5, 1, 2};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5}, array); 
    }

    @Test
    void testBubbleSortEmptyArray() {
        int[] array = {};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{}, array); 
    }

    @Test
    void testBubbleSortSingleElementArray() {
        int[] array = {10};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{10}, array); 
    }
    @Test
    void testBubbleSortWithNegativeNumbers() {
        int[] arr = {-5, -1, -3, -2, -4};
        int[] expected = {-5, -4, -3, -2, -1};
        Algorithm.Bubblesort(arr);
        assertArrayEquals(expected, arr);
    }
    @Test
    void testBubbleSortWithLargeInput() {
        int[] arr = new int[1000000];
        Arrays.setAll(arr, i -> (int)(Math.random() * 1000000));
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        Algorithm.Bubblesort(arr);
        assertArrayEquals(sortedArr, arr);
    }
    // Test Fibonacci
    @Test
    void testFibonacci() {
        assertEquals(8, Fibonaccicalculate(6));
    }
    @Test
    void testFibonacciZero() {
        assertEquals(0, Fibonaccicalculate(0)); 
    }
    @Test
    void testFibonacciOne() {
        assertEquals(1, Fibonaccicalculate(1)); 
    }   
    @Test
    void testFibonacciLarge() {
        assertEquals(55, Fibonaccicalculate(10)); 
    }
    
    
    // Test Prime Check
    @Test
    void testIsPrime() {
        assertTrue(isPrime(7));
    }
    @Test
    void testPrimeCheckSmallestPrime() {
        assertTrue(isPrime(2)); 
    }
    @Test
    void testPrimeCheckNonPrime() {
        assertFalse(isPrime(4)); 
    }
    @Test
    void testPrimeCheckNegative() {
        assertFalse(isPrime(-1)); 
    }
   
    @Test
    void testPrimeCheckZero() {
        assertFalse(isPrime(0)); 
    }
    @Test
    void testPrimeCheckWithLargeNumber() {
        assertTrue(isPrime(9999991)); 
    }
}
