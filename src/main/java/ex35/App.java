/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex35;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        NameList list = new NameList();
        Scanner input = new Scanner(System.in);
        String nameToAdd = "";
        do
        {
            System.out.print("Enter a name: ");
            nameToAdd = input.nextLine();
            if(!(nameToAdd.equals("")))
                list.addName(nameToAdd);
        }
        while(!(nameToAdd.equals("")));

        String winner = list.getWinner();
        if(winner.equals(""))
            System.exit(0); // No names entered.
        else
            System.out.println(list.getWinner());
    }
}

