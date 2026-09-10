package Array;

import java.util.Scanner;

public class Centerleaveadd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size m:");
        int m=sc.nextInt();
        System.out.print("enter the size n:");
        int n=sc.nextInt();
        int[][] b=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
            {
                b[i][j]=sc.nextInt();
            }
        }
        int temp=m/2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if(i==temp && j==temp)
                {
                    continue;
                }
                if(i==j){
                   sum=sum+b[i][j];
                }
                
            }
            
        }
        System.out.println(sum);
    }
}
