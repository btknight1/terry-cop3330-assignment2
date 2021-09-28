/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex39;

import java.util.Arrays;
import java.util.Map;

public class Sort
{
    public static void sortLastName(String[] fnames, String[] lnames, String[] positions, String[] separation, Map<String,String> h1, Map<String,String> h2, Map<String,String> h3)
    {
        System.out.print("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------\n");
        int rows = 6;
        Arrays.sort(lnames);

        int i;
        for (i = 0; i < rows; i++)
        {
            int j;
            int spaces = 20 - (h1.get(lnames[i]).length() + lnames[i].length() + 1);
            System.out.printf("%s %s",h1.get(lnames[i]), lnames[i]);

            for (j = 0;  j<spaces; j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");

            j = 0;
            spaces = 19 - (h2.get(lnames[i]).length()+1);
            System.out.printf(" %s",h2.get(lnames[i]));
            for (j = 0;  j<spaces ; j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");

            j = 0;

            spaces = 16 - (h3.get(lnames[i]).length()+1);
            System.out.printf(" %s\n", h3.get(lnames[i]));
            for (j = 0;  j<spaces ; j++)
            {
                System.out.print("");
            }
        }
    }
}
