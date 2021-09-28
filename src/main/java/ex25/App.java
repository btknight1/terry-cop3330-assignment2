/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex25;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        User user1 = new User("12345");
        User user2 = new User("abcdef");
        User user3 = new User("abc123xyz");
        User user4 = new User("1337h@xor!");

        user1.result(user1.passwordValidator(user1.getPassword()));
        user2.result(user2.passwordValidator(user2.getPassword()));
        user3.result(user3.passwordValidator(user3.getPassword()));
        user4.result(user4.passwordValidator(user4.getPassword()));
    }
}