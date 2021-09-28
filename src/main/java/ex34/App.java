/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex34;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String delName = "";

        Name nameList = new Name();
        nameList.display();
        System.out.println();

        System.out.print("Enter an employee name to remove: ");
        delName = input.nextLine();
        nameList.delete(delName);
        System.out.println();
        nameList.display();


    }
}
