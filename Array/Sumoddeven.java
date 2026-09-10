package Array;
import java.util.*;
public class Sumoddeven {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size:");
        int a=sc.nextInt();
        int[] b=new int[a];
        int e=0;
        int o=0;
        for(int i=0;i<a;i++)
        {
             b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(b[i]%2==0){
                e=e+b[i];

            }
            else{
                o=o+b[i];
            }
        }
        System.out.println("Odd: "+o);
        System.out.println("Even: "+e);
    }
}
