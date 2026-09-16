package day8_dsa;

import java.util.Scanner;

public class Matrixmultiplication {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size m:");
        int m=sc.nextInt();
        System.out.print("enter the size n:");
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        int[][] c=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
            {
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++)
            {
                c[i][j]=(a[i][k]*b[k][i])+c[i][j];
            }
        }
    }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
