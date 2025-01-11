# algorithms-junit-test
## Overview 
This Java class, `AlgorithmTest`, contains a series of unit tests for the algorithms implemented in the `Algorithm` class. The tests are written using the JUnit framework. The class focuses on three main algorithms: Bubble Sort, Fibonacci Sequence, and Prime Number Checking.
## Test Cases
This section includes a detailed set of unit tests designed to validate the functionality and robustness of the implemented algorithms. The test cases cover various scenarios for sorting, Fibonacci sequence calculation, and prime number checking. Each test is created using JUnit 5, ensuring that the expected behaviour is accurately verified against the actual results.
The following are the key aspects tested:
- Sorting Algorithms: Validation of the BubbleSort implementation under normal, edge, and special cases (e.g., arrays with duplicates, empty arrays).
- Fibonacci Calculation: Verify the correct Fibonacci sequence values, including edge cases such as 0 and 1.
- Prime Checking: Ensures the isPrime function correctly identifies prime and non-prime numbers, including handling negative numbers and special cases like 0 and 1.
```java
public class AlgorithmTest {
    // Test BubbleSort
    @Test
    void testBubbleSort() {
        int[] array = {5, 2, 9, 1, 6};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 5, 6, 9}, array);
    }
    @Test
    void testBubbleSortSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array); 
    }    
    @Test
    void testBubbleSortArrayWithDuplicates() {
        int[] array = {5, 3, 5, 1, 2};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5}, array); 
    }
    @Test
    void testBubbleSortEmptyArray() {
        int[] array = {};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{}, array); 
    }
    @Test
    void testBubbleSortSingleElementArray() {
        int[] array = {10};
        Algorithm.bubbleSort(array);
        assertArrayEquals(new int[]{10}, array); 
    }
    @Test
    void testBubbleSortWithNegativeNumbers() {
        int[] arr = {-5, -1, -3, -2, -4};
        int[] expected = {-5, -4, -3, -2, -1};
        Algorithm.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }
    @Test
    void testBubbleSortWithLargeInput() {
        int[] arr = new int[1000];
        Arrays.setAll(arr, i -> (int)(Math.random() * 1000));
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        Algorithm.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }
    // Test Fibonacci
    @Test
    void testFibonacci() {
        assertEquals(8, calculateFibonacci(6));
    }
    @Test
    void testFibonacciZero() {
        assertEquals(0, calculateFibonacci(0)); 
    }
    @Test
    void testFibonacciOne() {
        assertEquals(1, calculateFibonacci(1)); 
    }   
    @Test
    void testFibonacciLarge() {
        assertEquals(832040, calculateFibonacci(30)); 
    }
    @Test
    void testFibonacciWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculateFibonacci(-1));
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
```
## Dependencies
This project uses Maven to manage its dependencies, ensuring an organized and efficient build process. Below are the primary libraries utilized in this project:
- JUnit Jupiter is the testing framework used to write and execute the unit tests in this project. It is part of the JUnit 5 suite, which provides robust and modern testing features.
```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.10.3</version>
        <type>jar</type>
    </dependency>
</dependencies>
```
- The JaCoCo Maven Plugin is integrated into this project to provide detailed code coverage reports. These reports help evaluate how much of the source code is covered by the unit tests, highlighting untested areas for improvement. This plugin automatically generates a report after tests are executed.
```xml
<plugins>
    <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.7</version>
        <executions>
            <execution>
                <goals>
                    <goal>prepare-agent</goal>
                    <goal>report</goal>
                </goals>
            </execution>
        </executions>
    </plugin>
</plugins>
```
## Results
Initially, I wrote a limited number of test cases to perform basic checks for the BubbleSort, Fibonacci, and Prime Number algorithms. The results showed that the code coverage was not optimal, as illustrated in the first image:
- FibonacciCalculate: Instruction coverage was only 19%, and branch coverage was 25%.
- isPrime: Performed better with 91% instruction coverage and 83% branch coverage.
- BubbleSort: Achieved 100% coverage due to its straightforward implementation.
  
![image](https://github.com/user-attachments/assets/80193288-0b79-4c01-ad09-e68f1019def4)
![image](https://github.com/user-attachments/assets/3d8b8ba5-889e-4133-b623-69931c06351a)
To improve testing quality and ensure all edge cases were covered, I wrote additional test cases to handle scenarios such as empty arrays, the smallest prime number, and boundary values for Fibonacci. After adding these test cases, the code coverage improved to 100% for all three algorithms, as shown in the image:

![image](https://github.com/user-attachments/assets/f6e81351-615d-4698-b513-4d4bf06a709b)
![image](https://github.com/user-attachments/assets/9ccd9c3d-4066-4a7b-9d82-4333593fee1d)
## How to Run
```bash
mvn clean test jacoco:report
```
## Link ChatGPT
This is the ChatGPT conversation link where an example of running JUnit tests was provided. You can review it to understand the implementation details and testing process better. [ChatGPT Example on JUnit Testing](https://chatgpt.com/share/677beb00-ccdc-8005-835a-46b5f6696ac7)
Additionally, I also asked ChatGPT to evaluate and grade my testing exercises. I made adjustments based on the suggestions provided to improve the results of my assignments. Here is the link to my ChatGPT conversation. [ChatGPT evaluate and grade](https://chatgpt.com/share/67824d07-cbf0-8005-8b3b-c5c23376b4ea)
