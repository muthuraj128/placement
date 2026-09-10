package day4_String;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        int b=a.length()-1;
        int con=0;
        int v=0;
        for(int i=0;i<=b;i++){
            char c=a.charAt(i);
            if(c=='A' || c=='E' || c=='I'|| c=='O'|| c=='U'|| c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u' ){
                v=v+1;
            }
            else{
                con=con+1;
            }

        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonent: "+con);
    }
}
