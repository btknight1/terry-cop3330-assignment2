package ex35;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameListTest {

    @Test
    @DisplayName("Ensure a name is selected")
    void getWinner() {
    NameList list = new NameList();
    list.addName("Homer");
    list.addName("Bart");
    list.addName("Maggie");
    list.addName("Moe");
    String result = list.getWinner();
    assertEquals(true, result.contains("The winner is... "));
    }

    @Test
    @DisplayName("Test winner index is in range 0 to length-1")
    void random_int() {
        NameList list = new NameList();
        int winner_index= list.random_int();
        list.addName("Homer");
        list.addName("Bart");
        list.addName("Maggie");
        list.addName("Moe");
        assertEquals(true, winner_index >= 0 && winner_index < list.getSize());
    }
}