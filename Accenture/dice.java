import java.util.Scanner;
class dice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(i+j==a)
                count++;
            }
        }
        System.out.print(count);

    }
} 