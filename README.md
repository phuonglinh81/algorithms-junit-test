# algorithms-junit-test
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
    void testPrimeCheckNegative() {
        assertFalse(isPrime(-1)); 
    }    
    @Test
    void testPrimeCheckZero() {
        assertFalse(isPrime(0)); 
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
At the beginning, I wrote a limited number of test cases to perform basic checks for the BubbleSort, Fibonacci, and Prime Number algorithms. The results showed that the code coverage was not optimal, as illustrated in the first image:
- FibonacciCalculate: Instruction coverage was only 19%, and branch coverage was 25%.
- isPrime: Performed better with 91% instruction coverage and 83% branch coverage.
- BubbleSort: Achieved 100% coverage due to its straightforward implementation.
  
![image](https://github.com/user-attachments/assets/80193288-0b79-4c01-ad09-e68f1019def4)
![image](https://github.com/user-attachments/assets/3d8b8ba5-889e-4133-b623-69931c06351a)
To improve testing quality and ensure all edge cases were covered, I wrote additional test cases to handle scenarios such as empty arrays, the smallest prime number, and boundary values for Fibonacci. After adding these test cases, the code coverage improved to 100% for all three algorithms, as shown in the image:

![image](https://github.com/user-attachments/assets/35aaa3fb-da9d-463c-8060-a9e0b140daf6)
![image](https://github.com/user-attachments/assets/9ccd9c3d-4066-4a7b-9d82-4333593fee1d)
## How to Run
```bash
mvn clean test jacoco:report
```
## Link ChatGPT
This is the ChatGPT conversation link where an example of running JUnit tests was provided. You can review it to better understand the implementation details and testing process. [ChatGPT Example on JUnit Testing](https://chatgpt.com/share/677beb00-ccdc-8005-835a-46b5f6696ac7)
