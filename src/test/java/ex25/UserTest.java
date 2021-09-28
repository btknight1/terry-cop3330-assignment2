package ex25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest
{
    @Test
    @DisplayName("very weak password 12345")
    void passwordValidator01()
    {
        User newUser = new User();
        String password = "12345";
        assertEquals(0,newUser.passwordValidator(password));
    }

    @Test
    @DisplayName("weak password abcdef")
    void passwordValidator02()
    {
        User newUser = new User();
        String password = "abcdef";
        assertEquals(1,newUser.passwordValidator(password));
    }

    @Test
    @DisplayName("strong password abc123xyz")
    void passwordValidator03()
    {
        User newUser = new User();
        String password = "abc123xyz";
        assertEquals(2,newUser.passwordValidator(password));
    }

    @Test
    @DisplayName("very strong password 1337h@xor!")
    void passwordValidator04()
    {
        User newUser = new User();
        String password = "1337h@xor!";
        assertEquals(3,newUser.passwordValidator(password));
    }
}