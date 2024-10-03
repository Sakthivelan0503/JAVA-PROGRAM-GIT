import java.util.*;
class fact{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        int qwerty=1;
        for(int i=1;i<=a;i++)
        {
            qwerty*=i;
        }
        System.out.println("Factorial value:"+qwerty);
        int count=0;
        while(a>=5)
        {
            a/=5;
            count+=a;
        }
        System.out.print("Numbef of zeros in the factorial: "+count);
    }
}