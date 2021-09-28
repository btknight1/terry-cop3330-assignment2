package ex28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest
{
    @Test
    @DisplayName("Test the sum of 1+2+3+4+5")
    void sum()
    {
       int[] values = {1,2,3,4,5};
        Sum s = new Sum();
        assertEquals((1 + 2 + 3 + 4 + 5), s.sum(values));
    }
}