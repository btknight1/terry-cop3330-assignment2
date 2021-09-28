package ex32;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTest {

    @Test
    @DisplayName("Check difficulty 1 range")
    void difficulty_1(){
        Guess myGuess = new Guess();
        int findThis = myGuess.difficulty_1();
        assertEquals(true, findThis <= 10 && findThis >= 1);
    }

    @Test
    @DisplayName("Check difficulty 2 range")
    void difficulty_2() {
        Guess myGuess = new Guess();
        int findThis = myGuess.difficulty_2();
        assertEquals(true, findThis <= 100 && findThis >= 1);
    }

    @Test
    @DisplayName("Check difficulty 3 range")
    void difficulty_3() {
        Guess myGuess = new Guess();
        int findThis = myGuess.difficulty_2();
        assertEquals(true, findThis <= 1000 && findThis >= 1);
    }
}