/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex32;

public class Guess {
    int myGuess;
    int guessCount;
    int diff;
    int randomNum;

    public Guess(){
        myGuess = 0;
        guessCount = 0;
        diff = 0;
        randomNum = 0;
    }

    public void reset(){
        this.myGuess = 0;
        this.guessCount = 0;
        this.diff = 0;
        this.randomNum = 0;
    }

    // Setters
    public void setDiff(int diff){
        this.diff = diff;
    }

    public void setMyGuess(int myGuess) {
        this.myGuess = myGuess;
    }

    public void generateNumber(int diff){
        if(diff == 1)
        {
            randomNum = difficulty_1();
        }
        else if(diff == 2)
        {
            randomNum = difficulty_2();
        }
        else if(diff == 3)
        {
            randomNum = difficulty_3();
        }
    }
    public int difficulty_1(){
        return (int)Math.floor(Math.random()*(10-1+1)+1);
    }
    public int difficulty_2(){
        return (int)Math.floor(Math.random()*(100-1+1)+1);
    }
    public int difficulty_3(){
        return (int)Math.floor(Math.random()*(1000-1+1)+1);
    }
}
