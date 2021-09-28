package ex39;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    @DisplayName("Trying different data")
    void sortLastName1() {
        String fnames[] = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot"};
        String lnames[] = {"a", "b", "c", "d", "e", "f"};
        String full_names[] = {"Alpha a", "Bravo b", "Charlie c", "Delta d", "Echo e", "Foxtrot Webber"};
        String positions[] = {"Apos", "Bpos", "Cpos", "Dpos", "Epos", "Fpos"};
        String separation[] = {"1a", "2b", "3c", "4d", "5e", "6f"};

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

        assertEquals(true, hashMap1.containsKey("a") && hashMap2.containsKey("a") && hashMap3.containsKey("a"));

    }

    @Test
    @DisplayName("Check lastname key")
    void sortLastName2() {
        String fnames[] = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
        String lnames[] = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Weber"};
        String full_names[] = {"John Johnson", "Tou Xiong", "Michaela Michaelson", "Jake Jacobson", "Jacquelyn Jackson", "Sally Webber"};
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

        assertEquals(true, hashMap1.containsKey("Johnson") && hashMap2.containsKey("Johnson") && hashMap3.containsKey("Johnson"));

    }
}