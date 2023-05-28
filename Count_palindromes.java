import java.util.*;
public class palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],ori,rev,c,r;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        c=0;
        for(int i=0;i<n;i++)
        {
            ori=a[i];
            rev=0;
            while(a[i]!=0)
            {
                r=a[i]%10;
                a[i]=a[i]/10;
                rev=rev*10+r;
            }
            if(rev==ori)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}