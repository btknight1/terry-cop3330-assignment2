package ex36;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsTest {

    @Test
    @DisplayName("avg: 100,200,1000,300")
    void average() {
        Stats report = new Stats();
        report.addTime(100);
        report.addTime(200);
        report.addTime(1000);
        report.addTime(300);
        assertEquals(400.0, report.average());
    }

    @Test
    @DisplayName("std: 100,200,1000,300")
    void std() {
        Stats report = new Stats();
        report.addTime(100);
        report.addTime(200);
        report.addTime(1000);
        report.addTime(300);
        assertEquals(353.55, report.round(report.std(),2));
    }
}