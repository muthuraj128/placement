package day4_String;

import java.util.Scanner;

public class Logicstring {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        int b=a.length()-1;
        String c="";
        for(int i=b;i>=0;i--){
            if(i%2==0){
                c=c+a.charAt(i+1);
            }
            else{
                c=c+a.charAt(i-1);
            }
            
        }
    
        System.out.println(c);
    }
}
