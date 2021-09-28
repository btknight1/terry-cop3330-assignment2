package ex37;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassTest
{
    @Test
    @DisplayName("Test minlength: 8 special: 2 num: 2")
    void passGen1()
    {
        Pass myPass = new Pass();
        myPass.setMinLength(8);
        myPass.setNum_special_characters(2);
        myPass.setNum_numbers(2);
        String password = myPass.passGen();

        char[] spec = {'!','@','#','$','%','^','&','*','(',')'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        int count_num = 0;
        int count_sp = 0;

        assertEquals(true, password.length()>=myPass.getMinLength());

        int i, j;
        for(i=0; i<password.length(); i++)
        {
            for(j=0; j<10; j++)
            {
                if(password.charAt(i) == num[j])
                count_num++;
            }
            for(j=0; j<10; j++)
            {
                if(password.charAt(i) == spec[j])
                    count_sp++;
            }
        }
        assertEquals(true, count_num == myPass.getNum_numbers());
        assertEquals(true, count_sp == myPass.getNum_special_characters());
    }

    @Test
    @DisplayName("Test minlength: 15 special: 4 num: 4")
    void passGen2()
    {
        Pass myPass = new Pass();
        myPass.setMinLength(15);
        myPass.setNum_special_characters(4);
        myPass.setNum_numbers(4);
        String password = myPass.passGen();

        char[] spec = {'!','@','#','$','%','^','&','*','(',')'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        int count_num = 0;
        int count_sp = 0;

        assertEquals(true, password.length()>=myPass.getMinLength());

        int i, j;
        for(i=0; i<password.length(); i++)
        {
            for(j=0; j<10; j++)
            {
                if(password.charAt(i) == num[j])
                    count_num++;
            }
            for(j=0; j<10; j++)
            {
                if(password.charAt(i) == spec[j])
                    count_sp++;
            }
        }

        assertEquals(true, count_num == myPass.getNum_numbers());
        assertEquals(true, count_sp == myPass.getNum_special_characters());
    }
}