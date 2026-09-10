package day2_looping;

import java.util.Scanner;
public class Leftangletriangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int j=1;j<=a;j++){
        for(int i=1;i<=a;i++){
            if((i+j)<=a){
                System.out.print(" ");
            }
            else{System.out.print("*");}
        }
        System.out.println();

    }}
}

