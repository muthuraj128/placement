package day10_dsa;
import java.util.*;
public class Disariumnumber {
    int power(int a,int b){
        int c=1;
        for(int i=1;i<=b;i++){
            c=c*a;
        }
            return c;
        }
    public static void main(String[] args){
        Disariumnumber obj=new Disariumnumber();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int b;
        int power=1;
        int rev=0;
        int sum=0;
        while(temp!=0){
            rev=rev*10;
            rev=rev+(temp%10);
            temp=temp/10;
        }
        temp=rev;
        while(temp!=0){
            b=temp%10;
            sum=sum+(obj.power(b,power));
            temp=temp/10;
            power+=1;
        }
        if(sum==a){
            System.out.println("it is Disariumnummber");
        }
        else{
            System.out.println("it is not a Disariumnummber");
        }
    }
}
