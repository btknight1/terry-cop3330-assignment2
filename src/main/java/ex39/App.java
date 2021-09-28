/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex39;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main(String[] args)
    {
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

        Sort.sortLastName(fnames, lnames, positions, separation, hashMap1, hashMap2, hashMap3);

    }
}