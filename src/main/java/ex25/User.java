/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex25;

public class User
{
    private String password;

    // Default Constructor
    public User()
    {
        this.password = null;
    }

    // Parameterized Constructor
    public User(String password)
    {
        this.password = password;
    }

    // Method to set password
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    // Method to check password strength
    public int passwordValidator(String password)
    {
        boolean result;

        if(this.veryWeak(password))
        {
            return 0;
        }
        else if(this.weak(password))
        {
            return 1;
        }
        else if(this.strong(password))
        {
            return 2;
        }
        else if(this.veryStrong(password))
        {
            return 3;
        }
        return -1;
    }

    public void result(int num)
    {
        String result = null;
        if (num == 0)
        {
            result = "The password '"+ this.password + "' is a very weak password.";
        }
        else if (num == 1)
        {
            result = "The password '"+ this.password + "' is a weak password.";
        }
        else if (num == 2)
        {
            result = "The password '"+ this.password + "' is a strong password.";
        }
        else if (num == 3)
        {
            result = "The password '"+ this.password + "' is a very strong password.";
        }
        System.out.println(result);
    }

    // A very weak password contains only numbers and is fewer than eight characters.
    public boolean veryWeak(String password)
    {
        try
        {
            int test = Integer.parseInt(password); // Trys to convert string to an int. If it does the whole password is an int.
        }
        catch(NumberFormatException e)
        {
            return false;
        }

        if(password.length() < 8)
            return true;
        else
            return false;
    }

    // A weak password contains only letters and is fewer than eight characters.
    public boolean weak(String password)
    {
        if(password != null && password.matches("^[a-zA-Z]*$") && password.length() < 8)
        {
            return true;
        }
        return false;
    }

    // A strong password contains letters and at least one number and is at least eight characters.
    public boolean strong(String password)
    {
        int numcount = 0;
        int i;
        Boolean isCharNum = (password != null && password.matches("^[a-zA-Z0-9]*$"));

        if(isCharNum)
        {
            for (i = 0; i < password.length(); i++)
            {
                if (Character.isDigit(password.charAt(i)))
                {
                    numcount++;
                }
            }
        }

        if(password.length() >= 8 && numcount >= 1)
            return true;
        else
            return false;

    }

    // A very strong password contains letters, numbers, and special characters and is at least eight characters.
    public boolean veryStrong(String password)
    {
        int numcount = 0;
        int i;
        Boolean isCharNum = (password != null && !(password.matches("^[a-zA-Z0-9]*$")));

        if(isCharNum)
        {
            for (i = 0; i < password.length(); i++)
            {
                if (Character.isDigit(password.charAt(i)))
                {
                    numcount++;
                }
            }
        }

        if(password.length() >= 8 && numcount >= 1)
            return true;
        else
            return false;
    }

}

