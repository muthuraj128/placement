package day4_String;

import java.util.Scanner;

public class Nonrepeatingsimple {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.length()-1;
        int ch=0;
        for(int i=0;i<=b;i++)
        {
            ch=0;
            for(int j=0;j<=b;j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    ch=ch+1;
                }
            }
            if(ch==1)
            {
                System.out.println(a.charAt(i));
                break;
            }
        }       
    }
}
