/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */

// Exercise 24 - Anagram Checker
package ex24;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    private String string1;
    private String string2;
    private Boolean result;

    public Anagram() {
        this.string1 = null;
        this.string2 = null;
        this.result = false;
    }

    public Anagram(String string1, String string2){
        this.string1 = string1;
        this.string2 = string2;
        this.result = false;
    }

    public boolean isAnagram(String string1, String string2) {
        if(string1.length() != string2.length())
            return false;

        String ls1 = string1.toLowerCase();
        String ls2 = string2.toLowerCase();

        char[] temp1 = ls1.toCharArray();
        char[] temp2 = ls2.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        this.result = Arrays.equals(temp1, temp2);
        return Arrays.equals(temp1, temp2);
    }

    public Boolean getResult() {
        return result;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }
}