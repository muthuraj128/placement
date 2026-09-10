package looping;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int count=0;
    for(int j=1;j<=s-1;j++)
        {
            if(s%j==0)
            {
                count=count+j;
            }
        }
        System.out.println(count);
        if(s==count)
        {
            System.out.println("It is perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
}
