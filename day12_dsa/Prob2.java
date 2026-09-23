package day12_dsa;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int m=1;
        int r;
        while(temp!=0){
            r=temp%10;
            if(r==0){
                temp=temp/10;
                continue;
            }
            if(r%2==0){
                m=m*r;
            }
            temp=temp/10;
        }
        System.out.println(m);
    }
}
