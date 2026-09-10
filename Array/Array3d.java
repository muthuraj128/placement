package Array;

import java.util.Scanner;

public class Array3d {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size m:");
        int m=sc.nextInt();
        System.out.print("enter the size n:");
        int n=sc.nextInt();
        System.out.print("enter the size p:");
        int p=sc.nextInt();
        int[][][] b=new int[m][n][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<p;k++){
                b[i][j][k]=sc.nextInt();
            }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<p;k++){
                System.out.println(b[i][j][k]);
                }
            }
        }

    }
    
}
