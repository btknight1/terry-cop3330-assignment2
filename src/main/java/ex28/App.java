/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex28;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int [5];
        for (int i = 0; i <5 ; i++)
        {
            int val;
            System.out.print("Enter a number: ");
            val = input.nextInt();
            arr[i] = val;
            sum += val;
        }
        System.out.print("The total is " + sum + ".");
    }
}
