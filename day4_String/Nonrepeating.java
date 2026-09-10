package day4_String;

import java.util.Scanner;

public class Nonrepeating {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.length()-1;
        String c=""+a.charAt(0);
        int ch=0;
        for(int i=1;i<=b;i++)
        {
            for(int j=0;j<=c.length()-1;j++)
            {
                if(a.charAt(i)==c.charAt(j))
                {
                    ch=1;
                }
            }
            if(ch==0)
            {
                c=c+a.charAt(i);
            }
            else{
                ch=0;
            }
        }
        int len=c.length();
        int[] finl=new int[len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<=b;j++){
                if(c.charAt(i)==a.charAt(j))
                {
                    finl[i]=finl[i]+1;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            
            if(finl[i]==1){
                System.out.print(c.charAt(i));
                break;
            }
        }
        
    }
}
