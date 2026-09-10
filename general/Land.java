import java.util.Scanner;

public class Land {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The required length is "+ (2*a+2*b));
        System.out.println("The required area of carpet is "+ (a*b));
    }
}
