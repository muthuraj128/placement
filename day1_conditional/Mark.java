package day1_conditional;

import java.util.Scanner;
public class Mark {
    public static void main(String[] args)
    {
        System.out.println("Enter the value:");
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        if(a>90)
        {
            System.out.println("A");
        }
        else if(a>80)
        {
            System.out.println("B");
        }
        else if(a>70)
        {
            System.out.println("C");
        }
        else if(a>60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
