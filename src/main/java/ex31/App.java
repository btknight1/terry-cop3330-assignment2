/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex31;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HeartStats myStats = new HeartStats();

        boolean tryAgain = false;
        String value;

        double  doubleValue = 0;

        do
        {
            System.out.print("Enter Resting Pulse: ");
            value = input.nextLine();
            tryAgain = false;
            try
            {
                myStats.setRestingHR(Double.parseDouble(value));
            }
            catch (NumberFormatException ex)
            {
                tryAgain = true;
            }
        } while(tryAgain);

        do
        {
            System.out.print("Enter Age: ");
            value = input.nextLine();
            tryAgain = false;
            try
            {
                myStats.setAge(Double.parseDouble(value));
            }
            catch (NumberFormatException ex)
            {
                tryAgain = true;
            }
        } while(tryAgain);

        System.out.println("");
        myStats.runTest();
    }
}
