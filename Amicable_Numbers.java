import java.util.*;
public class candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,p,sum=0;
        n=sc.nextInt();
        p=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==p)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}