import java.util.Scanner;
public class list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,b[],c=0,d=0;
        a=new int[3];
        b=new int[3];
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                c+=1;
            }
            else if(a[i]<b[i])
            {
                d+=1;
            }
        }
        System.out.print(c+" ");
        System.out.print(d+" ");
    }
}