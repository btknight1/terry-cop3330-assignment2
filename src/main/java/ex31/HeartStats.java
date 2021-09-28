/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex31;

public class HeartStats {
    double age;
    double restingHR;
    double intensity;


    public void runTest(){
        int i;

        System.out.printf("Resting Pulse: %.0f        Age: %.0f\n" + "\n" +
                "Intensity    | Rate\n" +
                "-------------|--------\n", getRestingHR(), getAge());

        for (i=55; i<96; i=i+5) {
            System.out.printf("%d%%",i);
            System.out.print("          |");
            System.out.printf(" %.0f bpm%n",targetHeartRate(i));
        }
    }

    public double targetHeartRate(int i){
        return ((((220 - age) - restingHR) * i/100) + restingHR);
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getRestingHR() {
        return restingHR;
    }

    public void setRestingHR(double restingHR) {
        this.restingHR = restingHR;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }
}
