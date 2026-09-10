package day1_conditional;

import java.util.Scanner;
class Reverse {

    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
          
            int a=sc.nextInt();
            int ttemp;
            int r=0;
            int v=a;

            while(v!=0)
            {
                ttemp=v%10;
                r=r*10;
                r=ttemp+r;
                v=v/10;
                
            }
            System.out.print(r);
        }
}

