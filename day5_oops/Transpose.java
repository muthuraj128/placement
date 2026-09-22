package day5_oops;

import java.util.Scanner;

public class Transpose {
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size m:");
        int m=sc.nextInt();
        System.out.print("enter the size n:");
        int n=sc.nextInt();
        System.out.println();
        int[][] b=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==(n-1))
                {
                    sum=sum+b[i][j];
                }
                
            }
            System.out.println();
        }
        System.out.print(sum);
    }
}
