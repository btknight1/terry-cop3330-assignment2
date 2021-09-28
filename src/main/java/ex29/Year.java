package ex29;

public class Year
{
    private double rate_of_return;

    public void setRate_of_return(double rate_of_return) {
        this.rate_of_return = rate_of_return;
    }

    public double getRate_of_return() {
        return rate_of_return;
    }

    public double calcYears(double rate_of_return)
    {
        double years = 72/rate_of_return;
        return years;
    }
}
