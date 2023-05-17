import java.util.*;
public class descending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,flag=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}