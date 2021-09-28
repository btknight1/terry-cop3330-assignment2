/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex35;

import java.util.ArrayList;

public class NameList
{
    private String currentName;
    private ArrayList<String> names;

    public NameList()
    {
        this.currentName = "";
        this.names = new ArrayList<String>();
    }

    public void addName(String name){
        this.names.add(name);
    }

    public String getWinner(){
        if(this.names.size() == 0)
            return "";
        int random_int = random_int();
        String winner = "The winner is... " + this.names.get(random_int) +".";
        return winner;
    }

    public int random_int(){
        return (int)Math.floor(Math.random()*((this.names.size()-1)-0+1)+0);
    }

    public int getSize(){
        return names.size();
    }

}

