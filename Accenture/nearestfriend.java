import java.util.*;
class nearestfriend
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i:arr)
        System.out.print(i+"-");


        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
             int diff=Math.abs(arr[i]-arr[i+1]);
             sum+=diff;  
            }
            else if(i>0 && i<n-1)
            {
                int a = Math.abs(arr[i]-arr[i-1]);
 
                int b = Math.abs(arr[i]-arr[i+1]);

                if(a>b)
                {
                    sum=sum+b;
                }else sum+=a;
            }
            else
            {
                int diff=Math.abs(arr[i]-arr[i-1]);
                sum=sum+diff;

            }  
        }
         System.out.println(sum);
    }
}
 