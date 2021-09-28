/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stats
{
    private String currentName;
    private List<Integer> list;

    public Stats()
    {
        currentName = "";
        list = new ArrayList<Integer>();
    }

    public void addTime(int time)
    {
        list.add(time);
    }

    public void display()
    {
        String output = list.toString().replace("[","").replace("]", "");
        System.out.println("Numbers: "+ output);
    }

    public double average()
    {
        int i;
        int sum = 0;
        for (i = 0;  i<list.size(); i++)
            sum = sum + list.get(i);

        double avg = 1.0*sum/list.size();
        return round(avg,1);
    }

    public double round(double d, int p)
    {
        return Math.round(d*(Math.pow(10,p)))/(double)(Math.pow(10,p));
    }

    public int max()
    {
        return Collections.max(list);
    }

    public int min()
    {
        return Collections.min(list);
    }

    public double std()
    {
        int i, sum = 0;
        double sd = 0;
        for (i = 0;  i<list.size(); i++)
            sum = sum + list.get(i);

        double avg = 1.0*sum/list.size();

        for ( i = 0; i < list.size(); i++)
        {
             sd = sd + Math.pow((list.get(i) - avg), 2);
        }

        double result = Math.sqrt(sd / list.size());
        return result;
    }
}