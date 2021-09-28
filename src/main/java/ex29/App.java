/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex29;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean tryAgain = false;
        String value;

        double  rate_of_return = 0;
        Year y = new Year();


        do {
            System.out.print("What is the rate of return? ");
            value = input.nextLine();
            if(value.equals("0")){
                System.out.println("Sorry. That's not a valid input.");
            }
            tryAgain = false;
            try {
                rate_of_return = Double.parseDouble(value);
            } catch (NumberFormatException ex) {
                tryAgain = true;
                System.out.println("Sorry. That's not a valid input.");
            }
        } while (tryAgain || rate_of_return == 0);

        y.setRate_of_return(rate_of_return);
        double years = y.calcYears(rate_of_return);


        System.out.printf("It will take %.0f years to double your initial investment.", years);

    }
}
