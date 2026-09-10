package day1_conditional;

import java.util.Scanner;

public class Trendynumber {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=100 & a<1000){
        int b=a/10;
        int c=b%10;
        
        if(c%3==0){
            System.out.println("Trendy number");
        }
        else{
            System.out.println("not a Trendy number");
        }

        }
        else{
            System.out.print("It is not 3 digit number");
        }
        
        
    }
}