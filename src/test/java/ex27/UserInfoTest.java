package ex27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest
{

    @Test
    @DisplayName("J empty ABDCE A12-1234")
    void validateInput01()
    {
        UserInfo user = new UserInfo();
        user.setFirst_name("J");
        user.setLast_name("");
        user.setZip("ABDCE");
        user.setId("A12-1234");
        assertEquals("The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zipcode must be a 5 digit number.",        user.validateInput());

    }
    @Test
    @DisplayName("John Johnson 55555 TK-4321")
    void validateInput02()
    {
        UserInfo user = new UserInfo();
        user.setFirst_name("John");
        user.setLast_name("Johnson");
        user.setZip("55555");
        user.setId("TK-4321");
        assertEquals("There were no errors found.", user.validateInput());

    }



}