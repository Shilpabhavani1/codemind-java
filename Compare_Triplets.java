import java.util.Scanner;
class Triplets
{
    public static void main(String args[])
    {
        int i,al=0,bo=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
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
                al++;
            }
            else if(a[i]<b[i])
            {
                bo++;
            }
        }
        System.out.print(al+" "+bo);
    }
}