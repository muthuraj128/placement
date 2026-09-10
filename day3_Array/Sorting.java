package day3_Array;

import java.util.Scanner;

public class Sorting {
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
        {
            if(a[i]>=a[j])
            {
                continue;
            }
            else{
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
                
        }
        for(int i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
    }
}
