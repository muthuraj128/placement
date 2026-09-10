package day1_conditional;

import java.util.*;
public class Alphabet {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b[]={'A','E','I','O','U','a','e','i','o','u'};
        int c=1;
        for(int i=0;i<=9;i++){
            if(b[i]==a)
            {
                System.out.println("Vowels");
                c=0;
                break;
            }
                
        }
        if(c==1){System.out.println("Consonent");}
    }
}
