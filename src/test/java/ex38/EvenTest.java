package ex38;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class EvenTest {

    @Test
    @DisplayName("Test data set 123456789")
    void filterEvenNumbers1() {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] even = Even.filterEvenNumbers(arr);
        boolean allEven = false;

        for (int i = 0;  i<even.length ; i++) {
            if(even[i] % 2 == 0)
                allEven=true;
            else
                allEven=false;
        }
        assertEquals(true, allEven);
    }

    @Test
    @DisplayName("Test data set 0000")
    void filterEvenNumbers2() {
        int[] arr = {0,0,0,0};

        int[] even = Even.filterEvenNumbers(arr);
        boolean allEven = false;

        for (int i = 0;  i<even.length ; i++) {
            if(even[i] % 2 == 0)
                allEven=true;
            else
                allEven=false;
        }
        assertEquals(false, allEven);
    }
}