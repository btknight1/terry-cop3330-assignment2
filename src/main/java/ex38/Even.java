/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex38;

public class Even
{
    public static int[] filterEvenNumbers(int[] arr)
    {
        int i;
        int count = 0;
        for (i = 0;  i<arr.length; i++)
        {
            if(arr[i] % 2 == 0 && arr[i] != 0)
            {
                 count++;
            }
        }

        int retArray[] = new int[count];

        int j = 0;
        for (i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0 && arr[i] != 0)
            {
               retArray[j] = arr[i];
               j++;
            }
        }
        return retArray;
    }
}
