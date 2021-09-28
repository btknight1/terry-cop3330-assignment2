/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex34;

public class Name
{
    private String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

    public void display()
    {
        int i, count = 0;
        for ( i = 0; i < names.length; i++)
        {
            if(!(names[i].equals("")))
            {
                count++;
            }
        }
        System.out.println("There are " + count + " employees:");

        for (i = 0; i <names.length ; i++)
        {
            if(names[i] != "")
                System.out.println(names[i]);
        }
    }

    public void delete(String delThis)
    {
        int i;
        for ( i = 0; i < names.length; i++)
        {
            if(names[i].equals(delThis))
            {
                names[i] = "";
            }
        }
    }

    public boolean isDeleted(){
        int i;
        boolean del = false;
        for(i=0; i<5; i++)
        {
            if(names[i].equals(""));
                del = true;
        }
        return del;
    }


}
