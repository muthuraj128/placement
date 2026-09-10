package day4_String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        int b=a.length()-1;
        String c="";
        for(int i=b;i>=0;i--){
            c=c+a.charAt(i);
        }
        if(a.equals(c))
        {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    
}
