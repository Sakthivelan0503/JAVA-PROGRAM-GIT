import java.util.*;
class arraysub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
             int diff= Math.abs(arr[i]-arr[j]);
             sum+=diff;
        }  
 
        }        System.out.print(sum);

    }
}