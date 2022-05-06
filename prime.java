import java.util.*;

public class prime
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int cnt=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                cnt=1;
            }
        }
        if(cnt==0)
        {
            System.out.println("no is prime"+n);
        }
        else
        {
            System.out.println("no is not prime"+n);
        }

    }
}