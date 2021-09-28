/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main(String[] args) throws IOException
    {

        System.out.print("Enter a list of numbers, separated by spaces: ");

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        
        String[] intStr = buffRead.readLine().split(" ");

        int i;

        int numArray[] = new int[intStr.length];
        
        for (i = 0; i < intStr.length; i++)
        {
            numArray[i] = Integer.parseInt(intStr[i]);
        }

        int evenArray[] = Even.filterEvenNumbers(numArray);

        System.out.print("The even numbers are ");


        for (i = 0;  i < evenArray.length; i++)
        {
            if(!(evenArray.length-1 == i))
                System.out.print(evenArray[i] + " ");
            else
                System.out.print(evenArray[i]);

        }
        System.out.print(".");
    }
}
