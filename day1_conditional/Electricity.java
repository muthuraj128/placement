package day1_conditional;

import java.util.*;
public class Electricity {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    if(a<=200)
    {
        System.out.print(a*0.5);
    }
    else if(a<=400)
    {
        System.out.print((a*0.65)+100);
    }
    else if(a<=600)
    {
        System.out.print((a*0.80)+200);
    }
    else
    {
        System.out.print((a*1.25)+425);
    }
}
}
