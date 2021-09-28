/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */

package ex24;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Anagram a = new Anagram();

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        a.setString1(input.nextLine());

        System.out.print("Enter the second string: ");
        a.setString2(input.nextLine());

        if(a.isAnagram(a.getString1(), a.getString2())) {
            System.out.println("\"" + a.getString1() + "\"" + " and " + "\"" + a.getString2() + "\"" + " are anagrams.");
        }
        else
            System.out.println("\"" + a.getString1() + "\"" + " and " + "\"" + a.getString2() + "\"" + " are NOT anagrams.");
    }
}