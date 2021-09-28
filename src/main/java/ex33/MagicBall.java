/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex33;

import java.util.Arrays;
import java.util.List;

public class MagicBall
{
    List<String> answers = Arrays.asList("\nYes", "\nNo", "\nMaybe", "\nAsk again later.");

    public String genResponse()
    {
        int randomNum = (int)Math.floor(Math.random()*(3-0+1)+0);
        return answers.get(randomNum);

    }

}
