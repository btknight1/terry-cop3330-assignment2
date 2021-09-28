package ex29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    @DisplayName("Test rate of return = 4")
    void calcYears01()
    {
        Year y = new Year();
        y.setRate_of_return(4);
        assertEquals(18, y.calcYears(y.getRate_of_return()));
    }
}