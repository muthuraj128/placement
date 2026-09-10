package day3_Array;

import java.util.Scanner;

public class Halfmid {
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        int temp=n/2;
        for(int i=0;i<temp;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=n-1;i>=temp;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
