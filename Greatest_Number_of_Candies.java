import java.util.*;
public class candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],k,max,p;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        max=0;
        for(int i=0;i<n;i++)
        {
             if(max<a[i])
             {
                 max=a[i];
             }
        }
        for(int i=0;i<n;i++)
        {
            p=k+a[i];
            if(p>=max)
            {
                System.out.print("True"+" ");
            }
            else
            {
                System.out.print("False"+" ");
            }
        }
    }
}