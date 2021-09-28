/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex37;

import java.util.ArrayList;

public class Pass
{
    private int minLength;
    private int num_special_characters;
    private int num_numbers;
    private int num_letters;
    private int password_size;

    private String str_spec_chars = "!@#$%^&*()"; // 10
    private String str_numbers = "0123456789"; //10
    private String str_letters = "qwertyuiopasdfghjklzxcvbnm"; //26
    private ArrayList<Character> spec_chars;
    private ArrayList<Character> numbers;
    private ArrayList<Character> letters;

    public Pass()
    {
        this.num_special_characters = 0;
        this.num_numbers = 0;
        this.password_size = 0;
        spec_chars = new ArrayList<Character>();
        numbers = new ArrayList<Character>();
        letters = new ArrayList<Character>();

        int i;

        for (i = 0; i <str_spec_chars.length() ; i++)
        {
            spec_chars.add(str_spec_chars.charAt(i));
            numbers.add(str_numbers.charAt(i));
        }

        for (i = 0;  i<26 ; i++)
        {
            letters.add(str_letters.charAt(i));
        }
    }

    public void disp(){
        System.out.println(spec_chars);
        System.out.println(numbers);
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getNum_special_characters() {
        return num_special_characters;
    }

    public void setNum_special_characters(int num_special_characters) {
        this.num_special_characters = num_special_characters;
    }

    public int getNum_numbers() {
        return num_numbers;
    }

    public void setNum_numbers(int num_numbers) {
        this.num_numbers = num_numbers;
    }

    public int getPassword_size() {
        return password_size;
    }

    public void setPassword_size() {
        this.password_size = num_numbers + num_special_characters;
    }

    public void setSpecial_characters(int special_characters) {
        this.num_special_characters = special_characters;
    }

    public void setNumbers(int numbers) {
        this.num_numbers = numbers;
    }

    public String passGen()
    {
        num_letters = num_numbers+num_letters;
        int size = minLength + num_letters + (int)Math.floor(Math.random()*(4-1+1)+1);

        char[] password = new char[size];

        int i;

        for (i = 0; i< password.length; i++)
        {
            password[i] = '~';
        }


        int j;
        int count = 0;
        while (count != num_special_characters)
        {
            int index = (int)Math.floor(Math.random()*((password.length-1)-0+1)+0);
            if(password[index] == '~')
            {
                password[index] = spec_chars.get((int)Math.floor(Math.random()*(9-0+1)+0));
                count++;
            }
        }

        count = 0;
        while (count != num_numbers)
        {
            int index = (int)Math.floor(Math.random()*((password.length-1)-0+1)+0);
            if(password[index] == '~')
            {
                password[index] = numbers.get((int)Math.floor(Math.random()*(9-0+1)+0));
                count++;
            }
        }

        for (i = 0;  i<password.length ; i++)
        {
            if(password[i] == '~')
            {
                password[i] = letters.get((int)Math.floor(Math.random()*(25-0+1)+0));
            }
        }
        String result = String.valueOf(password);
        return result;
    }
}

