package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest
{

    @Test
    @DisplayName("Testing cat and tac.")
    void isAnagram_01()
    {
        Anagram a1 = new Anagram("cat", "tac");

        assertEquals(true, a1.isAnagram(a1.getString1(), a1.getString2()));
    }

    @Test
    @DisplayName("Testing 12345 and 54321")
    void isAnagram_02()
    {
        Anagram a1 = new Anagram("12345", "54321");

        assertEquals(true, a1.isAnagram(a1.getString1(), a1.getString2()));
    }

    @Test
    @DisplayName("Testing !@#$% and %$#@!")
    void isAnagram_03()
    {
        Anagram a1 = new Anagram("!@#$%", "%$#@!");

        assertEquals(true, a1.isAnagram(a1.getString1(), a1.getString2()));
    }

    @Test
    @DisplayName("Testing abcd and abca")
    void isAnagram_04()
    {
        Anagram a1 = new Anagram("abcd", "abca");

        assertEquals(false, a1.isAnagram(a1.getString1(), a1.getString2()));
    }
}