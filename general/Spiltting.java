import java.util.Scanner;

public class Spiltting {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%b;
        System.out.println("The number of friends in each teams is "+(a/b)+" and left out is "+(c));
    }
}