import java.util.Scanner;

public class Magicnumber {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        int c=a/1000;
        System.out.println(b+c);
    }
}