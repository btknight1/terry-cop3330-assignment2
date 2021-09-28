/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex27;

import ex25.User;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        UserInfo user = new UserInfo();

        System.out.print("Enter the first name: ");
        user.setFirst_name(input.nextLine());

        System.out.print("Enter the last name: ");
        user.setLast_name(input.nextLine());

        System.out.print("Enter the ZIP code: ");
        user.setZip(input.nextLine());

        System.out.print("Enter the employee ID: ");
        user.setId(input.nextLine());

        System.out.print(user.validateInput());
    }
}