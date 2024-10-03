import java.util.*;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0,diff=0;
        for(int i=1;i<=b;i++)
        {
            if(i%a==0)
            sum=sum+i;
            else
            diff=diff+i;
        }
        int result=diff-sum;
        System.out.print(result);

    }
}
