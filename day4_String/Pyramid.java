package day4_String;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int l=1;
        for(int i=1;i<=a;i++)
        {
            l=l+2;
        }
        int mid=(l/2)+1;
        int s=mid;
        int e=mid;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(mid==j || (s<=j&&e>=j)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            s=s-1;
            e=e+1;
            System.out.println();
        }
    }
}
