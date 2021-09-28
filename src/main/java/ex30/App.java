/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex30;

public class App {
    public static void main(String[] args)
    {
        int i, j;
        for ( i = 1; i <13 ; i++) {
            for ( j = 1; j <13 ; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.printf("%n");
        }
        Matrix.successful(1);
    }
}