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
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array); // Expected: already sorted
    }

    @Test
    void testBubbleSortArrayWithDuplicates() {
        int[] array = {5, 3, 5, 1, 2};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5}, array); // Expected: sorted with duplicates
    }

    @Test
    void testBubbleSortEmptyArray() {
        int[] array = {};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{}, array); // Expected: empty array
    }

    @Test
    void testBubbleSortSingleElementArray() {
        int[] array = {10};
        Algorithm.Bubblesort(array);
        assertArrayEquals(new int[]{10}, array); // Expected: no change
    }
    
    
//    @Test
//    void testBinarySearch() {
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        int result = BinarySearch.search(array, 4);
//        assertEquals(3, result); // Expected index of 4
//    }
//    @Test
//    void testBinarySearchEmptyArray() {
//        int[] array = {};
//        assertEquals(-1, BinarySearch.search(array, 5)); // Expected: not found
//    }
//
//    @Test
//    void testBinarySearchSingleElement() {
//        int[] array = {5};
//        assertEquals(0, BinarySearch.search(array, 5)); // Expected: found at index 0
//    }
//
//    @Test
//    void testBinarySearchElementNotFound() {
//        int[] array = {1, 2, 3, 4, 5};
//        assertEquals(-1, BinarySearch.search(array, 6)); // Expected: not found
//    }
//    @Test
//    void testBinarySearchTargetLessThanMid() {
//        int[] array = {1, 3, 5, 7, 9, 11};
//        int target = 4; // Giá trị mục tiêu nhỏ hơn phần tử giữa (5)
//        int result = BinarySearch.search(array, target);
//        assertEquals(-1, result); // Expected: Giá trị không có trong mảng
//    }
//   
    
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
        assertFalse(isPrime(4));
    }
    @Test
    void testPrimeCheckSmallPrime() {
        assertTrue(isPrime(2)); 
    }

    @Test
    void testPrimeCheckNonPrime() {
        assertFalse(isPrime(4)); 
    }

    @Test
    void testPrimeCheckNegativeAndZero() {
        assertFalse(isPrime(-1)); 
    }
}
