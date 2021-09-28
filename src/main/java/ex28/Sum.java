package ex28;

public class Sum
{
    public static int sum(int[] arr)
    {
        int i;
        int sum = 0;
        for (i = 0; i < 5; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
}
