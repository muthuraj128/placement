package day2_looping;

import java.util.Scanner;

public class Specialnumber {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter m:");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            int a=i%10;
            int b=i/10;
            int sum=((a+b)+(a*b));
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
