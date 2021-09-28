package ex26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest
{

    @Test
    @DisplayName("Balance: 5000, APR: 12, Payment: 100")
    void calculateMonthsUntilPaidOff01()
    {
        PaymentCalculator pay = new PaymentCalculator();
        pay.setB(5000);
        pay.setAPR(12);
        pay.setP(100);
        pay.setI((pay.getAPR())/365.0);
        double result = Math.ceil(pay.calculateMonthsUntilPaidOff());
        assertEquals(result, 70);
    }

    @Test
    @DisplayName("Balance: 3000, APR: 10, Payment: 100")
    void calculateMonthsUntilPaidOff02()
    {
        PaymentCalculator pay = new PaymentCalculator();
        pay.setB(3000);
        pay.setAPR(10);
        pay.setP(100);
        pay.setI((pay.getAPR())/365.0);
        double result = Math.ceil(pay.calculateMonthsUntilPaidOff());
        assertEquals(result, 35);
    }

}