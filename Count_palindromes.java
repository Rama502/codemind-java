import java.util.*;
public class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,r,rev,ori,c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
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
                c+=1;
            }
        }
        System.out.println(c);
    }
}