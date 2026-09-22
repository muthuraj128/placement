package day10_dsa;

import java.util.Scanner;

public class Uniformitymatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size m:");
        int m=sc.nextInt();
        System.out.print("enter the size n:");
        int n=sc.nextInt();
        int z=0;
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
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
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
            {
                if(b[i][j]==a[i][j]){
                    continue;
                }
                else{
                    System.out.println("no");
                    z=1;
                    break;
                }
            }
        }
        if(z==0){
            System.out.println("yes");
        }
}
}