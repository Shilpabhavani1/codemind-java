import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    {
        int n,r,p=1,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            p=p*r;
            s=s+r;
        }
        if(p==s)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}