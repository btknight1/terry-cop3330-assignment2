/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex32;

import java.util.Scanner;

public class App
{

    public static void main(String[] args)
    {
        Guess theGuess = new Guess();
        Scanner input = new Scanner(System.in);
        boolean tryAgain = false;

        String value = "";

        boolean play_again = true;
        while(play_again)
        {
            theGuess.reset();
            System.out.println("Let's play Guess the Number!\n");
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            theGuess.setDiff(input.nextInt());
            input.nextLine();

            // Call the random number function
            theGuess.generateNumber(theGuess.diff);

            do
            {
                System.out.print("I have my number. What's your guess? ");
                value = input.nextLine();
                tryAgain = false;
                try
                {
                    theGuess.setMyGuess(Integer.parseInt(value));
                    theGuess.guessCount++;
                } catch (NumberFormatException ex) {
                    tryAgain = true;
                    theGuess.guessCount++;
                }
            } while (tryAgain);


            if(theGuess.myGuess != theGuess.randomNum)
            {
                do
                {
                    if (theGuess.myGuess < theGuess.randomNum)
                    {
                        do
                        {
                            System.out.print("Too low. Guess again: ");
                            value = input.nextLine();
                            tryAgain = false;
                            try
                            {
                                theGuess.setMyGuess(Integer.parseInt(value));
                                theGuess.guessCount++;
                            } catch (NumberFormatException ex) {
                                tryAgain = true;
                                theGuess.guessCount++;
                            }
                        } while (tryAgain);


                    }
                    if (theGuess.myGuess > theGuess.randomNum)
                    {
                        do
                        {
                            System.out.print("Too high. Guess again: ");
                            value = input.nextLine();
                            tryAgain = false;
                            try
                            {
                                theGuess.setMyGuess(Integer.parseInt(value));
                                theGuess.guessCount++;
                            } catch (NumberFormatException ex) {
                                tryAgain = true;
                                theGuess.guessCount++;
                            }
                        } while (tryAgain);
                    }
                } while (theGuess.myGuess != theGuess.randomNum);
            }
            System.out.println("You got it in " + theGuess.guessCount + " guesses!\n");

            System.out.print("Do you wish to play again (Y/N)? ");
            String exit = input.nextLine();
            if (exit.equals("y"))
            {
                play_again = true;
            }
            else if (exit.equals("n"))
            {
                System.exit(0);
            }
            System.out.println();
        }
    }
}
