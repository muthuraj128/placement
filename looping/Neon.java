package looping;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter:");
        int n=sc.nextInt();
        int s=n*n;
        int sum=0;
        int ts=s;
        int r=0;
        while(ts!=0)
        {
            r=ts%10;
            sum=sum+r;
            ts=ts/10;
        }
        if(n==sum)
        {
            System.out.println(n+" is Neon number");
        }
        else
        {
            System.out.println(n+" is not a Neon number");
        }

    }
}
