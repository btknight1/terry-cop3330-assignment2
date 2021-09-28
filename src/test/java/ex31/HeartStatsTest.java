package ex31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartStatsTest {

    @Test
    @DisplayName("RP: 65, Age: 22, Target: 55")
    void targetHeartRate1() {
        HeartStats myHeart = new HeartStats();
        myHeart.setAge(22);
        myHeart.setRestingHR(65);
        int result = (int)Math.rint(myHeart.targetHeartRate(55));
        assertEquals(138, result);
    }

    @Test
    @DisplayName("RP: 70, Age: 25, Target: 60")
    void targetHeartRate2() {
        HeartStats myHeart = new HeartStats();
        myHeart.setAge(25);
        myHeart.setRestingHR(70);
        int result = (int)Math.rint(myHeart.targetHeartRate(60));
        assertEquals(145, result);
    }
}