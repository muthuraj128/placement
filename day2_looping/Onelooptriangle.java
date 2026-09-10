package day2_looping;

import java.util.*;
public class Onelooptriangle {
    public static void main(String[] args)
    {
        String sum="";
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            sum=sum+"*";
            System.out.print(sum);
            System.out.println();
        }
    }
}

