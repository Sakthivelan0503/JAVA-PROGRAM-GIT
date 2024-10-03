import java.util.*;
public class rat_comsumption {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        rat_comsumption rt=new rat_comsumption();
        int rat=scan.nextInt();
        int unit=scan.nextInt();
        int h=scan.nextInt();
        int hf[]=new int[h];
        for(int i=0;i<h;i++)
            hf[i]=scan.nextInt();
        rt.find(rat,unit,h,hf);
        
    }
    void find(int rat,int unit,int h,int[] hf){

        if(h==0)
        System.out.println(-1+" there in no house");
        int tf=0;
        for(int i=0;i<h;i++)
        tf=tf+hf[i];
        if(tf<=(rat*unit))
            System.out.print(0+" there is no food");

            
            int t=rat*unit;
        int sum=0;
        for(int i=0;i<h;i++){
            if(sum<=t){
                sum=sum+hf[i];
            }
            
            else{
                System.out.print(i);
            break;
            }   
        }
    }
}