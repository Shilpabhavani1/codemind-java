import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,s=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       
        for(i=n-1,j=0;i>=0;i--,j++)
        {
            s=s+(a[i]*((int)Math.pow(2,j)));
        }
       System.out.println(s);
    }
}