/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex40;

import java.util.*;

public class Sort
{
    public static void sortLastName(String[] full_names, String search, String[] fnames, String[] lnames, String[] positions, String[] separation, Map<String,String> h1, Map<String,String> h2, Map<String,String> h3)
    {
        System.out.print("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------\n");
        int rows = 6;
        Arrays.sort(lnames);

        int i;
        int count = 0;
        List<String> filter = new ArrayList<String>();
        for(i=0; i<rows; i++)
        {
            if(full_names[i].toLowerCase().contains(search.toLowerCase()))
            {
                String extract = "";
                extract = full_names[i].split(" ")[1];
                filter.add(extract);
                count++;
            }
        }
        String[] filterString;
        if(count == 0)
            return;

        filterString = filter.toArray(new String[0]);
        Arrays.sort(filterString);

        for (i = 0; i < count; i++)
        {
            int j;
            int spaces = 20 - (h1.get(filterString[i]).length() + filterString[i].length() + 1);
            System.out.printf("%s %s",h1.get(filterString[i]), filterString[i]);

            for (j = 0;  j<spaces ; j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");

            j = 0;
            spaces = 19 - (h2.get(filterString[i]).length()+1);
            System.out.printf(" %s",h2.get(filterString[i]));
            for (j = 0;  j<spaces ; j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");

            j = 0;

            spaces = 16 - (h3.get(filterString[i]).length()+1);
            System.out.printf(" %s\n", h3.get(filterString[i]));
            for (j = 0;  j<spaces ; j++)
            {
                System.out.print("");
            }
        }
    }
}