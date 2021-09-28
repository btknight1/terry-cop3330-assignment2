/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex33;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        MagicBall mb = new MagicBall();
        String question = "";
        Scanner input = new Scanner(System.in);

        System.out.print("What's your question?\n" + "> ");
        question = input.nextLine();
        System.out.print(mb.genResponse());
    }
}
