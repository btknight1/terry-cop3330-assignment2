/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex37;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Pass myPass = new Pass();

        System.out.print("What's the minimum length? ");
        myPass.setMinLength(input.nextInt());

        System.out.print("How many special characters? ");
        myPass.setNum_special_characters(input.nextInt());

        System.out.print("How many numbers? ");
        myPass.setNum_numbers(input.nextInt());

        myPass.setPassword_size();

        System.out.println("Your password is " + myPass.passGen());

    }
}
