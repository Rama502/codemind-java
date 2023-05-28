import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,a[],z,c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        z=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(z==a[i])
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}