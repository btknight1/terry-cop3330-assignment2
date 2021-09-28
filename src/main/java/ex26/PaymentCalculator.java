/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex26;

public class PaymentCalculator {
    private double n; // months
    private double i; // daily rate APR/365
    private double b; // balance
    private double p; // monthly payment
    private double APR;

    public double calculateMonthsUntilPaidOff() {
        setN(-(1/30.0) * (Math.log(1.0 + (b/p) * (1 - Math.pow((1.0 + i),30)))) / (Math.log(1.0 + i)));
        return n;
    }

    public double getAPR() {
        return APR;
    }

    public void setAPR(double APR) {
        this.APR = APR/100.0;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
}
