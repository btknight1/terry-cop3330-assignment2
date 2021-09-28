package ex40;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    @DisplayName("Verify query success by key")
    void sortLastName() {
        Scanner input = new Scanner(System.in);

        Sort find = new Sort();

        String search = "Weber";



        String fnames[] = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
        String lnames[] = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Weber"};
        String full_names[] = {"John Johnson", "Tou Xiong", "Michaela Michaelson", "Jake Jacobson", "Jacquelyn Jackson", "Sally Weber"};
        String positions[] = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
        String separation[] = {"2016-12-31", "2016-10-05", "2015-12-19", "", "", "2015-12-18"};

        Map<String, String> hashMap1 = new HashMap<String, String>();
        Map<String, String> hashMap2 = new HashMap<String, String>();
        Map<String, String> hashMap3 = new HashMap<String, String>();

        int i;
        for (i = 0; i < fnames.length; i++)
        {
            hashMap1.put(lnames[i], fnames[i]);
        }

        for (i = 0; i < positions.length; i++)
        {
            hashMap2.put(lnames[i], positions[i]);
        }

        for (i = 0; i < separation.length; i++)
        {
            hashMap3.put(lnames[i], separation[i]);
        }

        assertEquals(true, hashMap2.get(search).equals("Web Developer"));
        assertEquals(true, hashMap3.get(search).equals("2015-12-18"));
        assertEquals(true, hashMap1.get(search).equals("Sally"));


    }
}