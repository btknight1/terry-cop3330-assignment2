package ex33;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest {

    @Test
    @DisplayName("Check that a valid String is returned")
    void genResponse() {
        MagicBall myMB = new MagicBall();
        String str = null;
        str = myMB.genResponse();
        assertEquals(true, str != null);
    }
}