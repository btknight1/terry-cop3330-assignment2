/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex36;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Stats report = new Stats();
        Scanner input = new Scanner(System.in);
        String value = "";
        int timeInt;
        boolean tryAgain = false;


        while (!(value.equals("done")))
        {
            do
            {
                System.out.print("Enter a number: ");
                value = input.nextLine();
                tryAgain = false;
                try
                {
                    timeInt = Integer.parseInt(value);
                    report.addTime(timeInt);
                }
                catch (NumberFormatException ex)
                {
                    if(!(value.equals("done")))
                        tryAgain = true;
                }
            } while (tryAgain);
        }

        report.display();

        String result = "The average is " + report.average();
        System.out.println(result);

        result = "The minimum is " + report.min();
        System.out.println(result);

        result = "The maximum is " + report.max();
        System.out.println(result);

        System.out.printf("The standard deviation is %.2f", report.std());
    }
}