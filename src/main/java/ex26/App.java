/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex26;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PaymentCalculator card = new PaymentCalculator();

        System.out.print("What is your balance? ");
        card.setB(input.nextDouble());

        System.out.print("What is the APR on the card (as a percent)? ");
        card.setAPR(input.nextDouble());

        System.out.print("What is the monthly payment you can make? ");
        card.setP(input.nextDouble());

        card.setI((card.getAPR())/365.0);

        System.out.printf("It will take you %.0f months to pay off this card.", Math.ceil(card.calculateMonthsUntilPaidOff()));

    }
}