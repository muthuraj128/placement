package day2_looping;

import java.util.*;
public class multiplication {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter m:");
        int m=sc.nextInt();
        for(int j=1;j<=10;j++){
            for(int i=n;i<=m;i++){
            System.out.print(j+" * "+ i +" = "+(i*j)+" | ");
        }
        System.out.println();
        }
        
    }
}
