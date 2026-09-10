package day2_looping;

import java.util.*;

class Primerange {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int e=sc.nextInt();
    int count=0;
        for(int i=s;i<=e;i++)
        {  
            if(i==1)
            {
                continue;
            }
            int a=1;
            for(int j=2;j<=i-1;j++)
            {
                
                if(i%j==0)
                {
                    a=0;
                }
            }
            if(a==1)
            {
                System.out.println(i);
                count=count+1;
            }
        }
        System.out.println(count);
    }
    
}
